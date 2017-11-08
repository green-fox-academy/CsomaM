package com.greenfox.csomam.frontend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String indexPage (){
        return "index";
    }

}
