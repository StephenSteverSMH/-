package com.stever.gmall.manage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.stever.gmall.manage.mapper")
@ComponentScan(basePackages = "com.stever.gmall")
public class GmallManageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GmallManageServiceApplication.class);
    }
}
