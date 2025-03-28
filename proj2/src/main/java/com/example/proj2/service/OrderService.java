package com.example.proj2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.proj2.entity.Order;
import com.example.proj2.repository.OrderRepository;

@Service
public class OrderService {
    public final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository)
    {
        this.orderRepository=orderRepository;
    }
    public void createOrder(Order order)
    {
        orderRepository.save(order);
    }
    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }
}
