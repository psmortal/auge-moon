package com.auge.modules.user.dto;

import com.auge.common.validator.group.AddGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author zxia
 * @date 2018/4/9 18:31
 */
@ApiModel("注册")
public class RegisterReqDto {

    @ApiModelProperty("手机号")
    @NotBlank(message="手机号为空", groups = AddGroup.class)
    @Length(min = 11,max = 11,message = "手机号长度不正确", groups = AddGroup.class)
    private String mobile;
    @ApiModelProperty("密码")
    @NotBlank(message="密码为空", groups = AddGroup.class)
    private String password;
    @ApiModelProperty("用户类型（1 用户 2 商家）")
    @NotBlank(message="用户类型为空", groups = AddGroup.class)
    private Integer userType;

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

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }
}
