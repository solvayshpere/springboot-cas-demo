package com.solvay.springbootcasdemo;

import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient
@MapperScan("com.solvay.springbootcasdemo.dao")
public class SpringbootCasDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCasDemoApplication.class, args);
    }

}
