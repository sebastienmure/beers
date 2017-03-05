package com.example.service;

import com.example.model.Beer;
import com.example.model.Color;
import com.example.model.Country;
import com.example.model.Strenght;
import com.example.repository.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sebas on 12/02/2017.
 */
@Service
public class BeerService {

    @Autowired
    BeerRepository beerRepository;

    public List<Beer> getBeers() {
        return beerRepository.findAll();
    }

    public List<Beer> getBeersByCountryAndColorAndStrenght(Country country, Color color, Strenght strenght) {
        return beerRepository.findByCountryAndColorAndStrenght(country, color, strenght);
    }

    public void save(Beer beer) {
        beerRepository.save(beer);
    }
}
