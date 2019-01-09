package com.auge.modules.field.controller;

import com.auge.common.utils.SR;
import com.auge.modules.field.entity.FieldRentEntity;
import com.auge.modules.field.service.FieldRentService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 场地租赁信息
 */
@Api(tags = "场地")
@RestController
@RequestMapping("field/rent")
public class FieldRentController {
    @Autowired
    private FieldRentService fieldRentService;

    @ApiOperation("获取租赁列表")
    @GetMapping
    public SR<List<FieldRentEntity>> list() {
        List<FieldRentEntity> fieldRentEntities = fieldRentService.selectList(new EntityWrapper<>(new FieldRentEntity()));
        return SR.ok().setPayload(fieldRentEntities);
    }

}
