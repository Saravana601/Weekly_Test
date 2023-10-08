package com.geekster.StudentPortal.repository;

import com.geekster.StudentPortal.model.Laptop;
import com.geekster.StudentPortal.model.enums.BrandType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILaptopRepository extends JpaRepository<Laptop,Long> {
    List<Laptop> findByBrand(BrandType brand);
}
