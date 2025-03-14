package com.example.proj2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.proj2.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
    
}
