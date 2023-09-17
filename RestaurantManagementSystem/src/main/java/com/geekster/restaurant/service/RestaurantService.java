package com.geekster.restaurant.service;

import com.geekster.restaurant.model.Restaurant;

import com.geekster.restaurant.repository.RestaurantRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    // get all Restaurants
    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.getRestaurantList();
    }

    // get Restaurant By restaurantId
    public Restaurant getRestaurant(int id){

        List<Restaurant> originalList = getAllRestaurants();

        for (Restaurant restaurant : originalList){
            if(restaurant.getRestaurantId() == id){
                return restaurant;
            }
        }

        throw new IllegalStateException("Restaurant not found");
    }


    // add Restaurant

    public String addRestaurant(Restaurant restaurantToAdd){
        List<Restaurant> originalList = getAllRestaurants();

        originalList.add(restaurantToAdd);

        return "Restaurant added!";
    }

    // add Restaurants

    public String addRestaurants(List<Restaurant> restaurantListToAdd){
        List<Restaurant> originalList = getAllRestaurants();

        originalList.addAll(restaurantListToAdd);

        return "Restaurants added!";
    }

    // update Speciality
    public String updateSpecialty(int id, String updatedSpeciality) {
        List<Restaurant> originalList = getAllRestaurants();

        for (Restaurant restaurant: originalList){
            if(restaurant.getRestaurantId() == id){
                restaurant.setRestaurantSpecialty(updatedSpeciality);
                return "Specialty Updated!";
            }
        }
        return "Restaurant not found!";
    }

    // delete Restaurant
    public String deleteRestaurant(int id) {
        List<Restaurant> originalList = getAllRestaurants();

        for(Restaurant restaurant : originalList) {
            if (restaurant.getRestaurantId() == id) {
                originalList.remove(restaurant);
                return "Restaurant Deleted!";
            }
        }
        return "Restaurant not found!";
    }
}
