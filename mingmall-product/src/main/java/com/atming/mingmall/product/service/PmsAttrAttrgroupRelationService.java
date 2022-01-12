package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsAttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:05
 */
public interface PmsAttrAttrgroupRelationService extends IService<PmsAttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

