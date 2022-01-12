package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsSkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:04
 */
public interface PmsSkuSaleAttrValueService extends IService<PmsSkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

