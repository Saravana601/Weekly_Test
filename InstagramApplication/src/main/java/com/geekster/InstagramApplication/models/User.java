package com.geekster.InstagramApplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank
    private String firstName;

    private String lastName;

    @Min(16)
    @NotNull
    private Integer age;

    @Email
    private String email;

    @Size(min = 8,message = "Password atleast contains 8 letters")
    private String password;

    @Pattern(regexp = "^91\\d{10}$",message = "Phone number must start with 91")
    private String phoneNumber;
}
