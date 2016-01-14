package com.wocai.jrt.product.service.spi;

import com.wocai.jrt.product.model.ProductAttachment;
import com.wocai.jrt.product.model.ProductAttachmentBean;

import com.vteba.service.generic.MyBatisService;

/**
 * 产品附件相关的业务service接口。
 * @author yinlei
 * @date 2015-9-6 19:32:34
 */
public interface ProductAttachmentService extends MyBatisService<ProductAttachment, ProductAttachmentBean, String> {

}
