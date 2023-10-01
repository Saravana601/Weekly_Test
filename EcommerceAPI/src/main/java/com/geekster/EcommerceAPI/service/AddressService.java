package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Address;
import com.geekster.EcommerceAPI.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepository iAddressRepository;

    // Add address
    public String addAddress(Address address) {
        iAddressRepository.save(address);
        return "address added";
    }
}
