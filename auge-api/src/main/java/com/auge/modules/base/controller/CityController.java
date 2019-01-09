package com.auge.modules.base.controller;

import com.auge.common.utils.SR;
import com.auge.modules.base.entity.BaseCityEntity;
import com.auge.modules.base.service.BaseCityService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by soya on 2018/4/8.
 */
@RestController
@RequestMapping("base/city")
@Api(value = "城市服务",tags = "基础服务")
public class CityController {

    @Autowired
    private BaseCityService baseCityService;

    @GetMapping()
    @ApiOperation(value = "城市列表")
    public SR<List<BaseCityEntity>> cityList() {
        List<BaseCityEntity> baseCityEntities = baseCityService.selectList(new EntityWrapper<>());
        return SR.ok().setPayload(baseCityEntities);
    }
}
