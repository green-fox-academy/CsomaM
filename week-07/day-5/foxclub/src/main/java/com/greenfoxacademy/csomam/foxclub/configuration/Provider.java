package com.greenfoxacademy.csomam.foxclub.configuration;

import com.greenfoxacademy.csomam.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Provider {

    List<String> tricks;

    @Bean
    public Fox fox(){
        return new Fox("Mr. Fox", tricks, "pizza", "lemonade");
    }
}
