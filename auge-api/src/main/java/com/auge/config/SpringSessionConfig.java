package com.auge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;

/**
 * spring session 配置
 * @author zixa
 * @date 2018/4/1 13:21
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 604800)
public class SpringSessionConfig {

    @Bean
    public HeaderHttpSessionStrategy cookieHttpSessionStrategy(){
        HeaderHttpSessionStrategy strategy=new HeaderHttpSessionStrategy();
        return strategy;
    }
}
