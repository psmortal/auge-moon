package com.auge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 启动去除默认数据配置加载
 * 配置多数据源做读写分离
 * @author zxia
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class ApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

//    static {
//        System.setProperty("spring.profiles.active","prod");
//        System.setProperty("jasypt.encryptor.password","");
//    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApiApplication.class);
    }
}