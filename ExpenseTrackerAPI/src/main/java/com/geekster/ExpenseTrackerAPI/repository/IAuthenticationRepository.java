package com.geekster.ExpenseTrackerAPI.repository;

import com.geekster.ExpenseTrackerAPI.model.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepository extends JpaRepository<Authentication,Long> {
    Authentication findByTokenValue(String tokenValue);
}
