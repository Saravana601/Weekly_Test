package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Order;
import com.geekster.EcommerceAPI.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepository iOrderRepository;

    // Place order
    public String placeOrder(Order order) {
        iOrderRepository.save(order);
        return "Your order placed";
    }

    // Get Order by orderID
    public Order getOrderByID(Integer orderID) {
        return iOrderRepository.findById(orderID).orElseThrow();
    }
}
