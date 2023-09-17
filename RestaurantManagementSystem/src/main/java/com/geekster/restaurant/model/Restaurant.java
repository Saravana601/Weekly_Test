package com.geekster.restaurant.model;

import jakarta.validation.constraints.*;

public class Restaurant {

    @NotNull
    private int restaurantId;
    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]+$")
    private String restaurantName;
    private String restaurantAddress;
    @Size(min = 12,max = 12)
    @Pattern( regexp = "91[0-9]+",message = "Enter a Valid Phone Number")
    private String restaurantPhoneNumber;
    @Email(message = "Enter Valid Email")
    private String restaurantEmail;
    private String restaurantSpecialty;
    private String owner;
    private String openingHours;
    private int totalStaffs;

    public Restaurant(int restaurantId, String restaurantName, String restaurantAddress,
                      String restaurantPhoneNumber, String restaurantEmail,
                      String restaurantSpecialty, String owner, String openingHours,
                      int totalStaffs) {

        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhoneNumber = restaurantPhoneNumber;
        this.restaurantEmail = restaurantEmail;
        this.restaurantSpecialty = restaurantSpecialty;
        this.owner = owner;
        this.openingHours = openingHours;
        this.totalStaffs = totalStaffs;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhoneNumber() {
        return restaurantPhoneNumber;
    }

    public void setRestaurantPhoneNumber(String restaurantPhoneNumber) {
        this.restaurantPhoneNumber = restaurantPhoneNumber;
    }

    public String getRestaurantEmail() {
        return restaurantEmail;
    }

    public void setRestaurantEmail(String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }

    public String getRestaurantSpecialty() {
        return restaurantSpecialty;
    }

    public void setRestaurantSpecialty(String restaurantSpecialty) {
        this.restaurantSpecialty = restaurantSpecialty;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }
}
