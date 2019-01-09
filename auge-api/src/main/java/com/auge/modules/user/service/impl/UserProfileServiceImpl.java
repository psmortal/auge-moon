package com.auge.modules.user.service.impl;


import com.auge.common.UserInfo;
import com.auge.common.exception.RRException;
import com.auge.common.utils.HttpContextUtils;
import com.auge.constant.AugeConstant;
import com.auge.modules.user.dao.UserProfileDao;
import com.auge.modules.user.entity.UserProfileEntity;
import com.auge.modules.user.service.UserProfileService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * 应用用户
 * @author zxia
 * @date 2018/4/1 16:03
 */
@Service
public class UserProfileServiceImpl extends ServiceImpl<UserProfileDao, UserProfileEntity> implements UserProfileService {

    /**
     * 创建用户
     * @param userProfileEntity
     */
    @Override
    public void createAccount(UserProfileEntity userProfileEntity) {

        if (StringUtils.isEmpty(userProfileEntity.getNickname())){
            userProfileEntity.setNickname(userProfileEntity.getMobile());
        }

        if(checkMobileRepeat(userProfileEntity.getNickname())){
            throw new RRException("手机号码已存在");
        }

        String salt = RandomStringUtils.randomAlphanumeric(16);
        userProfileEntity.setSalt(salt);

        String password = userProfileEntity.getPassword();
        userProfileEntity.setPassword(DigestUtils.appendMd5DigestAsHex((password+salt).getBytes(),new StringBuilder()).toString());

        this.insert(userProfileEntity);
    }

    /**
     * 用户重复检查
     * @param mobile
     * @return
     */
    @Override
    public boolean checkMobileRepeat(String mobile){

        UserProfileEntity condition = new UserProfileEntity();
        condition.setMobile(mobile);
        List list = selectList(new EntityWrapper<>(condition));
        if (!CollectionUtils.isEmpty(list)) {
            return true;
        }

        return false;
    }

    /**
     * 登录
     * @param mobile
     * @param password
     */
    @Override
    public UserInfo login(String mobile, String password){
        UserProfileEntity condition = new UserProfileEntity();
        condition.setMobile(mobile);
        condition.setStatus(1);
        condition.setValid(1);
        UserProfileEntity userProfileEntity = selectOne(new EntityWrapper<>(condition));

        if (userProfileEntity != null){
            String encodePassword = DigestUtils.appendMd5DigestAsHex((password + userProfileEntity.getSalt()).getBytes(), new StringBuilder()).toString();
            if (userProfileEntity.getPassword().equals(encodePassword)){

                UserInfo userInfo = new UserInfo();
                userInfo.setMobile(userProfileEntity.getMobile());
                userInfo.setEmail(userProfileEntity.getEmail());
                userInfo.setId(userProfileEntity.getId());
                userInfo.setNickname(userProfileEntity.getNickname());
                userInfo.setUserType(userProfileEntity.getUserType());
                userInfo.setAvatar(userProfileEntity.getAvatar());

                HttpSession session = HttpContextUtils.getHttpServletRequest().getSession();
                session.setAttribute(AugeConstant.SESSION_USER,userInfo);

                userInfo.setToken(session.getId());
                return userInfo;
            }
        }
        throw new RRException("用户名或密码不正确");

    }
}
