
package com.auge.modules.user.service;

import com.auge.common.UserInfo;
import com.auge.modules.user.entity.UserProfileEntity;
import com.baomidou.mybatisplus.service.IService;


/**
 * 应用用户
 * @author zxia
 * @date 2018/4/1 16:02
 */
public interface UserProfileService extends IService<UserProfileEntity> {

    /**
     * 创建用户
     * @param userProfileEntity
     */
    void createAccount(UserProfileEntity userProfileEntity);

    /**
     * 电话重复检查
     * @param nickName
     * @return
     */
    boolean checkMobileRepeat(String nickName);

    /**
     * 登录
     * @param mobile
     * @param password
     */
    UserInfo login(String mobile, String password);

}
