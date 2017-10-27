package com.greenfoxacademy.csomam.foxclub.controller;

import com.greenfoxacademy.csomam.foxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class MainController
{
    @Autowired
    Fox fox;

    @RequestMapping("")
    public String indexPage(Model model){
        int trickNum;
        if (fox.getTricks() == null) {
            trickNum = 0;
        } else {
            trickNum = fox.getTricks().size();
        }
        model.addAttribute("fox", fox);
        model.addAttribute("foxTricks", trickNum);
        return "index";
    }
}
