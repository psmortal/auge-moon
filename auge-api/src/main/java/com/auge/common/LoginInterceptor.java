package com.auge.common;

import com.alibaba.fastjson.JSONObject;
import com.auge.common.utils.R;
import com.auge.constant.AugeConstant;
import com.auge.modules.user.entity.UserProfileEntity;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zxia
 * @date 2018/4/1 14:09
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        Object userInfo = httpServletRequest.getSession().getAttribute(AugeConstant.SESSION_USER);
        if (userInfo == null) {
            httpServletResponse.setHeader("Content-Type","application/json;charset=UTF-8");
            httpServletResponse.getWriter().write(JSONObject.toJSONString(R.error(R.CODE_INVALID_USER, "请登录后重试")));
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
