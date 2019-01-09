package com.auge.modules.activity.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

import java.io.Serializable;
import java.util.Date;

/**
 * 活动主办方
 * 
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@ApiModel
@TableName("activity_sponsor")
public class ActivitySponsorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;

	private Long userId;

	@ApiModelProperty("logo图片地址")
	private String logo;

	@ApiModelProperty("名称")
	private String name;

	@ApiModelProperty("标签")
	private String tags;

	@ApiModelProperty("描述")
	private String description;

	/**
	 * 是否认真 0否 1是
	 */
	@ApiModelProperty("是否认真 0否 1是")
	private Boolean verified;

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

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public Boolean getVerified() {
		return verified;
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
