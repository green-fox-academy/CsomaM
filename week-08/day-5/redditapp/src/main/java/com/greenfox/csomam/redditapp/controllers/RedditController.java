package com.greenfox.csomam.redditapp.controllers;

import com.greenfox.csomam.redditapp.modules.RedditPost;
import com.greenfox.csomam.redditapp.repository.Reddit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditController {

    @Autowired
    Reddit repo;

    @RequestMapping({"","/"})
    public String list (Model model) {
        model.addAttribute("posts", repo.findAll());
        return "index";
    }

    @RequestMapping("/add")
    public String add (Model model){
        model.addAttribute("newPost", new RedditPost());
        return "addpost";
    }

    @PostMapping("/addpost")
    public String addPost(@ModelAttribute RedditPost post) {
        repo.save(post);
        return "redirect:/";
    }

    @GetMapping("/plus/{id}")
    public String incrementScore(@PathVariable long id) {
        RedditPost tempPost = repo.findOne(id);
        tempPost.setScore(1);
        repo.save(tempPost);
        return "redirect:/";
    }

    @GetMapping("/minus/{id}")
    public String decrementScore(@PathVariable long id) {
        RedditPost tempPost = repo.findOne(id);
        tempPost.setScore(-1);
        repo.save(tempPost);
        return "redirect:/";
    }
}
