package com.greenfox.csomam.redditapp.controllers;

import com.greenfox.csomam.redditapp.repository.Reddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedditController {

    @Autowired
    Reddit repo;

    @RequestMapping({"","/"})
    public String list (Model model) {
        model.addAttribute("Posts", repo.findAll());
        return "index";
    }
}
