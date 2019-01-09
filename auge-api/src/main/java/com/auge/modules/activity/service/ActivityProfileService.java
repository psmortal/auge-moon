package com.auge.modules.activity.service;

import com.auge.modules.activity.dto.ActivityProfileResDto;
import com.auge.modules.activity.dto.ActivityProfileSaveReqDto;
import com.baomidou.mybatisplus.service.IService;
import com.auge.modules.activity.entity.ActivityProfileEntity;

import java.util.List;

/**
 * 活动信息
 *
 * @author zxia
 * @date 2018-04-24 22:09:01
 */
public interface ActivityProfileService extends IService<ActivityProfileEntity> {

    /**
     * 保存
     * @param dto
     * @param userId
     * @return
     */
    boolean save(ActivityProfileSaveReqDto dto, Long userId);

    /**
     * 历史活动
     * @param userId
     * @return
     */
    List<ActivityProfileResDto> findHistories(Long userId);
}

