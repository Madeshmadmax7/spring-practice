package com.example.proj2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.proj2.entity.User;
import com.example.proj2.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;
    public UserService(UserRepository userRepository){ 
        this.userRepository=userRepository;
    }
    public void createUser(User user){ 
        userRepository.save(user);
    }
    public List<User> getAllUsers(){ 
        return userRepository.findAll();
    }
}
