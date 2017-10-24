package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong atomicID = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam(value = "name", required=false, defaultValue="World") String name, Model model) {
        long id = atomicID.getAndIncrement();
        model.addAttribute("id", id);
        model.addAttribute("name", name);

        return "greeting";
    }
}
