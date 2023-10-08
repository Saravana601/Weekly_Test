package com.geekster.StudentPortal.service;


import com.geekster.StudentPortal.model.Laptop;
import com.geekster.StudentPortal.model.enums.BrandType;
import com.geekster.StudentPortal.repository.ILaptopRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepository iLaptopRepository;

    // Add Laptop
    public String addLaptop(Laptop laptop) {
        iLaptopRepository.save(laptop);
        return "Laptop Added Successfully!!!";
    }

    // Get Laptop By I'd
    public Laptop getLaptopById(Long id){
        return iLaptopRepository.findById(id).orElseThrow();
    }

    // Get All Laptop By Brand
    public List<Laptop> getAllLaptopByBrand(BrandType brand) {
        return iLaptopRepository.findByBrand(brand);
    }

    // Update Laptop Price By I'd
    public String updateLaptopPriceById(Long id, Double price){
        Laptop existingLaptop = getLaptopById(id);

        existingLaptop.setPrice(price);
        iLaptopRepository.save(existingLaptop);

        return "Laptop price updated successfully";
    }

    // Delete Laptop By I'd
    public String deleteLaptopById(Long id) {
        iLaptopRepository.deleteById(id);
        return "Laptop Deleted Successfully";
    }
}
