package com.lookblog.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lookblog.server.modules.*.mapper")
@SpringBootApplication
public class LookBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(LookBlogApplication.class, args);
    }

}
