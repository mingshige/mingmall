package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsSkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:04
 */
public interface PmsSkuImagesService extends IService<PmsSkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

