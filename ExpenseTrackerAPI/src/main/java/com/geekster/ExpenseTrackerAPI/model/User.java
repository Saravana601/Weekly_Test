package com.geekster.ExpenseTrackerAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    private String userName;

    @Size(min = 10, max = 15)
    @Pattern(regexp = "\\d{10,15}", message = "Invalid phone number format")
    private String phoneNumber;

    @Email
    private String email;

    @Size(min = 8,message = "Password must contains 8 letters")
    private String password;
}
