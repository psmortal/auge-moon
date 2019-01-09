package com.auge.modules.user.controller;

import com.auge.common.UserInfo;
import com.auge.common.exception.RRException;
import com.auge.common.utils.SR;
import com.auge.common.utils.SuppBeanUtils;
import com.auge.common.utils.ValidationUtils;
import com.auge.common.validator.ValidatorUtils;
import com.auge.common.validator.group.UpdateGroup;
import com.auge.modules.user.dto.UserProfileEditReqDto;
import com.auge.modules.user.entity.UserProfileEntity;
import com.auge.modules.user.service.UserProfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author zxia
 * @date 2018/4/9 16:18
 */
@RestController
@RequestMapping("/user/profile")
@Api(tags = "用户")
public class ProfileController {

    @Value("${auge.oss.qiniu-domain}")
    private String qiniuDomain;

    @Autowired
    UserProfileService userProfileService;

    @PostMapping()
    @ApiOperation("个人设置")
    public SR edit(@RequestBody UserProfileEditReqDto userProfileReqDto, @ApiIgnore UserInfo userInfo){

        if (userProfileReqDto.getCardType() != null
            && 1 == userProfileReqDto.getCardType()
            && !ValidationUtils.strongVerifyIdNumber(userProfileReqDto.getCardNumber())) {
            throw new RRException("身份证号码不正确");
        }

        ValidatorUtils.validateEntity(userProfileReqDto, UpdateGroup.class);

        if (!StringUtils.isEmpty(userProfileReqDto.getAvatar())){
            userProfileReqDto.setAvatar(qiniuDomain + userProfileReqDto.getAvatar());
        }

        UserProfileEntity userProfile = SuppBeanUtils.copy(userProfileReqDto, UserProfileEntity.class);
        userProfile.setId(userInfo.getId());
        userProfileService.updateById(userProfile);
        return SR.ok();
    }
}
