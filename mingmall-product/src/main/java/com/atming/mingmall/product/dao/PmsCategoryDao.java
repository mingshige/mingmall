package com.atming.mingmall.product.dao;

import com.atming.mingmall.product.entity.PmsCategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-11-08 10:01:05
 */
@Mapper
public interface PmsCategoryDao extends BaseMapper<PmsCategoryEntity> {
	
}
