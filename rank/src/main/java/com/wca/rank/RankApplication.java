package com.wca.rank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.wca.rank.dao")
public class RankApplication {

    public static void main(String[] args) {
        SpringApplication.run(RankApplication.class, args);
    }
}
