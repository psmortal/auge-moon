package com.auge.modules.field.dto;

import com.auge.common.validator.group.AddGroup;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by soya on 2018/4/17.
 */
public class FieldProfileSaveReqDto {

    @ApiModelProperty("场地图片")
    private String pictures;

    @ApiModelProperty("场地名称")
    @NotBlank(message = "请填写场地名称",groups = AddGroup.class)
    private String title;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("地区")
    @NotBlank(message = "请选择地区",groups = AddGroup.class)
    private String district;

    @NotBlank(message = "请填写详细地址",groups = AddGroup.class)
    @ApiModelProperty("详细地址")
    private String address;

    @NotBlank(message = "请填写面积",groups = AddGroup.class)
    @ApiModelProperty("面积")
    private String size;

    @NotNull(message = "请选择场地环境类型",groups = AddGroup.class)
    @ApiModelProperty("场地环境类型：1 地铁 2商业街商铺 3社区底商(园区) 4档位摊铺(景区) 5临街门店 6购物百货中心 7交通枢纽 8影院 9广场 10创业园 11写字楼 12步行街 13超市 99其他")
    private Integer surroundType;

    @NotBlank(message = "请填写联系人",groups = AddGroup.class)
    @ApiModelProperty("联系人")
    private String linkman;

    @NotNull(message = "请选择所有者类型",groups = AddGroup.class)
    @ApiModelProperty("所有者类型：1个人 2公司")
    private String ownerType;

    @ApiModelProperty("禁止项说明")
    private String descriptionProhibte;

    @ApiModelProperty("物业管理说明")
    private String descriptionManagement;

    @NotNull(message = "请填写营业开始时间",groups = AddGroup.class)
    @ApiModelProperty("营业开始时间")
    private String startTimeBusiness;

    @NotNull(message = "请填写营业结束时间",groups = AddGroup.class)
    @ApiModelProperty("营业结束时间")
    private String endTimeBusiness;

    @NotNull(message = "请选择消费者年龄结构",groups = AddGroup.class)
    @ApiModelProperty("消费者年龄结构 1青少年居多 2青年居多 3中年居多 4老年居多")
    private Integer customerRate;

    @ApiModelProperty("商圈id")
    private Integer cbdId;

    @NotNull(message = "请选择场地类型",groups = AddGroup.class)
    @ApiModelProperty("场地类型  1场地  2广告")
    private Integer filedType;

    @NotNull(message = "请选择位置类型",groups = AddGroup.class)
    @ApiModelProperty("位置类型 1室内 2室外")
    private Integer placeType;

    @ApiModelProperty("场地服务  1有停车位 2有水电 3物料过夜 4提供座椅")
    private Integer extraService;

    @NotNull(message = "请选择证件类型",groups = AddGroup.class)
    @ApiModelProperty("证件类型 1身份证 2营业执照")
    private Integer cardType;

    @NotBlank(message = "请输入证件编号",groups = AddGroup.class)
    @ApiModelProperty("证件编号")
    private String cardNumber;

    @ApiModelProperty("证件图片")
    private String cardPictures;

    @NotBlank(message = "请选择定位",groups = AddGroup.class)
    @ApiModelProperty("经度")
    private String lng;

    @NotBlank(message = "请选择定位",groups = AddGroup.class)
    @ApiModelProperty("维度")
    private String lat;

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getSurroundType() {
        return surroundType;
    }

    public void setSurroundType(Integer surroundType) {
        this.surroundType = surroundType;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getDescriptionProhibte() {
        return descriptionProhibte;
    }

    public void setDescriptionProhibte(String descriptionProhibte) {
        this.descriptionProhibte = descriptionProhibte;
    }

    public String getDescriptionManagement() {
        return descriptionManagement;
    }

    public void setDescriptionManagement(String descriptionManagement) {
        this.descriptionManagement = descriptionManagement;
    }

    public String getStartTimeBusiness() {
        return startTimeBusiness;
    }

    public void setStartTimeBusiness(String startTimeBusiness) {
        this.startTimeBusiness = startTimeBusiness;
    }

    public String getEndTimeBusiness() {
        return endTimeBusiness;
    }

    public void setEndTimeBusiness(String endTimeBusiness) {
        this.endTimeBusiness = endTimeBusiness;
    }

    public Integer getCustomerRate() {
        return customerRate;
    }

    public void setCustomerRate(Integer customerRate) {
        this.customerRate = customerRate;
    }

    public Integer getCbdId() {
        return cbdId;
    }

    public void setCbdId(Integer cbdId) {
        this.cbdId = cbdId;
    }

    public Integer getFiledType() {
        return filedType;
    }

    public void setFiledType(Integer filedType) {
        this.filedType = filedType;
    }

    public Integer getPlaceType() {
        return placeType;
    }

    public void setPlaceType(Integer placeType) {
        this.placeType = placeType;
    }

    public Integer getExtraService() {
        return extraService;
    }

    public void setExtraService(Integer extraService) {
        this.extraService = extraService;
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

    public String getCardPictures() {
        return cardPictures;
    }

    public void setCardPictures(String cardPictures) {
        this.cardPictures = cardPictures;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}
