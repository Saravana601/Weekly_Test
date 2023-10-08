package com.geekster.StudentPortal.controller;

import com.geekster.StudentPortal.model.Address;
import com.geekster.StudentPortal.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody @Valid Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("address/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

    @PutMapping("address/{id}")
    public String updateAddressById(@PathVariable Long id, @RequestBody @Valid Address UpdatedAddress){
        return addressService.updateAddressById(id,UpdatedAddress);
    }
    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
