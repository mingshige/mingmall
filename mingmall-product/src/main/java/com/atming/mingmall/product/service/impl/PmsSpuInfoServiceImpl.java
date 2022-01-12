package com.atming.mingmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atming.common.utils.PageUtils;
import com.atming.common.utils.Query;

import com.atming.mingmall.product.dao.PmsSpuInfoDao;
import com.atming.mingmall.product.entity.PmsSpuInfoEntity;
import com.atming.mingmall.product.service.PmsSpuInfoService;


@Service("pmsSpuInfoService")
public class PmsSpuInfoServiceImpl extends ServiceImpl<PmsSpuInfoDao, PmsSpuInfoEntity> implements PmsSpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfoEntity> page = this.page(
                new Query<PmsSpuInfoEntity>().getPage(params),
                new QueryWrapper<PmsSpuInfoEntity>()
        );

        return new PageUtils(page);
    }

}