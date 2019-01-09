package com.auge.modules.base.service;

import com.baomidou.mybatisplus.service.IService;
import com.auge.modules.base.entity.BasePictureGroupEntity;

import java.util.List;

/**
 * 图片组
 *
 * @author zxia
 * @date 2018-04-24 23:06:37
 */
public interface BasePictureGroupService extends IService<BasePictureGroupEntity> {

    /**
     * 新增图片组
     * @param list
     * @return
     */
    Long add(List<BasePictureGroupEntity> list);

    /**
     * 替换图片组groupId不变
     * @param list
     * @param oldId
     * @return
     */
    void replace(List<BasePictureGroupEntity> list,Long oldId);


    /**
     * 替换图片组返回新groupId
     * @param list
     * @param oldId
     * @return
     */
    Long replaceFresh(List<BasePictureGroupEntity> list,Long oldId);

    /**
     * 根据groupid获取图片URL集合
     * @param groupId
     * @return
     */
    List<String> getUrlsByGroupId(Long groupId);

}

