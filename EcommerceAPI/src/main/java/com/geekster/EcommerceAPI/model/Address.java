package com.geekster.EcommerceAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Address")
public class Address {
    @Id
    private Integer addressID;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "landmark is required")
    private String landmark;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phoneNumber;

    @Pattern(regexp = "\\d{6}", message = "Zip code must be 6 digits")
    private String zipCode;


    private String state;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
