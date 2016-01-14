package com.wocai.jrt.product.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.wocai.jrt.product.dao.ProductAttachmentDao;
import com.wocai.jrt.product.model.ProductAttachment;
import com.wocai.jrt.product.model.ProductAttachmentBean;
import com.wocai.jrt.product.service.spi.ProductAttachmentService;

import com.vteba.service.generic.impl.MyBatisServiceImpl;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;

/**
 * 产品附件相关的service业务实现。
 * @author yinlei
 * @date 2015-9-6 19:32:34
 */
@Named
public class ProductAttachmentServiceImpl extends MyBatisServiceImpl<ProductAttachment, ProductAttachmentBean, String> implements ProductAttachmentService {
	// 添加了方法后，记得改为private
	protected ProductAttachmentDao productAttachmentDao;
	
	@Override
	@Inject
	public void setBaseDao(BaseDao<ProductAttachment, ProductAttachmentBean, String> productAttachmentDao) {
		this.baseDao = productAttachmentDao;
		this.productAttachmentDao = (ProductAttachmentDao) productAttachmentDao;
	}
}
