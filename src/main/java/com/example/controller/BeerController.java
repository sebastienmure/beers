package com.example.controller;

import com.example.model.Beer;
import com.example.model.Color;
import com.example.model.Country;
import com.example.model.Strenght;
import com.example.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sebas on 12/02/2017.
 */
@RestController
@RequestMapping("/beer")
public class BeerController {

    @Autowired
    BeerService beerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> getBeers() {
        List<Beer> beers = beerService.getBeers();
        return beers;
    }

    @RequestMapping(method = RequestMethod.GET, params = {"color", "country", "strenght"})
    public List<Beer> getBeersByCountryAndColorAndStrenght(@RequestParam ("country") String country, @RequestParam ("color") String color, @RequestParam ("strenght") String strenght) {
        Country countryParam = Country.getEnumByNameFrench(country);
        Color colorParam = Color.getEnumByNameFrench(color);
        Strenght strenghtParam = Strenght.getEnumByNameFrench(strenght);

        return beerService.getBeersByCountryAndColorAndStrenght(countryParam, colorParam, strenghtParam);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createBeer(@RequestBody Beer beer) {
        System.out.println(beer.toString());
        beerService.save(beer);
    }
}
