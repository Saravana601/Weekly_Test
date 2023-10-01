package com.geekster.EcommerceAPI.service;

import com.geekster.EcommerceAPI.model.Address;
import com.geekster.EcommerceAPI.repository.IAddressRepository;
import com.geekster.EcommerceAPI.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepository iAddressRepository;

    @Autowired
    IUserRepository iUserRepository;

    // Add address
    public String addAddress(Address address) {
        iAddressRepository.save(address);
        return "address added";
    }
}
