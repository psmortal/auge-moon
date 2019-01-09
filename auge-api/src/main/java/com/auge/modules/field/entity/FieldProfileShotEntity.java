package com.auge.modules.field.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * Created by soya on 2018/4/15.
 */
@TableName("field_profile_shot")
@ApiModel
public class FieldProfileShotEntity implements Serializable {

    @TableId
    private Long id;

    @ApiModelProperty("场地id")
    private Integer fieldId;
    @ApiModelProperty("商家用户id")
    private Long user_id;
    @ApiModelProperty("场地图片")
    private String pictures;
    @ApiModelProperty("场地名称")
    private String title;
    @ApiModelProperty("描述")
    private String description;
    @ApiModelProperty("地区")
    private String district;
    @ApiModelProperty("详细地址")
    private String address;
    @ApiModelProperty("面积")
    private String size;
    @ApiModelProperty("场地环境类型：1 地铁 2商业街商铺 3社区底商(园区) 4档位摊铺(景区) 5临街门店 6购物百货中心 7交通枢纽 8影院 9广场 10创业园 11写字楼 12步行街 13超市 99其他")
    private Integer surround_type;
    @ApiModelProperty("联系人")
    private String linkman;
    @ApiModelProperty("所有者类型：1个人 2公司")
    private String owner_type;
    @ApiModelProperty("禁止项说明")
    private String descriptionProhibte;
    @ApiModelProperty("物业管理说明")
    private String descriptionManagement;
    @ApiModelProperty("营业开始时间")
    private Time startTimeBusiness;
    @ApiModelProperty("营业结束时间")
    private Time endTimeBusiness;
    @ApiModelProperty("消费者年龄结构 1青少年居多 2青年居多 3中年居多 4老年居多")
    private Integer customerRate;
    @ApiModelProperty("商圈id")
    private Integer cbdId;
    @ApiModelProperty("场地类型  1场地  2广告")
    private Integer filedType;
    @ApiModelProperty("位置类型 1室内 2室外")
    private Integer placeType;
    @ApiModelProperty("场地服务  1有停车位 2有水电 3物料过夜 4提供座椅")
    private Integer extraService;
    @ApiModelProperty("证件类型 1身份证 2营业执照")
    private Integer cardType;
    @ApiModelProperty("证件编号")
    private String cardNumber;
    @ApiModelProperty("证件图片")
    private String cardPictures;
    @ApiModelProperty("经度")
    private String lng;
    @ApiModelProperty("维度")
    private String lat;
    @ApiModelProperty("状态 0停用 1在用")
    private Integer status;
    private boolean valid;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("修改时间")
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

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

    public Integer getSurround_type() {
        return surround_type;
    }

    public void setSurround_type(Integer surround_type) {
        this.surround_type = surround_type;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getOwner_type() {
        return owner_type;
    }

    public void setOwner_type(String owner_type) {
        this.owner_type = owner_type;
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

    public Time getStartTimeBusiness() {
        return startTimeBusiness;
    }

    public void setStartTimeBusiness(Time startTimeBusiness) {
        this.startTimeBusiness = startTimeBusiness;
    }

    public Time getEndTimeBusiness() {
        return endTimeBusiness;
    }

    public void setEndTimeBusiness(Time endTimeBusiness) {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
