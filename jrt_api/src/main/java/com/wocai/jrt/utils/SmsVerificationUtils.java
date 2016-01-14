package com.wocai.jrt.utils;

import com.vteba.cache.redis.RedisService;
import com.vteba.utils.common.PropsUtils;

/****
 * 
 * @author linbaolu
 * @date 2015年9月12日 下午12:49:46
 */
public class SmsVerificationUtils {
	public static final String INVESTOR_AUTH = "investorAuth";
	public static final String CONTEXT = PropsUtils.get("sms.message");
	public static final long TIMEOUT = PropsUtils.getLong("sms.timeout");

	private SmsVerificationUtils() {
	}

	/***
	 * 发送短信验证码
	 * 
	 * @param mobile
	 * @param type
	 * @return
	 */
	public static boolean sendSms(RedisService<String, String> redisService, String mobile,
			String type) {
//		if (null != redisService.get(type + mobile)) {
//			return true;
//		}

		String authCode = String.valueOf((int) (Math.random() * 9000 + 1000));
		String content = CONTEXT.replace("#", authCode);
		String result = SmsUtils.send(mobile, content);
		if (null != result && result.startsWith("true")) {
			String key = type + mobile;
			redisService.set(key, authCode, TIMEOUT);// TimeUnit.SECONDS,缓存10分钟
			return true;
		}

		return false;
	}

	/***
	 * 检测短信验证码
	 * 
	 * @param mobile
	 * @param type
	 * @param authCode
	 * @return
	 */
	public static boolean check(RedisService<String, String> redisService, String mobile,
			String type, String authCode) {
		String key = type + mobile;
		if (null != authCode && authCode.equals(redisService.get(key))) {
			return true;
		}

		return false;
	}

}
