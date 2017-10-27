package com.greenfoxacademy.csomam.foxclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NutritionController {

    @RequestMapping("/nutritionStore")
    public String nutritionStorePage () {
        return "nutritionStore";
    }

}
