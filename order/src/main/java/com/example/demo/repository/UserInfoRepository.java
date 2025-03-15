package com.example.demo.repository;

import com.example.demo.dto.OrderInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserInfoRepository {
    Map<String, OrderInfo> users ;
    @PostConstruct
    public void init() {
        users = new HashMap<>();
    }

    public List<OrderInfo> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public String createUser(OrderInfo orderInfo){
        String id = UUID.randomUUID().toString();
        users.put(id, orderInfo);
        System.out.println("User created successfully");
        return id;
    }
    
    public OrderInfo getUser(String id){
        return users.get(id);
    }
}
