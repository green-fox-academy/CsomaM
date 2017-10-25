package com.greenfoxacademy.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

    @RequestMapping("")
    public String defaultPage (Model model) {
        String str = "Welcome to my webpage!";
        String path = "resources/templates/Throw.gif";
        model.addAttribute("welcomeMSG" , str);
        model.addAttribute("path" , path);
        return "default";
    }
}
