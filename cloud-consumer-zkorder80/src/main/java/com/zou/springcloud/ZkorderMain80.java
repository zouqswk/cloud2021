package com.zou.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZkorderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ZkorderMain80.class);
    }
}
