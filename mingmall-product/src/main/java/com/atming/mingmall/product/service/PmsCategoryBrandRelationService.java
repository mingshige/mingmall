package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsCategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:04
 */
public interface PmsCategoryBrandRelationService extends IService<PmsCategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

