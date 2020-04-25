package com.zou.springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
    public static final String PAYMENT_URL="http://cloud-consumer-zkorder";//集群服务地址

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/paymentzk")
    public String getPaymentById(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }

}
