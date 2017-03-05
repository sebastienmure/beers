package com.example.repository;

import com.example.model.Beer;
import com.example.model.Color;
import com.example.model.Country;
import com.example.model.Strenght;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by sebas on 12/02/2017.
 */
public interface BeerRepository extends JpaRepository<Beer, Long> {

    List<Beer> findByCountryAndColorAndStrenght(Country country, Color color, Strenght Strenght);
}
