package com.auge.modules.field.dao;

import com.auge.modules.field.entity.FieldRentEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 场地租赁信息
 */
@Mapper
public interface FieldRentDao extends BaseMapper<FieldRentEntity> {
	
}
