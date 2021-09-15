package com.ebiz.zhanye;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ebiz.**.dao")
public class ZhanyeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhanyeApplication.class, args);
    }

}
