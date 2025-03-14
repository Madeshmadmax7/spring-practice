package com.example.proj2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Payment {
    @Id
    private long id;

    private Order order;
    private String paymentMethod;
    private String paymentDate;

    
    public Payment(long id, Order order, String paymentMethod, String paymentDate) {
        this.id = id;
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }
    
    public Payment(Order order, String paymentMethod, String paymentDate) {
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public Payment(){

    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    
}
