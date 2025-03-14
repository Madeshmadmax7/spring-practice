package com.example.proj2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "_order")
public class Order {
    @Id
    private long id;

    
    private User user;
    private Book book;
    private int quantity;
    private String date;
    
    public Order(long id, User user, Book book, int quantity, String date) {
        this.id = id;
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.date = date;
    }

    public Order(){

    }
    
    public Order(User user, Book book, int quantity, String date) {
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.date = date;
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
        return "Order [id=" + id + ", user=" + user + ", book=" + book + ", quantity=" + quantity + ", date=" + date
                + "]";
    }
}
