package com.auge.modules.field.controller;

import com.auge.common.UserInfo;
import com.auge.common.utils.SR;
import com.auge.common.utils.SuppBeanUtils;
import com.auge.common.validator.ValidatorUtils;
import com.auge.common.validator.group.AddGroup;
import com.auge.modules.field.dto.FieldProfileSaveReqDto;
import com.auge.modules.field.entity.FieldProfileEntity;
import com.auge.modules.field.service.FieldProfileService;
import com.baomidou.mybatisplus.plugins.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

/**
 * 场地
 */
@Api(tags = "场地")
@RestController
@RequestMapping("field/profile")
public class FieldProfileController {
    @Autowired
    private FieldProfileService fieldProfileService;

    @ApiOperation("获取场地列表")
    @GetMapping
    public SR<List<FieldProfileEntity>> list() {
        Page<FieldProfileEntity> fieldProfileEntityPage = fieldProfileService.selectPage(new Page<>());
        return SR.ok().setPagePayLoad(fieldProfileEntityPage);
    }

    @ApiOperation("保存场地信息")
    @PostMapping
    public SR save(@RequestBody FieldProfileSaveReqDto fieldProfileSaveReqDto, @ApiIgnore UserInfo userInfo) {

        ValidatorUtils.validateEntity(fieldProfileSaveReqDto, AddGroup.class);

        String startTimeBusiness = fieldProfileSaveReqDto.getStartTimeBusiness();
        String endTimeBusiness = fieldProfileSaveReqDto.getEndTimeBusiness();

        fieldProfileSaveReqDto.setStartTimeBusiness(null);
        fieldProfileSaveReqDto.setEndTimeBusiness(null);

        FieldProfileEntity fieldProfileEntity = SuppBeanUtils.copy(fieldProfileSaveReqDto, FieldProfileEntity.class);

        fieldProfileEntity.setStartTimeBusiness(Time.valueOf(startTimeBusiness));
        fieldProfileEntity.setEndTimeBusiness(Time.valueOf(endTimeBusiness));

        fieldProfileEntity.setUserId(userInfo.getId());

        fieldProfileService.insert(fieldProfileEntity);
        return SR.ok();
    }



}
