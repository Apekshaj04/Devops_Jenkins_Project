package com.example.demo.services;

import com.example.demo.dto.OrderInfo;
import com.example.demo.repository.OrderInfoRepository;
import com.example.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.util.Objects.nonNull;

@Service
public class OrderServices {
    @Autowired
    RestTemplate restTemplate;

    public OrderInfo getOrderInfo(String orderId) {
        return OrderInfoRepository.getOrderInfo(orderId);
    }

}
