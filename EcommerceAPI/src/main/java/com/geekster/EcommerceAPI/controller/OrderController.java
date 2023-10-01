package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String placeOrder(@RequestBody Order order){
        return orderService.placeOrder(order);
    }

    @GetMapping("order/{orderID}")
    public Order getOrderByID(@PathVariable Integer orderID){
        return orderService.getOrderByID(orderID);
    }
}
