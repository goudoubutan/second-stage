package com.csqf.zx.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 公众号：耀说编程
 * 微信：wx_aya4
 */
public class DateTimeUtil {

    public static Date addTime(Date currentTime,int nextMin){
        Calendar calendar = Calendar.getInstance();

        // 将当前时间添加半个小时
        calendar.setTime(currentTime);
        calendar.add(Calendar.MINUTE, nextMin);

        // 获取半个小时后的时间
        Date nextDate = calendar.getTime();
        return nextDate;
    }
}
