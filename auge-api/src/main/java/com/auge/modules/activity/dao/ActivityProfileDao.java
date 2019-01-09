package com.auge.modules.activity.dao;

import com.auge.modules.activity.entity.ActivityProfileEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 活动信息
 * 
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@Mapper
public interface ActivityProfileDao extends BaseMapper<ActivityProfileEntity> {
	
}
