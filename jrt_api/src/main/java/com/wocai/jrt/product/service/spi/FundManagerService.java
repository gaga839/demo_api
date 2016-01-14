package com.wocai.jrt.product.service.spi;

import java.util.List;

import com.wocai.jrt.product.model.FundManager;
import com.wocai.jrt.product.model.FundManagerBean;
import com.vteba.service.generic.MyBatisService;

/**
 * 基金经理相关的业务service接口。
 * @author yinlei
 * @date 2015-12-1 11:25:30
 */
public interface FundManagerService extends MyBatisService<FundManager, FundManagerBean, String> {
	List<FundManager> getFunManager(String productId);

}
