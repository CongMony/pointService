package com.congqian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @program: point
 * @description:
 * @author: Cong.Qian
 * @create: 2018-07-15 00:07
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.congqian.point.mapper")
public class PointApplication {
    public static void main(String[] args) {
        SpringApplication.run(PointApplication.class, args);
    }
}
