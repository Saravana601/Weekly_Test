package com.geekster.StudentPortal.repository;

import com.geekster.StudentPortal.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
