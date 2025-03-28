package com.example.proj2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj2.entity.Payment;
import com.example.proj2.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    
    @PostMapping("/create")
    public void createPayment(@RequestBody Payment payment){
        paymentService.createPayment(payment);
    }
    @GetMapping("/get")
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }
}
