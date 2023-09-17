package com.geekster.restaurant.repository;

import com.geekster.restaurant.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DataSource {
    @Bean
    public List<Restaurant> dataSourcee(){
        return new ArrayList<>();
    }
}
