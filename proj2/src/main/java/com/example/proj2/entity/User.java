package com.example.proj2.entity;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String password;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Payment payment;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Order> order;

    public User(long id,String name,String email,String password,List<Order> order,Payment payment){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.order=order;
        this.payment=payment;
    }
    public User(String name,String email,String password,List<Order> order,Payment payment){
        this.name=name;
        this.email=email;
        this.password=password;
        this.order=order;
        this.payment=payment;
    }
    public User(){
        
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getName() {
        return name;
    }
    public List<Order> getOrder() {
        return order;
    }
    public void setOrder(List<Order> order) {
        this.order = order;
    }
    
    public String toString(){
        return " "+id+" "+name+" "+email+" "+password+" "+order+" "+payment;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
