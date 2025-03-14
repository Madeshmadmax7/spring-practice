package com.example.proj2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.proj2.entity.Payment;
import com.example.proj2.repository.PaymentRepository;

@Service
public class PaymentService {
    public PaymentRepository paymentRepository;
    public PaymentService(PaymentRepository paymentRepository){ 
        this.paymentRepository=paymentRepository;
    }
    public void createPayment(Payment payment){ 
        paymentRepository.save(payment);
    }
    public List<Payment> getAllPayments(){ 
        return paymentRepository.findAll();
    }
}
