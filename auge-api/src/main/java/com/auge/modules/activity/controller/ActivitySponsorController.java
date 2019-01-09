package com.auge.modules.activity.controller;

import com.auge.common.UserInfo;
import com.auge.common.utils.SR;
import com.auge.common.utils.SuppBeanUtils;
import com.auge.common.utils.ValidationUtils;
import com.auge.common.validator.ValidatorUtils;
import com.auge.common.validator.group.AddGroup;
import com.auge.modules.activity.dto.ActivitySponsorSaveReqDto;
import com.auge.modules.activity.dto.ActivitySponsorSaveResDto;
import com.auge.modules.activity.entity.ActivitySponsorEntity;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.auge.modules.activity.service.ActivitySponsorService;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;


/**
 * 活动主办方
 *
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@RestController
@RequestMapping("activity/sponsor")
@Api(tags = "活动")
public class ActivitySponsorController {
    @Autowired
    private ActivitySponsorService activitySponsorService;

    @PostMapping
    @ApiOperation("保存主办方")
    public SR<ActivitySponsorSaveResDto> save(@RequestBody ActivitySponsorSaveReqDto dto,@ApiIgnore UserInfo userInfo){

        ValidatorUtils.validateEntity(dto, AddGroup.class);

        ActivitySponsorEntity activitySponsorEntity = SuppBeanUtils.copy(dto, ActivitySponsorEntity.class);
        activitySponsorEntity.setUserId(userInfo.getId());
        activitySponsorService.insert(activitySponsorEntity);
        return SR.ok().setPayload(activitySponsorEntity.getId());
    }


    @GetMapping
    @ApiOperation("获取当前用户主办方")
    public SR<List<ActivitySponsorEntity>> save(@ApiIgnore UserInfo userInfo){

        ActivitySponsorEntity querier = new ActivitySponsorEntity();
        querier.setUserId(userInfo.getId());
        querier.setValid(true);
        EntityWrapper<ActivitySponsorEntity> wrapper = new EntityWrapper<>(querier);
        List<ActivitySponsorEntity> activitySponsorEntities = activitySponsorService.selectList(wrapper);
        return SR.ok().setPayload(activitySponsorEntities);
    }
}
