package com.csqf.zx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //开启定时任务
@MapperScan(basePackages = "com.csqf.zx.mapper")
public class SecondStageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondStageApplication.class, args);
    }

}
