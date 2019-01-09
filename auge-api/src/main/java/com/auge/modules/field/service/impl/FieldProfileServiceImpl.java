package com.auge.modules.field.service.impl;

import com.auge.modules.field.entity.FieldProfileEntity;
import com.auge.modules.field.dao.FieldProfileDao;
import com.auge.modules.field.service.FieldProfileService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service("fieldProfileService")
public class FieldProfileServiceImpl extends ServiceImpl<FieldProfileDao, FieldProfileEntity> implements FieldProfileService {


}
