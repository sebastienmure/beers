package com.example.controller;

import com.example.model.Country;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sebas on 16/02/2017.
 */
@RestController
@RequestMapping("/country")
public class CountryController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getCountriesInFrench() {
        List<String> countries = new ArrayList<>();
        for (Country country : Country.values()) {
            countries.add(country.getNameFrench());
            Collections.sort(countries);
        }
        return countries;
    }
}
