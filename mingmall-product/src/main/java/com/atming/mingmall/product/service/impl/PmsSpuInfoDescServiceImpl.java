package com.atming.mingmall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atming.common.utils.PageUtils;
import com.atming.common.utils.Query;

import com.atming.mingmall.product.dao.PmsSpuInfoDescDao;
import com.atming.mingmall.product.entity.PmsSpuInfoDescEntity;
import com.atming.mingmall.product.service.PmsSpuInfoDescService;


@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDescEntity> implements PmsSpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfoDescEntity> page = this.page(
                new Query<PmsSpuInfoDescEntity>().getPage(params),
                new QueryWrapper<PmsSpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}