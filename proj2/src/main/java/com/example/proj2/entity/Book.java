package com.example.proj2.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private String author;
    private long price;
    private int quantity;
    
    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> order;

    public Book(){

    }

    public Book(long id,String title,String author,long price,int quantity,List<Order> order){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
        this.order=order;
    }

    public Book(String title,String author,long price,int quantity,List<Order> order){
        this.title=title;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
        this.order=order;
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

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", quantity="
                + quantity + ", order=" + order + "]";
    }

}
