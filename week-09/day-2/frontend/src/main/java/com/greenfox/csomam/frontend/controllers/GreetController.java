package com.greenfox.csomam.frontend.controllers;

import com.greenfox.csomam.frontend.modules.ErrorInput;
import com.greenfox.csomam.frontend.modules.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetController {

    @GetMapping("/greeter")
    public Object greetings (@RequestParam(value="name", required = false, defaultValue = "") String name,
                             @RequestParam(value="title", required = false, defaultValue = "") String title) {
        if (name.equals("") && title.equals("")) {
            return new ErrorInput("Please provide a name!");
        } else if (title.equals("")) {
            return new ErrorInput("Please provide a title!");
        } else {
            return new Greeter(name, title);
        }
    }
}
