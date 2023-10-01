package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Product;
import com.geekster.EcommerceAPI.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("products")
    public List<Product> getProductsByCategory(@RequestParam String category){
        return productService.getProductsByCategory(category);
    }

    public String deleteProductByID(@PathVariable Integer productID){
        return productService.deleteProductByID(productID);
    }
}
