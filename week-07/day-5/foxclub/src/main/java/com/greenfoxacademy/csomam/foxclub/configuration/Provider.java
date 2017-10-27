package com.greenfoxacademy.csomam.foxclub.configuration;

import com.greenfoxacademy.csomam.foxclub.model.Fox;
import com.greenfoxacademy.csomam.foxclub.model.Trick;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Provider {

    @Bean
    public Fox fox(){
        return new Fox("Mr. Fox", new ArrayList<>(), "pizza", "lemonade");
    }

    @Bean
    public Trick trick() {
        return new Trick("");
    }
}
