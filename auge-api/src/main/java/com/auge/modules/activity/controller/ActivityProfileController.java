package com.auge.modules.activity.controller;

import com.auge.common.UserInfo;
import com.auge.common.utils.SR;
import com.auge.common.validator.ValidatorUtils;
import com.auge.common.validator.group.AddGroup;
import com.auge.modules.activity.dto.ActivityProfileResDto;
import com.auge.modules.activity.dto.ActivityProfileSaveReqDto;
import com.auge.modules.activity.entity.ActivityProfileEntity;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.auge.modules.activity.service.ActivityProfileService;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;


/**
 * 活动信息
 *
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@RestController
@RequestMapping("activity/profile")
@Api(tags = "活动")
public class ActivityProfileController {
    @Autowired
    private ActivityProfileService activityProfileService;


    @PostMapping
    @ApiOperation("保存活动")
    public SR save(@RequestBody ActivityProfileSaveReqDto dto,@ApiIgnore UserInfo userInfo) {
        ValidatorUtils.validateEntity(dto,AddGroup.class);
        activityProfileService.save(dto,userInfo.getId());
        return SR.ok();
    }

    @GetMapping
    @ApiOperation("获取历史活动")
    public SR<List<ActivityProfileResDto>> findList (@ApiIgnore UserInfo userInfo){
        List<ActivityProfileResDto> list = activityProfileService.findHistories(userInfo.getId());
        return SR.ok().setPayload(list);
    }

}
