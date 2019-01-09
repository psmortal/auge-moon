package com.auge.modules.base.controller;

import com.auge.common.utils.SR;
import com.qiniu.util.Auth;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zxia
 * @date 2018/4/10 14:41
 */
@RestController
@RequestMapping("oss")
@Api(value = "云存储服务",tags = "基础服务")
public class OSSController {

    @Value("${auge.oss.qiniu-accessKey}")
    private String qiniuAccessKey;
    @Value("${auge.oss.qiniu-secretKey}")
    private String qiniuSecretKey;
    @Value("${auge.oss.qiniu-bucket}")
    private String qiniuBucket;

    @ApiOperation("七牛云客户端token")
    @GetMapping("qiniu/token")
    public SR<String> getQiniuToken(){
        Auth auth = Auth.create(qiniuAccessKey, qiniuSecretKey);
        String upToken = auth.uploadToken(qiniuBucket);
        return SR.ok().setPayload(upToken);
    }

}
