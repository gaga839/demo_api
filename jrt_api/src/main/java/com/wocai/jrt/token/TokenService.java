package com.wocai.jrt.token;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.crypto.SecretKey;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import com.vteba.cache.redis.RedisService;
import com.vteba.utils.charstr.Char;
import com.vteba.utils.common.PropUtils;
import com.vteba.utils.cryption.DESUtils;
import com.vteba.utils.id.ObjectId;
import com.wocai.jrt.consts.Consts;
import com.wocai.jrt.employee.model.Employee;
import com.wocai.jrt.employee.service.spi.EmployeeService;

/**
 * Token Service实现
 * 
 * @author yinlei
 * @date 2015年7月4日 上午10:53:13
 */
@Named
public class TokenService implements InitializingBean {
	private static final Logger LOGGER = LoggerFactory.getLogger(TokenService.class);
	private static final ConcurrentMap<String, String> TOKEN_CACHE = new ConcurrentHashMap<String, String>();
	private SecretKey secretKey;
	private byte[] iv;

	@Inject
	private RedisService<String, String> redisService;
	
	@Inject
	private EmployeeService employeeServiceImpl;

	/**
	 * 获取用户的TokenId，同时存入Redis中。<br>
	 * 先查redis，如果没有，重新产生一个。再查询本地缓存。还是没有重新产生一个，存入redis。<br>
	 * token的格式是：employeeId+&+时间戳
	 * 
	 * @param employeeId
	 *            员工Id
	 * @return 和员工关联的TokenId
	 */
	public String getToken(String employeeId) {
		// 首先查询redis
		String tokenId = redisService.get(Consts.EMPLOYEE_PREFIX + employeeId);
		if (StringUtils.isBlank(tokenId)) {
			// 没有从redis中获取到，查本地缓存
			tokenId = TOKEN_CACHE.get(Consts.EMPLOYEE_PREFIX + employeeId);
			if (StringUtils.isBlank(tokenId)) {
				// 本地也没有构造新的Token
				TokenBean token = new TokenBean(employeeId, System.currentTimeMillis());
				// 加密token
				tokenId = encrypt(token);
				boolean result = redisService.set(Consts.EMPLOYEE_PREFIX + employeeId, tokenId);
				if (!result) {
					// 保存到redis失败，暂存到本地
					LOGGER.warn("set token to redis error. temporary save at local.");
					TOKEN_CACHE.put(Consts.EMPLOYEE_PREFIX + employeeId, tokenId);
				}
			} else { // 从本地缓存中获取到了，同步本地到redis
				syncLocalTokenCache();
			}
		}
		return tokenId;
	}

	/**
	 * 加密token
	 * 
	 * @param token
	 *            token
	 * @return token的加密字符串表示
	 */
	private String encrypt(TokenBean token) {
		byte[] bytes = token.toString().getBytes(Char.UTF8);
		String tokens = DESUtils.desedeEncrypt(bytes, secretKey, iv);
		return tokens;
	}

	/**
	 * 验证Token的有效性，如果参数为空返回0
	 * 
	 * @param tokenId
	 *            tokenId，token的加密字符串形式
	 * @return 用户的token有效返回1，失效返回0，pad被回收返回-100
	 */
	public int verifyToken(String tokenId) {
		int result = 0;
		if (StringUtils.isBlank(tokenId)) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("tokenId is empty.");
			}
			return result;
		}

		// 解析token，从token中拿到 用户id
		TokenBean tokenBean = parseToken(tokenId);
		String employeeId = tokenBean.getEmployeeId();
		if (StringUtils.isBlank(employeeId)) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("tokenId verify, employeeId is empty.");
			}
			return result;
		}

		Employee employee = employeeServiceImpl.get(employeeId);
		// 没有用户，验证失败
		if (employee == null) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("tokenId verify, employee is null.");
			}
			return result;
		}
		
		// pad被回收，返回-100
		if (StringUtils.isBlank(employee.getPosPadId())) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("tokenId verify, PosPadId is empty.");
			}
			return -100;
		}
		
		String cacheToken = redisService.get(Consts.EMPLOYEE_PREFIX + employeeId);
		if (StringUtils.isBlank(cacheToken)) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("tokenId verify, redis cache is empty.");
			}
			// 从本地查询一次
			cacheToken = TOKEN_CACHE.get(Consts.EMPLOYEE_PREFIX + employeeId);
			if (StringUtils.isBlank(cacheToken)) {
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("tokenId verify, local cache is empty, return 0.");
				}
				return result;
			} else { // 查询到了，同步一次，尽量将数据同步到redis
				if (LOGGER.isInfoEnabled()) {
					LOGGER.info("tokenId verify success, sync local cache.");
				}
				syncLocalTokenCache();
			}
		}

		// 比较字符串是否相等，是可以的，因为算法固定，字符串相等，那么解密后的值也是相等的
		if (cacheToken.equals(tokenId)) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("tokenId verify success.");
			}
			result = 1;
		}
		return result;
	}

	/**
	 * 解析token
	 * 
	 * @param tokenId
	 *            token的加密字符串形式
	 * @return 解密后的token对象
	 */
	private TokenBean parseToken(String tokenId) {
		String token = DESUtils.desedeDecrypt(tokenId, secretKey, iv);
		TokenBean tokenBean = new TokenBean(token);
		return tokenBean;
	}

	/**
	 * 同步本地缓存到redis，这个是为了，防止不能将数据写入redis的，暂时保存在本地了。
	 */
	private void syncLocalTokenCache() {
		for (Entry<String, String> entry : TOKEN_CACHE.entrySet()) {
			String userKey = entry.getKey();
			String token = entry.getValue();
			boolean ret = redisService.set(userKey, token);
			if (ret) { // 同步成功，删除本地缓存
				LOGGER.info("sync local token cache to redis success [{}].", userKey);
				TOKEN_CACHE.remove(userKey);
			}
		}
	}

	public static void main(String[] aa) {
		byte[] bytes = "46730581".getBytes();
		System.out.println(bytes);

		SecretKey key = DESUtils.genDesedeKey("asdfjklajsaddddduiyuyu24");

		byte[] iv = { 98, -1, 78, 22, 1, -32, -101, 3 };
		long d = System.currentTimeMillis();
		String userId = ObjectId.get().toHexString();
		String token = userId + "&" + d;
		System.out.println(token);
		// token = DESUtils.desedeEncrypt(token.getBytes(Char.UTF8));
		token = DESUtils.desedeEncrypt(token.getBytes(Char.UTF8), key, iv);
		System.out.println(token);

		token = DESUtils.desedeDecrypt(token, key, iv);
		System.out.println(token);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		String saltValue = PropUtils.get(Consts.TOKEN_SALT);
		secretKey = DESUtils.genDesedeKey(saltValue);

		String ivs = PropUtils.get(Consts.TOKEN_IV);
		byte[] ivBytes = ivs.getBytes(Char.UTF8);
		iv = ivBytes;
	}
}
