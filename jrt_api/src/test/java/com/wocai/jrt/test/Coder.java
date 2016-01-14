package com.wocai.jrt.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.GenMain;

import com.vteba.ext.codegen.CodeBuilder;
import com.vteba.ext.codegen.DB;
import com.vteba.ext.codegen.KeyType;
import com.vteba.ext.codegen.TempType;

public class Coder {

	public static void main(String[] args) {
		Map<String, String> tableListMap = new HashMap<String, String>();
		//系统设置模块
		tableListMap.put("setting", "系统设置");
		
		//employee模块
		//tableListMap.put("customer", "投后用户");
	//	tableListMap.put("ads", "广告");
//		tableListMap.put("employee_commission", "员工产品佣金");
//		tableListMap.put("employee_commission_history", "员工历史佣金");
//		tableListMap.put("employee_group", "理财团队");
//		tableListMap.put("group_member", "团队成员");
//		tableListMap.put("employee_visit", "员工回访");
//		tableListMap.put("checkin", "员工签到");
//		tableListMap.put("employee_calendar", "员工工作日历");
//		tableListMap.put("calendar_detail", "员工工作日历明细");
		
		//stock模块
//		tableListMap.put("stock", "股票");
//		tableListMap.put("stock_blacklist", "禁买股");
//		tableListMap.put("stock_optional", "我的自选股");
//		tableListMap.put("stock_order_delegate", "股票委托订单");
//		tableListMap.put("stock_order_turnover", "股票成交订单");
		
		//firm模块
//		tableListMap.put("firm", "实盘");
//		tableListMap.put("firm_scheme", "实盘方案");
//		tableListMap.put("firm_stock", "实盘持仓");
		
		// company模块
//		tableListMap.put("company_capital", "公司资金平台");
//		tableListMap.put("company_security_account", "公司证券账户");
		
	    //项目绝对路径
		String rootPath = "C:\\Users\\Administrator\\git\\jrt_api\\jrt_api\\";
		CodeBuilder builder = new CodeBuilder(rootPath, TempType.MyBatisSimpleGeneric);
		builder.setConfigFilePath("src/main/resources/config.properties")
		.setSrcPath("src/main/java/")
		.schema("jrt")
		//.className("AppInfo")// 可以不设
		.setDb(DB.MySQL)// 可以不使用，只要jdbc url是正确的
		.keyType(KeyType.String)
		//.tableDesc("应用配置信息")
		//.tableName("app_info")
		.setTableList(tableListMap)
		.module("com.wocai.jrt.setting")
		.setPojo(false)
		.setMongo(false)
		.setGenAction(false)
        .setGenDao(false)
        .setGenMapper(false)
        .setGenModel(false)
        .setGenService(false)
        .setMybatisShards(false)
        .setMybatisAction(true)
        .setJsonAction(true);
		
		Map<String, List<String>> map = builder.build();

		GenMain.main(map, tableListMap.size(), rootPath);
	}

}
