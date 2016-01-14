package com.wocai.jrt.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.audience.AudienceTarget;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;

import com.alibaba.fastjson.JSON;
import com.vteba.utils.common.PropsUtils;
import com.wocai.jrt.message.model.PayMessage;

/**
 * 极光推送Utils类
 * 
 * @author zhangyz
 * @date 2015年8月4日 下午4:39:29
 */
public class MessagePush {

	protected static final Logger LOG = LoggerFactory.getLogger(MessagePush.class);

	// 需要将应用key和主密码配置在配置文件中
	private static final String appKey = PropsUtils.get("appKey");
	private static final String masterSecret = PropsUtils.get("masterSecret");
	private static final String cusAppKey = PropsUtils.get("cusAppKey");
	private static final String cusMasterSecret = PropsUtils.get("cusMasterSecret");
	private static final boolean isProductEnvironment = Boolean.parseBoolean(PropsUtils.get("isProductEnvironment"));
	
	private JPushClient jpushClient;
	private String title;
	private String message;
	private int badge;
	
	public MessagePush(String message) {

		this.message = message;
		jpushClient = new JPushClient(masterSecret, appKey, 3);
	}
	
	public MessagePush(String message, String title,int badge) {
		this.title = title;
		this.message = message;
		this.badge = badge;
		jpushClient = new JPushClient(cusMasterSecret, cusAppKey, 3); 
	}
	
	public MessagePush(String message, String title) {
		this(message);
		this.title = title;
	}

	/**
	 * 向所有人发送消息
	 * 
	 * @return 消息id
	 */
	public long sendPushAll() {
		PushPayload payload = buildPushObject_all_all_alert();
		long msgId = 0;
		try {
			PushResult result = jpushClient.sendPush(payload);
			msgId = result.msg_id;
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			msgId = e.getMsgId();
		}
		return msgId;
	}

	/**
	 * 向安卓指定别名的客户端发送消息
	 * 
	 * @param alias
	 *            所有别名信息集合，这里表示发送所有学生编号
	 * @return 消息id
	 */
	public long sendPushAlias(Set<String> alias) {
		PushPayload payloadAlias = buildPushObject_android_alias_alertWithTitle(alias);
		long msgId = 0;
		try {
			PushResult result = jpushClient.sendPush(payloadAlias);
			msgId = result.msg_id;
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			msgId = e.getMsgId();
		}
		return msgId;
	}
	
	/**
	 * 向ios指定别名的客户端发送消息
	 * 
	 * @param alias
	 *            所有别名信息集合，这里表示发送所有学生编号
	 * @return 消息id
	 */
	public long sendPushIosAlias(Set<String> alias) {
		PushPayload payloadAlias = buildPushObject_ios_alias_alertWithTitle(alias);
		long msgId = 0;
		try {
			PushResult result = jpushClient.sendPush(payloadAlias);
			msgId = result.msg_id;
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			msgId = e.getMsgId();
		}
		return msgId;
	}
	
	/**
	 * 向ios指定组别的客户端发送消息
	 * 
	 * @param tag
	 *            所有别名信息集合，这里表示发送所有学生编号
	 * @return 消息id
	 */
	public long sendPushIosTag(Set<String> tag) {
		PushPayload payloadAlias = buildPushObject_ios_tag_alertWithTitle(tag);
		long msgId = 0;
		try {
			PushResult result = jpushClient.sendPush(payloadAlias);
			msgId = result.msg_id;
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			msgId = e.getMsgId();
		}
		return msgId;
	}
	
	/**
	 * 向指定组发送消息
	 * 
	 * @param tag
	 *            组名称
	 * @return 消息id
	 */
	public long sendPushTag(String tag) {
		PushPayload payloadtag = buildPushObject_android_tag_alertWithTitle(tag);
		long msgId = 0;
		try {
			PushResult result = jpushClient.sendPush(payloadtag);
			msgId = result.msg_id;
			LOG.info("Got result - " + result);
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			msgId = e.getMsgId();
		}
		return msgId;
	}
	
	/**
	 * 向投后指定组别和指定别名的所有平台发送消息
	 * 
	 * @param tag
	 *            组名称
	 * @return 消息id
	 */
	public long sendCusPushTag(String tag,String aliens) {
		PushPayload payloadtag = buildPushObject_ios_tag_and_alien_alertWithTitle(tag,aliens);
		PushPayload androidpayload = buildPushObject_android_tag_and_alien_alertWithTitle(tag,aliens);
		long msgId = 0;
		try {
			PushResult result = jpushClient.sendPush(payloadtag);
			msgId = result.msg_id;
			LOG.info("Got result - " + result);
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			msgId = e.getMsgId();
		}
		try {
			PushResult result = jpushClient.sendPush(androidpayload);
			msgId = result.msg_id;
			LOG.info("Got result - " + result);
		} catch (APIConnectionException e) {
			LOG.error("Connection error. Should retry later. ", e);
		} catch (APIRequestException e) {
			LOG.info("HTTP Status: " + e.getStatus());
			LOG.info("Error Code: " + e.getErrorCode());
			LOG.info("Error Message: " + e.getErrorMessage());
			LOG.info("Msg ID: " + e.getMsgId());
			msgId = e.getMsgId();
		}
		return msgId;
	}
	
	/**
	 * 向安卓平台指定别名的客户端发送消息
	 * 
	 * @param alias
	 *            别名集合
	 * @return 消息id
	 */
	public PushPayload buildPushObject_android_alias_alertWithTitle(Set<String> alias) {
		return PushPayload.newBuilder().setPlatform(Platform.android())
				.setAudience(Audience.alias(alias))
				.setNotification(Notification.android(message, title, null)).build();
	}
	
