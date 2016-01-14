package com.wocai.jrt.utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vteba.utils.common.PropsUtils;
import com.vteba.utils.cryption.CryptUtils;

public class SmsUtils {
	private static final Logger LOGGER = LoggerFactory.getLogger(SmsUtils.class);
	private static final int TIMEOUT = 10 * 1000;
	private static HttpHost httpHost = null;
	private static String contextPath;
	private static String cid;
	private static String key;
	private static String prefix;

	static {
		String hostName = PropsUtils.get("sms.host");
		int port = PropsUtils.getInt("sms.port");
		String schema = PropsUtils.get("sms.scheme", "http");
		contextPath = PropsUtils.get("sms.context", "/SmsAPI");
		cid = PropsUtils.get("sms.cid");
		key = PropsUtils.get("sms.key");
		prefix = PropsUtils.get("sms.prefix");
		httpHost = new HttpHost(hostName, port, schema);
	}

	/**
	 * 发送短信
	 * @param mobile 手机号码，多个以英文逗号隔开
	 * @param content 发送的内容，最多300个字符
	 * @return 发送结果，成功：true,12992（短信编号）；失败：false,签名无效（错误原因）
	 */
	public static String send(String mobile, String content) {
		StringBuilder data = new StringBuilder();
		data.append(cid).append(prefix).append(content).append(mobile)
				.append(key);

		String sign = CryptUtils.md5(data.toString()).toUpperCase();
		LOGGER.info(sign);

		Map<String, String> params = new HashMap<String, String>();
		params.put("cid", cid);
		params.put("content", prefix + content);
		params.put("mobile", mobile);
		params.put("sign", sign);
		
		HttpPost post = buildHttpPost(params, "/SendSms");
		
		byte[] bytes = resolve(post, 1);
		String result = new String(bytes);
		return result;
	}

	/**
	 * 发起http请求，返回字节数组
	 * 
	 * @param httpPost
	 *            HttpPost
	 * @param type
	 *            可以扩展
	 * @return byte[]
	 */
	private static byte[] resolve(final HttpPost httpPost, int type) {
		byte[] bytes = null;
		try {
			HttpHost host = null;
			if (type == 1) {
				host = httpHost;
			}
			// 创建客户端
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			// 发起调用
			CloseableHttpResponse httpResponse = httpClient.execute(host,
					httpPost);
			int status = httpResponse.getStatusLine().getStatusCode();
			if (status == 200) {// 结果正常
				bytes = EntityUtils.toByteArray(httpResponse.getEntity());
			} else {// 结果异常
				LOGGER.error("请求的urlPath错误[{}]，响应码是[{}]", httpPost.getURI()
						.toString(), status);
			}
			httpResponse.close();
			httpClient.close();
		} catch (ClientProtocolException e) {
			LOGGER.error("[{}]请求，客户端协议错误。", httpPost.getURI().toString(),
					e.getMessage());
		} catch (IOException e) {
			LOGGER.error("[{}]请求IO错误。", httpPost.getURI().toString(), e);
		}
		return bytes;
	}

	/**
	 * 根据请求参数和请求url地址，构建http post请求。
	 * 
	 * @param params
	 *            请求参数
	 * @param urlPath
	 *            请求url地址
	 * @return HttpPost实例
	 */
	private static HttpPost buildHttpPost(final Map<String, String> params,
			final String urlPath) {
		// 构建请求uri
		URI uri = null;
		try {
			URIBuilder uriBuilder = new URIBuilder();
			// 设置参数
			for (Entry<String, String> entry : params.entrySet()) {
				uriBuilder.setParameter(entry.getKey(), entry.getValue());
			}
			// 设置请求的路径
			uriBuilder.setPath(contextPath + urlPath);
			uri = uriBuilder.build();
		} catch (URISyntaxException e1) {
			LOGGER.error("HttpClient创建URI错误。可能传递的参数错误。", e1.getMessage());
			return null;
		}

		// 设置post请求
		HttpPost httpPost = new HttpPost(uri);

		RequestConfig config = RequestConfig.custom().setSocketTimeout(TIMEOUT)
				.setConnectTimeout(TIMEOUT).build();
		httpPost.setConfig(config);
		return httpPost;
	}
}
