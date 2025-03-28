package com.example.proj2.entity;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "_user_id")
    private User user;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<Payment> payment;

    private int quantity;
    private String date;
    
    public Order(long id, User user, Book book, int quantity, String date,List<Payment> payment) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.date = date;
        this.payment=payment;
    }

    public Order(){

    }
    
    public Order(User user, Book book, int quantity, String date,List<Payment> payment) {
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.date = date;
        this.payment=payment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    

    @Override
    public String toString() {
        return "Order [id=" + id + ", user=" + user + ", book=" + book + ", payment=" + payment + ", quantity="
                + quantity + ", date=" + date + "]";
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}
