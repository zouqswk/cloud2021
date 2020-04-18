package com.zou.springcloud.service;

import com.zou.springcloud.bean.Payment;
import com.zou.springcloud.bean.CommentResult;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public int create(Payment payment){
        return 1;
    }

    public CommentResult getPaymentById(Long id){
        return new CommentResult(1,"111");
    }
}
