package com.auge.modules.user.controller;

import com.auge.common.UserInfo;
import com.auge.common.utils.HttpContextUtils;
import com.auge.common.utils.R;
import com.auge.common.utils.SR;
import com.auge.common.validator.ValidatorUtils;
import com.auge.common.validator.group.AddGroup;
import com.auge.modules.user.dto.LoginReqDto;
import com.auge.modules.user.service.UserProfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * LoginController
 * @author zxia
 */
@RestController
@Api(tags = "用户")
public class LoginController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping("login")
    @ApiOperation(value = "登录")
    public SR<UserInfo> login(@RequestBody LoginReqDto loginReqDto){

        ValidatorUtils.validateEntity(loginReqDto, AddGroup.class);

        UserInfo userInfo = userProfileService.login(loginReqDto.getMobile(), loginReqDto.getPassword());

        return SR.ok().setPayload(userInfo);

    }

    @PostMapping("logout")
    @ApiOperation(value = "登出")
    public SR logout() {
        HttpContextUtils.getHttpServletRequest().getSession().invalidate();
        return SR.ok();
    }

}
