package com.auge.modules.activity.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 活动主办方
 * 
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@ApiModel
public class ActivitySponsorSaveResDto implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("id")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
