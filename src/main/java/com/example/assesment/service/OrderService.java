/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.assesment.service;

import com.example.assesment.data.Orders;
import com.example.assesment.data.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramesh
 */
@Service
public class OrderService {
    @Autowired
    private OrdersRepository ordRepo;
    
    public Orders createOrder(Orders ord){
        return ordRepo.save(ord);
    }
    
}
