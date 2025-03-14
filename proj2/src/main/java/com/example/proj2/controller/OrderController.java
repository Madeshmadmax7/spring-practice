package com.example.proj2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj2.entity.Order;
import com.example.proj2.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    public OrderService orderService;
    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }
    @PostMapping("/create")
    public void createOrder(Order order){
        orderService.createOrder(order);
    }
    @GetMapping("/get")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
}
