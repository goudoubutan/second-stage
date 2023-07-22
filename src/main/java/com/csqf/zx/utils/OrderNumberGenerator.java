package com.csqf.zx.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderNumberGenerator {

    private static final String DATE_FORMAT = "yyyyMMddHHmmss";
    private static final int RANDOM_NUMBER_RANGE = 1000;

    public static String generateOrderNumber() {
        // 获取当前时间
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        String timestamp = dateFormat.format(now);

        // 生成随机数
        Random random = new Random();
        int randomNumber = random.nextInt(RANDOM_NUMBER_RANGE);

        // 组合生成订单号
        String orderNumber = timestamp + randomNumber;

        return orderNumber;
    }

    public static void main(String[] args) {
        // 示例用法
        String orderNumber = generateOrderNumber();
        System.out.println("生成的订单流水号：" + orderNumber);
    }
}
