package com.auge.modules.activity.dto;

import com.auge.common.validator.group.AddGroup;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 活动主办方
 * 
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@ApiModel
public class ActivitySponsorSaveReqDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("logo图片地址")
	@NotNull(message = "logo图片为空", groups = AddGroup.class)
	private String logo;

	@ApiModelProperty("名称")
	@NotNull(message = "名称图片为空", groups = AddGroup.class)
	private String name;

	@ApiModelProperty("描述")
	private String description;

	@ApiModelProperty("标签")
	private String tags;


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
}
