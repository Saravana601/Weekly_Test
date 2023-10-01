package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepository iProductRepository;

    // Add product
    public String addProduct(Product product) {
        iProductRepository.save(product);
        return "product added";
    }

    // Get Products By Category
    public List<Product> getProductsByCategory(String category) {
        return iProductRepository.findByCategory(category);
    }

    // Delete Product By ID
    public String deleteProductByID(Integer productID) {
        iProductRepository.deleteById(productID);
        return "Product deleted";
    }
}
