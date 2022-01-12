package com.atming.mingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atming.common.utils.PageUtils;
import com.atming.mingmall.product.entity.PmsAttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:05
 */
public interface PmsAttrGroupService extends IService<PmsAttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

