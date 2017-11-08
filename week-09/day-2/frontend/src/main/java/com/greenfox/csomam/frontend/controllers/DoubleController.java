package com.greenfox.csomam.frontend.controllers;

import com.greenfox.csomam.frontend.modules.DoubleInput;
import com.greenfox.csomam.frontend.modules.ErrorInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleController {

    @GetMapping("/doubling")
    public Object doubling (@RequestParam(value = "input", required = false) Integer number) {
        if (number == null ) {
            return new ErrorInput("Please provide an input!");
        } else {
            return new DoubleInput(number);
        }
    }
}
