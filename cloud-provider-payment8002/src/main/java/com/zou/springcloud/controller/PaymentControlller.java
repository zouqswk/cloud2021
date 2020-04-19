package com.zou.springcloud.controller;

import com.zou.springcloud.bean.Payment;
import com.zou.springcloud.bean.CommentResult;
import com.zou.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class PaymentControlller {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommentResult create(Payment payment){
        int result=paymentService.create(payment);
        if(result>0){
            return new CommentResult(200,"add成功",result);
        }else {
            return new CommentResult(444,"add失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommentResult getPaymentById(@PathVariable("id") String id){
        CommentResult commentResult=paymentService.getPaymentById(Long.valueOf(id));
        if(commentResult!=null){
            return new CommentResult(200,"查询成功i122221d="+id+",serverPort="+serverPort,commentResult);
        }else{
            return new CommentResult(444,"查询失败112221id="+id+",serverPort="+serverPort,null);
        }
    }
}
