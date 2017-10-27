package com.greenfoxacademy.csomam.foxclub.controller;

import com.greenfoxacademy.csomam.foxclub.model.Fox;
import com.greenfoxacademy.csomam.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrickController {

    @Autowired
    Fox fox;

    @Autowired
    Trick trick;

    @RequestMapping("/trickCenter")
    public String nutritionStorePage (Model model) {
        model.addAttribute("oldTrick", trick);
        return "trickCenter";
    }

    @PostMapping("/learn")
    public String addTrick(@ModelAttribute Trick trick) {
        this.fox.setTricks(trick.getTrick());
        return "redirect:/";
    }
}
