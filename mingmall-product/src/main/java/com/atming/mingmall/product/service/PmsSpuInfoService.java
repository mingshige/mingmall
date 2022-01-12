package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsSpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:05
 */
public interface PmsSpuInfoService extends IService<PmsSpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

