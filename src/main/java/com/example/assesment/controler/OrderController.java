/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.assesment.controler;

import com.example.assesment.data.Orders;
import com.example.assesment.service.OrderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ramesh
 */
@RestController
public class OrderController {
    
    @Autowired
    private OrderService ordS;
    
    @PostMapping(path = "/orders")
    public Orders createOrder(@RequestBody Orders ord){
        return ordS.createOrder(ord);
    }
    
    @PutMapping(path="/update_order")
    public Orders updateOrder(@RequestBody Orders ord){
        return ordS.updateOrder(ord);
    }
    
    @GetMapping(path="/all_orders")
    public List<Orders> getAllOrders(){
        return ordS.getAllOrders();
    }
}
