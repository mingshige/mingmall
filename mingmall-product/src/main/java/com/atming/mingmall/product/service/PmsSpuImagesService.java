package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsSpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:05
 */
public interface PmsSpuImagesService extends IService<PmsSpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

