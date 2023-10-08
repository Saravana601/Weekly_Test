package com.geekster.StudentPortal.controller;

import com.geekster.StudentPortal.model.Laptop;
import com.geekster.StudentPortal.model.Student;
import com.geekster.StudentPortal.model.enums.BranchType;
import com.geekster.StudentPortal.model.enums.BrandType;
import com.geekster.StudentPortal.model.enums.DepartmentType;
import com.geekster.StudentPortal.service.LaptopService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;


    @PostMapping("laptop")
    public String addLaptop(@RequestBody @Valid Laptop laptop) {
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getLaptopByBrand(@RequestParam BrandType brand) {
        return laptopService.getAllLaptopByBrand(brand);
    }

    @GetMapping("laptop/{id}")
    public Laptop getLaptopById(@PathVariable Long id){
        return laptopService.getLaptopById(id);
    }

    @PutMapping("laptop/{id}")
    public String updateLaptopPriceById(@PathVariable Long id, @RequestParam Double price){
        return laptopService.updateLaptopPriceById(id,price);
    }

    @DeleteMapping("laptops")
    public String deleteLaptopById(@PathVariable Long id) {
        return laptopService.deleteLaptopById(id);
    }
}

