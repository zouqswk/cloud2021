package com.zou.springcloud.controller;

import com.zou.springcloud.bean.CommentResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
//    public static final String PAYMENT_URL="http://localhost:8001";
    public static final String PAYMENT_URL="http://cloud-provider-payment";//集群服务地址

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/{id}")
    public CommentResult getPaymentById(@PathVariable("id") String id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommentResult.class);
    }

}
