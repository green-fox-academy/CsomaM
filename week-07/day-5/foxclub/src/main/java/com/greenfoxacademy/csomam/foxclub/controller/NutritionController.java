package com.greenfoxacademy.csomam.foxclub.controller;

import com.greenfoxacademy.csomam.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.expression.Arrays;

import java.util.List;

@Controller
public class NutritionController {

    @Autowired
    Fox fox;

    List<String> foods = java.util.Arrays.asList("pizza", "gyros", "hamburger");
    List<String> drinks = java.util.Arrays.asList("lemonade", "beer", "coke");

    @RequestMapping("/nutritionStore")
    public String nutritionStorePage (Model model) {
        model.addAttribute("foods", foods);
        model.addAttribute("drinks", drinks);
        model.addAttribute("fox", fox);
        return "nutritionStore";
    }

    @PostMapping("/save")
    public String catchPokemon(String food, String drink) {
        this.fox.setFood(food);
        this.fox.setDrink(drink);
        return "redirect:/";
    }

}
