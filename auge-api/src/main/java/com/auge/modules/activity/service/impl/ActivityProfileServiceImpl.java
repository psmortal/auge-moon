package com.auge.modules.activity.service.impl;

import com.auge.common.utils.SuppBeanUtils;
import com.auge.modules.activity.dao.ActivityProfileDao;
import com.auge.modules.activity.dao.ActivitySponsorDao;
import com.auge.modules.activity.dto.ActivityProfileResDto;
import com.auge.modules.activity.dto.ActivityProfileSaveReqDto;
import com.auge.modules.activity.entity.ActivityProfileEntity;
import com.auge.modules.activity.entity.ActivitySponsorEntity;
import com.auge.modules.activity.service.ActivityProfileService;
import com.auge.modules.base.entity.BasePictureGroupEntity;
import com.auge.modules.base.service.BasePictureGroupService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 活动信息
 *
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
@Service
public class ActivityProfileServiceImpl extends ServiceImpl<ActivityProfileDao, ActivityProfileEntity> implements ActivityProfileService {

    @Autowired
    BasePictureGroupService basePictureGroupService;
    @Autowired
    ActivitySponsorDao activitySponsorDao;

    /**
     * 保存
     * @param dto
     * @param userId
     * @return
     */
    @Override
    @Transactional
    public boolean save(ActivityProfileSaveReqDto dto,Long userId) {

        ActivityProfileEntity entity = SuppBeanUtils.copy(dto, ActivityProfileEntity.class);
        entity.setUserId(userId);

        //=========================
        // 保存图片组
        //=========================
        List<BasePictureGroupEntity> pictureGroupList= new ArrayList<>();
        BasePictureGroupEntity temp;
        if (CollectionUtils.isNotEmpty(dto.getPictures())){
            for (String url : dto.getPictures()) {
                temp = new BasePictureGroupEntity(userId, url);
                pictureGroupList.add(temp);
            }
        }
        Long groupId = basePictureGroupService.add(pictureGroupList);

        entity.setPictureGroupId(groupId);
        return this.insert(entity);
    }

    /**
     * 历史活动
     * @param userId
     * @return
     */
    @Override
    public List<ActivityProfileResDto> findHistories(Long userId) {
        ActivityProfileEntity querier = new ActivityProfileEntity();
        querier.setUserId(userId);
        querier.setValid(true);
        List<ActivityProfileEntity> activityProfileEntities = this.selectList(new EntityWrapper<>(querier));

        List<ActivityProfileResDto> list = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(activityProfileEntities)){
            for (ActivityProfileEntity activityProfileEntity : activityProfileEntities) {
                ActivityProfileResDto one = SuppBeanUtils.copy(activityProfileEntity, ActivityProfileResDto.class);
                ActivitySponsorEntity activitySponsorEntity = activitySponsorDao.selectById(activityProfileEntity.getSponsorId());
                one.setSponsor(activitySponsorEntity);

                if (activityProfileEntity.getPictureGroupId() != null){
                    one.setPictures(basePictureGroupService.getUrlsByGroupId(activityProfileEntity.getPictureGroupId()));
                }

                list.add(one);
            }

        }

        return list;
    }
}
