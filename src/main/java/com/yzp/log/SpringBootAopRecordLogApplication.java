package com.yzp.log;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = {"com.yzp.log.dao"})
@SpringBootApplication
public class SpringBootAopRecordLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopRecordLogApplication.class, args);
    }

}
