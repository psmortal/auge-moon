package com.auge.modules.user.dto;

import com.auge.common.validator.group.AddGroup;
import com.auge.common.validator.group.UpdateGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * @author zxia
 * @date 2018/4/9 17:59
 */
@ApiModel("个人设置对象")
public class UserProfileEditReqDto implements Serializable{

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    @Length(message="昵称长度不能大于20个字符",max = 20, groups = UpdateGroup.class)
    private String nickname;

    @ApiModelProperty(value = "头像url")
    private String avatar;

    @Length(message="公司名称长度不能大于50个字符",max = 50, groups = UpdateGroup.class)
    @ApiModelProperty(value = "公司名称")
    private String company;

    @Length(message="岗位长度不能大于50个字符",max = 50, groups = UpdateGroup.class)
    @ApiModelProperty(value = "职位")
    private String position;

    @Length(message="公司地址不能大于50个字符",max = 50, groups = UpdateGroup.class)
    @ApiModelProperty(value = "公司地址")
    private String companyAddress;

    @ApiModelProperty(value = "性别（1 男  2 女 3 未知）")
    private Integer sex;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "证件类型(1 身份证 2 护照)")
    private Integer cardType;

    @ApiModelProperty(value = "证件号")
    private String cardNumber;

    @ApiModelProperty(value = "地址")
    private String address;

    /**
     * 邮箱
     */
    @Email(message="邮箱格式不正确", groups = {AddGroup.class, UpdateGroup.class})
    @ApiModelProperty(value = "邮箱")
    private String email;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
