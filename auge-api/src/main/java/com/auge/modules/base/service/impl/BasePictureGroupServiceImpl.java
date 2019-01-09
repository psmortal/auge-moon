package com.auge.modules.base.service.impl;

import com.auge.common.utils.SerialNumberUtils;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.auge.modules.base.dao.BasePictureGroupDao;
import com.auge.modules.base.entity.BasePictureGroupEntity;
import com.auge.modules.base.service.BasePictureGroupService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.IdGenerator;

import java.util.List;

/**
 * 图片组
 *
 * @author zxia
 * @date 2018-04-24 23:06:37
 */
@Service
public class BasePictureGroupServiceImpl extends ServiceImpl<BasePictureGroupDao, BasePictureGroupEntity> implements BasePictureGroupService {

    @Value("${auge.oss.qiniu-domain}")
    private String qiniuDomain;

    @Autowired
    BasePictureGroupDao basePictureGroupDao;

    /**
     * 新增图片组
     * @param list
     * @return
     */
    @Override
    public Long add(List<BasePictureGroupEntity> list) {
        Long groupId = format(list);
        this.insertBatch(list);
        return groupId;
    }

    /**
     * 替换图片组groupId不变
     * @param list
     * @param oldId
     * @return
     */
    @Override
    public void replace(List<BasePictureGroupEntity> list, Long oldId) {
        format(list, oldId);

        deletePictrueGroup(oldId);
        this.insertBatch(list);
    }

    /**
     * 替换图片组返回新groupId
     * @param list
     * @param oldId
     * @return
     */
    @Override
    @Transactional
    public Long replaceFresh(List<BasePictureGroupEntity> list, Long oldId) {
        Long groupId = format(list);

        deletePictrueGroup(oldId);
        this.insertBatch(list);

        return groupId;
    }

    /**
     * 根据groupid获取图片URL集合
     * @param groupId
     * @return
     */
    @Override
    public List<String> getUrlsByGroupId(Long groupId) {
        return basePictureGroupDao.selectUrlsByGroupId(groupId);
    }

    /**
     * 删除图片组
     * @param groupId
     * @return
     */
    public Boolean deletePictrueGroup(Long groupId) {
        BasePictureGroupEntity querier = new BasePictureGroupEntity();
        querier.setGroupId(groupId);
        return this.delete(new EntityWrapper<>(querier));
    }

    /**
     * 填充对象 自动生成groupId
     * @param list
     */
    private Long format(List<BasePictureGroupEntity> list){
        Long maxGroupId = basePictureGroupDao.selectMaxGroupId();
        if (maxGroupId == null) maxGroupId = 0l;

        maxGroupId = SerialNumberUtils.appendPictureGroupSerialNumber(maxGroupId);
        format(list,maxGroupId);

        return maxGroupId;
    }

    /**
     * 填充对象
     * @param list
     * @param groupId
     */
    private void format(List<BasePictureGroupEntity> list, Long groupId){
        if(CollectionUtils.isNotEmpty(list)) {
            for (BasePictureGroupEntity basePictureGroupEntity : list) {
                if (StringUtils.isNotBlank(basePictureGroupEntity.getUrl()))
                    basePictureGroupEntity.setUrl(qiniuDomain + basePictureGroupEntity.getUrl());
                basePictureGroupEntity.setGroupId(groupId);
            }
        }
    }
}
