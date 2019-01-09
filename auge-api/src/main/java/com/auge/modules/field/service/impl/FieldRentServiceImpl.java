package com.auge.modules.field.service.impl;

import com.auge.modules.field.entity.FieldRentEntity;
import com.auge.modules.field.dao.FieldRentDao;
import com.auge.modules.field.service.FieldRentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service("fieldRentService")
public class FieldRentServiceImpl extends ServiceImpl<FieldRentDao, FieldRentEntity> implements FieldRentService {

}
