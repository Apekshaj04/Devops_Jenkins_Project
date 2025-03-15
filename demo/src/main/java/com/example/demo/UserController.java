package com.example.demo;
import com.example.demo.dto.UserInfo;
import com.example.demo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    UserServices userServices;
    @GetMapping("/")
    List<UserInfo> getAllUsers(){
        return userServices.getAllUsers();
    }

    @PostMapping
    String createUser(@RequestBody UserInfo userInfo){
        return userServices.createUser(userInfo);
    }

    @GetMapping("/{id}")
        ResponseEntity<UserInfo> getUser(@PathVariable String id){
        try{
            return ResponseEntity.ok().body(userServices.getUser(id));
        }
        catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

}
