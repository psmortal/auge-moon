package com.auge.modules.base.dao;

import com.auge.modules.base.entity.BasePictureGroupEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 图片组
 * 
 * @author zxia
 * @date 2018-04-24 23:06:37
 */
@Mapper
public interface BasePictureGroupDao extends BaseMapper<BasePictureGroupEntity> {

    /**
     * 查询最大groupId
     * @return
     */
    Long selectMaxGroupId();

    /**
     * 根据groupid获取图片URL集合
     * @param groupId
     * @return
     */
    List<String> selectUrlsByGroupId(Long groupId);
}
