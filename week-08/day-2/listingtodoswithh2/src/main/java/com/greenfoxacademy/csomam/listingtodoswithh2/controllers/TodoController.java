package com.greenfoxacademy.csomam.listingtodoswithh2.controllers;

import com.greenfoxacademy.csomam.listingtodoswithh2.modules.Todo;
import com.greenfoxacademy.csomam.listingtodoswithh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("/todo")
public class TodoController {

    @Autowired
    TodoRepository repo;

    @RequestMapping ({"/", "/list"})
    public String list (Model model) {
        repo.findAll();
        return "todolist";
    }
}
