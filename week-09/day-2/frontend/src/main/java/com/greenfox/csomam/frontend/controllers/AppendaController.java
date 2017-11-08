package com.greenfox.csomam.frontend.controllers;

import com.greenfox.csomam.frontend.modules.Appenda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendaController {

    @GetMapping("/appenda/{appendable}")
    public Object appenda (@PathVariable String appendable){
        return new Appenda(appendable);
    }
}
