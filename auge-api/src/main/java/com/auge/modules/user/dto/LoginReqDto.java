package com.auge.modules.user.dto;

import com.auge.common.validator.group.AddGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author zxia
 * @date 2018/4/9 18:25
 */
@ApiModel("登录对象")
public class LoginReqDto {

    @ApiModelProperty(value = "手机号")
    @NotBlank(message="手机号为空", groups = AddGroup.class)
    @Length(min = 11,max = 11,message = "手机号长度不正确", groups = AddGroup.class)
    private String mobile;

    @ApiModelProperty(value = "密码")
    @NotBlank(message="密码为空", groups = AddGroup.class)
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
