package com.auge.modules.field.controller;

import com.auge.common.utils.SR;
import com.auge.modules.field.entity.FieldProfileShotEntity;
import com.auge.modules.field.service.FieldProfileShotService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 场地租赁快照
 */
@Api(tags = "场地")
@RestController
@RequestMapping("field/profileshot")
public class FieldProfileShotController {
    @Autowired
    private FieldProfileShotService fieldProfileShotService;

    @ApiOperation("获取租赁场地快照列表")
    @GetMapping
    public SR<List<FieldProfileShotEntity>> list() {
        return SR.ok();
    }

}
