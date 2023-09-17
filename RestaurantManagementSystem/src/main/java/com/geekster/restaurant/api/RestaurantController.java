package com.geekster.restaurant.api;

import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@Validated
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("restaurant/{restaurantId}")
    public Restaurant getRestaurantById(@PathVariable int restaurantId){
        return restaurantService.getRestaurant(restaurantId);
    }

    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("restaurant")
    public String addRestaurant(@RequestBody @Valid Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @PostMapping("restaurants")
    public String addRestaurant(@Valid @RequestBody List<Restaurant> restaurantListToAdd){

        return restaurantService.addRestaurants(restaurantListToAdd);
    }

    @PutMapping("restaurant/id/{id}/specialty/{updatedSpecial}")
    public String updateSpecialty(@PathVariable int id, @PathVariable String updatedSpecial){
        return restaurantService.updateSpecialty(id, updatedSpecial);

    }

    @DeleteMapping("restaurant/{id}")
    public String deleteRestaurant(@PathVariable int id){
        return restaurantService.deleteRestaurant(id);
    }


}