	/**
	 * 向ios平台指定别名的客户端发送消息
	 * @param alias
	 *            别名集合
	 * @return 消息id
	 */
	public PushPayload buildPushObject_ios_alias_alertWithTitle(Set<String> alias) {
		 return PushPayload.newBuilder()
	                .setPlatform(Platform.ios())
	                .setAudience(Audience.alias(alias))
	                .setNotification(Notification.alert(message))
	                .build();
	}
	
	/**
	 * 向ios平台指定组别的客户端发送消息
	 * @param alias
	 *            别名集合
	 * @return 消息id
	 */
	public PushPayload buildPushObject_ios_tag_alertWithTitle(Set<String> tag) {
		 return PushPayload.newBuilder()
	                .setPlatform(Platform.ios())
	                .setAudience(Audience.tag(tag))
	                .setNotification(Notification.alert(message))
	                .build();
	}
	/**
	 * 向安卓平台指定组名称的客户端发送消息
	 * 
	 * @param tag
	 *            组名称
	 * @return 消息id
	 */
	public PushPayload buildPushObject_android_tag_alertWithTitle(String tag) {
		return PushPayload.newBuilder().setPlatform(Platform.android())
				.setAudience(Audience.tag(tag))
				.setNotification(Notification.android(message, title, null)).build();
	}
	
	/**
	 * 向投后IOS平台指定组名称和指定别名的客户端发送消息
	 * @param tag 组名称
     * @return 消息id
	 */
	public PushPayload buildPushObject_ios_tag_and_alien_alertWithTitle(String tag,String aliens) {
		if(isProductEnvironment){
			return PushPayload.newBuilder().setPlatform(Platform.ios())
					.setAudience(Audience.newBuilder()
	                        .addAudienceTarget(AudienceTarget.tag(tag))
	                        .addAudienceTarget(AudienceTarget.alias(aliens))
	                        .build())
	                .setNotification(Notification.newBuilder()
	                        .addPlatformNotification(IosNotification.newBuilder()
	                        .setAlert(message)
	                        .setBadge(badge)
	                        .build()).build())
	                .setOptions(Options.newBuilder()
	                		.setApnsProduction(true)
	                		.build())
	                .build();
		}else{
			return PushPayload.newBuilder().setPlatform(Platform.all())
					.setAudience(Audience.newBuilder()
	                        .addAudienceTarget(AudienceTarget.tag(tag))
	                        .addAudienceTarget(AudienceTarget.alias(aliens))
	                        .build())
	                .setNotification(Notification.newBuilder()
	                        .addPlatformNotification(IosNotification.newBuilder()
	                        .setAlert(message)
	                        .setBadge(badge)
	                        .build()).build())
	                .build();
		}
	}
	
	/**
	 * 向投后android平台指定组名称和指定别名的客户端发送消息
	 * @param tag 组名称
     * @return 消息id
	 */
	public PushPayload buildPushObject_android_tag_and_alien_alertWithTitle(String tag,String aliens) {
		if(isProductEnvironment){
			return PushPayload.newBuilder().setPlatform(Platform.android())
					.setAudience(Audience.newBuilder()
	                        .addAudienceTarget(AudienceTarget.tag(tag))
	                        .addAudienceTarget(AudienceTarget.alias(aliens))
	                        .build())
	                .setNotification(Notification.newBuilder()
	                        .addPlatformNotification(AndroidNotification.newBuilder()
	                        .setAlert(message)
	                        .build()).build())
	                .setOptions(Options.newBuilder()
	                		.setApnsProduction(true)
	                		.build())
	                .build();
		}else{
			return PushPayload.newBuilder().setPlatform(Platform.android())
					.setAudience(Audience.newBuilder()
	                        .addAudienceTarget(AudienceTarget.tag(tag))
	                        .addAudienceTarget(AudienceTarget.alias(aliens))
	                        .build())
	                .setNotification(Notification.newBuilder()
	                        .addPlatformNotification(AndroidNotification.newBuilder()
	                        .setAlert(message)
	                        .build()).build())
	                .build();
		}
	}
	
	/**
	 * 向所有平台客户端发送消息
	 * 
	 * @return 消息id
	 */
	public PushPayload buildPushObject_all_all_alert() {
		return PushPayload.alertAll(message);
	}

	public void sendPayMessage(PayMessage payMessage) {
		try {
			Map<String, String> extras = new HashMap<String, String>();
			extras.put("type", payMessage.getType());
			extras.put("state", payMessage.getState());
			extras.put("data", payMessage.getData());

			jpushClient.sendAndroidMessageWithAlias("pay callback", JSON.toJSONString(extras),
					payMessage.getAlias());
			
		} catch (APIConnectionException | APIRequestException e) {
			LOG.error("sendPayMessage error, msg = [{}]", e.getMessage());
		}
	}

	public static void main(String[] args) {
		/*// 需要在客户端onCreate时将机构id作为客户端设备的标签、将员工id作为其客户端设备别名.
		MessagePush messagePush = new MessagePush("跌 停了", "牛市");
		// messagePush.sendPushTag("qwer");
		Set<String> alias = new HashSet<String>();
		alias.add("asdf");
		messagePush.sendPushAlias(alias);*/
		
		//投后App极光推送测试
	    MessagePush messageCusPush = new MessagePush("测试消息1", "消息",1);
		Set<String> alias = new HashSet<String>();
		alias.add("5649a3249623603a9510fa12");
		Set<String> tag = new HashSet<String>();
		tag.add("562ef2c7261879dc315deea3");
		//messageCusPush.sendPushIosAlias(alias);
		//messageCusPush.sendPushIosTag(tag);
		messageCusPush.sendCusPushTag("562ef2c7261879dc315deea3","5649a3249623603a9510fa12");
		//messageCusPush.sendPushAll();
	
	}
}