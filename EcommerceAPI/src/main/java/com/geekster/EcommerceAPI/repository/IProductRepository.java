package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByCategory(String category);
}
