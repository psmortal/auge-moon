package com.auge.modules.activity.dto;

import com.auge.modules.activity.entity.ActivitySponsorEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 活动信息
 * 
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@ApiModel
public class ActivityProfileResDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("id")
	private Long id;

	@ApiModelProperty("主办方")
	private ActivitySponsorEntity sponsor;

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

	@ApiModelProperty("图片")
	@TableField(exist = false)
	private List<String> pictures;

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

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
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

	public ActivitySponsorEntity getSponsor() {
		return sponsor;
	}

	public void setSponsor(ActivitySponsorEntity sponsor) {
		this.sponsor = sponsor;
	}

	public List<String> getPictures() {
		return pictures;
	}

	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}
}
