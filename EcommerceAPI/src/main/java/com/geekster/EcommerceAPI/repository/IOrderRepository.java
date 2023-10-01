package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order,Integer> {
}
