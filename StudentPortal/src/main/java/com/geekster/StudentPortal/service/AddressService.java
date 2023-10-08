package com.geekster.StudentPortal.service;

import com.geekster.StudentPortal.model.Address;
import com.geekster.StudentPortal.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository iaddressRepository;


    // Add Address
    public String addAddress(Address address) {
        iaddressRepository.save(address);
        return "Address added";
    }

    // Get All Address
    public List<Address> getAllAddress() {
        return iaddressRepository.findAll();
    }

    // Get Address By I'd
    public Address getAddressById(Long id){
        return iaddressRepository.findById(id).orElseThrow();
    }

    //Update Address by I'd
    public String updateAddressById(Long id, Address updatedAddress){
        Address existingAddress = getAddressById(id);

        existingAddress.setDistrict(updatedAddress.getDistrict());
        existingAddress.setState(updatedAddress.getState());
        existingAddress.setZipcode(updatedAddress.getZipcode());
        existingAddress.setCountry(updatedAddress.getCountry());
        existingAddress.setLandmark(updatedAddress.getLandmark());

        iaddressRepository.save(existingAddress);

        return "Address updated";
    }

    // Delete Address By I'd
    public String deleteAddressById(Long id) {
        iaddressRepository.deleteById(id);
        return "Address deleted";
    }
}
