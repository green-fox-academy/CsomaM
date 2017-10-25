package com.greenfoxacademy.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise2 {

    @RequestMapping("/exercise2")
    public String htmlCeption (Model model) {
        String str = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("msg", str);
        return "htmlception";
    }
}
