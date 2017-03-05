package com.example.controller;

import com.example.model.Color;
import com.example.model.Strenght;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sebas on 17/02/2017.
 */
@RestController
@RequestMapping("/strenght")
public class StrenghtController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getStrenghtsInFrench() {
        List<String> strenghts = new ArrayList<>();
        for (Strenght strenght : Strenght.values()) {
            strenghts.add(strenght.getNameFrench());
            Collections.sort(strenghts);
        }
        return strenghts;
    }
}
