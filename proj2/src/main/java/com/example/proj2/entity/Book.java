package com.example.proj2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private long id;

    private String title;
    private String author;
    private long price;
    private int quantity;
    
    public Book(){

    }

    public Book(Long id,String title,String author,long price,int quantity){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }

    public Book(String title,String author,long price,int quantity){
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){
        return id+" "+title+" "+author+" "+price+" "+quantity;
    }

}
