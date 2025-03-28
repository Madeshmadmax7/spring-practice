package com.example.proj2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "_order_id")
    private Order order;

    private String paymentMethod;
    private String paymentDate;

    @OneToOne
    @JoinColumn(name = "_user_id")
    private User user;
    
    public Payment(long id, Order order, String paymentMethod, String paymentDate,User user) {
        this.id = id;
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.user=user;
    }
    
    public Payment(Order order, String paymentMethod, String paymentDate,User user) {
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.user=user;
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

    
    @Override
    public String toString() {
        return "Payment [id=" + id + ", order=" + order + ", paymentMethod=" + paymentMethod + ", paymentDate="
                + paymentDate + ", user=" + user + "]";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
