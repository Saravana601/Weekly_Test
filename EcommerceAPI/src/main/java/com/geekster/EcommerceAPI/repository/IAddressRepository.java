package com.geekster.EcommerceAPI.repository;

import com.geekster.EcommerceAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address,Integer> {
}
