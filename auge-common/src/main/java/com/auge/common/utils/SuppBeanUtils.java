package com.auge.common.utils;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * bean copy 工具类
 * 主要是针对Spring BeanUtils的使用简化封装
 * 使用bean的默认构造方法实例化对象
 *      显式申明构造方法时需提供无参构造
 * @author zxia
 * @date 2017/12/22 15:22
 */
public class SuppBeanUtils {
    private final static Logger logger = Logger.getLogger(SuppBeanUtils.class);

    public static <T> T copy (Object source , Class clazz){

        if(source == null) {
            return null;
        }

        T o = (T) BeanUtils.instantiateClass(clazz);
        BeanUtils.copyProperties(source, o);
        return o;
    }

    public static <T> List<T> copyList (List<? extends Object> source , Class clazz){

        if(source == null) {
            return null;
        }

        List<T> voList=new ArrayList<>();

        for(Object o:source){
            voList.add((T) copy(o, clazz));
        }
        return voList;
    }

}
