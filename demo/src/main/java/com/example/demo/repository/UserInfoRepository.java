package com.example.demo.repository;

import com.example.demo.dto.UserInfo;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class UserInfoRepository {
    Map<String, UserInfo> users ;
    @PostConstruct
    public void init() {
        users = new HashMap<>();
    }

    public List<UserInfo> getAllUsers() {
        return new ArrayList<>(users.values());
    }

    public String createUser(UserInfo userInfo){
        String id = UUID.randomUUID().toString();
        users.put(id,userInfo);
        System.out.println("User created successfully");
        return id;
    }
    
    public UserInfo getUser(String id){
        return users.get(id);
    }
}
