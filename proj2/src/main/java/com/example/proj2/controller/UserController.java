package com.example.proj2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj2.entity.User;
import com.example.proj2.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    public UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    public void createUser(User user){
        userService.createUser(user);
    }
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
