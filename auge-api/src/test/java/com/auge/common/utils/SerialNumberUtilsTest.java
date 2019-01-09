package com.auge.common.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class SerialNumberUtilsTest {

    @Test
    public void appendSerialNumber() {
        Long number = null;
        for (int i = 0; i < 1000; i++) {
            if (number == null) {
                number = 1l;
            }

            number = SerialNumberUtils.appendPictureGroupSerialNumber(number);

            System.out.println(number);
        }
    }
}