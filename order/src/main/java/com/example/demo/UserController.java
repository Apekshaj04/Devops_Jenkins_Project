package com.example.demo;
import com.example.demo.dto.OrderInfo;
import com.example.demo.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    OrderServices orderServices;
    @GetMapping("/")
    List<OrderInfo> getAllUsers(){
        return orderServices.getAllUsers();
    }

    @PostMapping
    String createUser(@RequestBody OrderInfo orderInfo){
        return orderServices.createUser(orderInfo);
    }

    @GetMapping("/{id}")
        ResponseEntity<OrderInfo> getUser(@PathVariable String id){
        try{
            return ResponseEntity.ok().body(orderServices.getUser(id));
        }
        catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

}
