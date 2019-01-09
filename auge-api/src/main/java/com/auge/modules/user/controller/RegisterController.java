package com.auge.modules.user.controller;

import com.auge.common.utils.SR;
import com.auge.common.validator.ValidatorUtils;
import com.auge.common.validator.group.AddGroup;
import com.auge.modules.user.dto.RegisterReqDto;
import com.auge.modules.user.entity.UserProfileEntity;
import com.auge.modules.user.service.UserProfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


/**
 * 注册
 * @author zxia
 * @date 2018/4/1 16:01
 */
@RestController
@RequestMapping("/user/register")
@Api(tags = "用户")
public class RegisterController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping()
    @ApiOperation(value = "注册")
    public SR createAccount(@RequestBody RegisterReqDto registerReqDto, @ApiIgnore @RequestHeader("Device") String source){

        ValidatorUtils.validateEntity(registerReqDto, AddGroup.class);

        UserProfileEntity userProfileEntity = new UserProfileEntity();
        userProfileEntity.setUserSource(source);

        userProfileEntity.setMobile(registerReqDto.getMobile());
        userProfileEntity.setPassword(registerReqDto.getPassword());
        userProfileEntity.setUserType(registerReqDto.getUserType());

        ValidatorUtils.validateEntity(userProfileEntity, AddGroup.class);
        userProfileService.createAccount(userProfileEntity);
        return SR.ok();
    }

}
