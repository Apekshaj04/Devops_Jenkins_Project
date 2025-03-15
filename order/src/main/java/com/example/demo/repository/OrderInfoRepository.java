package com.example.demo.repository;

import com.example.demo.dto.OrderInfo;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OrderInfoRepository {
    Map<String, OrderInfo> orderDb ;
    public void init(){
        orderDb = new HashMap<>();
    }
    public OrderInfo getOrderInfo(String orderId) {
        return orderDb.get(orderId);
    }

    public String createOrderInfo(OrderInfo orderInfo) {

        String orderId = UUID.randomUUID().toString();
        orderDb.put(orderId, orderInfo);
        return orderId;
    }

    public OrderInfo getAllOrders(){
        return orderDb.values().stream().findFirst().get();
    }


}
