package com.auge.modules.activity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 活动信息
 * 
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@ApiModel
@TableName("activity_profile")
public class ActivityProfileEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	@ApiModelProperty("id")
	private Long id;

	private Long userId;

	private Long sponsorId;

	@ApiModelProperty("标题")
	private String title;

	@ApiModelProperty("外链")
	private String url;

	@ApiModelProperty("描述")
	private String description;

	@ApiModelProperty("开始时间")
	private Date startTime;

	@ApiModelProperty("结束时间")
	private Date endTime;

	private Long pictureGroupId;

	@ApiModelProperty("地址")
	private String address;

	@ApiModelProperty("价格")
	private BigDecimal price;

	/**
	 * 标签，关键字
	 */
	@ApiModelProperty("标签，关键字")
	private String tags;

	/**
	 * 特殊排序
	 */
	@ApiModelProperty("特殊排序")
	private String specOrder;

	@ApiModelProperty("增值服务")
	private String service;

	/**
	 * 0 无效 1 有效
	 */
	private Boolean valid;

	private Date createTime;

	private Date updateTime;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setSponsorId(Long sponsorId) {
		this.sponsorId = sponsorId;
	}

	public Long getSponsorId() {
		return sponsorId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setPictureGroupId(Long pictureGroupId) {
		this.pictureGroupId = pictureGroupId;
	}

	public Long getPictureGroupId() {
		return pictureGroupId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTags() {
		return tags;
	}

	public void setSpecOrder(String specOrder) {
		this.specOrder = specOrder;
	}

	public String getSpecOrder() {
		return specOrder;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getService() {
		return service;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}
}
