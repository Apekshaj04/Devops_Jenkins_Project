package com.example.demo.services;

import com.example.demo.dto.UserInfo;
import com.example.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class UserServices {
    @Autowired
    UserInfoRepository userInfoRepository;
    public List<UserInfo> getAllUsers(){
        return userInfoRepository.getAllUsers();
    }

    public String createUser(UserInfo userInfo){
        return userInfoRepository.createUser(userInfo);
    }

    public UserInfo getUser(String id){
        UserInfo userInfo = userInfoRepository.getUser(id);
        if(nonNull(userInfo)){
            return userInfo;
        }
        throw  new RuntimeException("User not found");
    }
}
