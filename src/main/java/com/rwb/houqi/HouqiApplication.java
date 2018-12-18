package com.rwb.houqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.rwb.houqi.mapper")
@SpringBootApplication
public class HouqiApplication {

    public static void main(String[] args) {


        SpringApplication.run(HouqiApplication.class, args);
    }

}

