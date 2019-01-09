package com.auge.common.utils;

/**
 * SerialNumberUtils
 * @author zxia
 * @date 2018/4/25 11:50
 */
public class SerialNumberUtils {

    private static Integer PICTURE_GROUP_COUNT = 1;

    public static Long appendPictureGroupSerialNumber(Long number){

        number = (number + 100) / 100;

        number = (number*100 + PICTURE_GROUP_COUNT);
        PICTURE_GROUP_COUNT %= 99;
        PICTURE_GROUP_COUNT ++ ;
        return number;
    }
}
