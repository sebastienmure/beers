package com.example.controller;

import com.example.model.Color;
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
@RequestMapping("/color")
public class ColorController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getColorsInFrench() {
        List<String> colors = new ArrayList<>();
        for (Color color : Color.values()) {
            colors.add(color.getNameFrench());
            Collections.sort(colors);
        }
        return colors;
    }
}
