package com.wocai.jrt.product.dao;

import com.vteba.tx.jdbc.mybatis.annotation.DaoMapper;
import com.vteba.tx.jdbc.mybatis.spi.BaseDao;
import com.wocai.jrt.product.model.ProductAttachment;
import com.wocai.jrt.product.model.ProductAttachmentBean;

/**
 * 表product_attachment的MyBatis Dao Mapper。
 * 由代码工具自动生成，可以新增方法，但是不要修改自动生成的方法。
 * @date 2015-09-06 19:32:34
 */
@DaoMapper
public interface ProductAttachmentDao extends BaseDao<ProductAttachment, ProductAttachmentBean, String> {
}