package com.greenfox.csomam.frontend.controllers;

import com.greenfox.csomam.frontend.modules.DoUntil;
import com.greenfox.csomam.frontend.modules.ErrorInput;
import com.greenfox.csomam.frontend.modules.Until;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @PostMapping("/dountil/{method}")
    public Object doUntil (@PathVariable String method, @RequestBody(required = false) Until until) {
        if (until == null) {
            return new ErrorInput("Please provide a number!");
        } else {
            int tempUntil = until.getUntil();
            return new DoUntil(method, tempUntil);
        }
    }
}
