package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsBrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:05
 */
public interface PmsBrandService extends IService<PmsBrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

