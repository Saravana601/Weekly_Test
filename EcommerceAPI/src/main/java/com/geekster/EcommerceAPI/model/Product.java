package com.geekster.EcommerceAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    private Integer productID;

    @NotBlank(message = "Product name is required")
    private String productName;

    @NotNull(message = "Product price is required")
    private Integer productPrice;

    @NotBlank(message = "Product description is required")
    private String productDescription;

    private String category;

    @NotBlank(message = "Product brand is required")
    private String productBrand;
}
