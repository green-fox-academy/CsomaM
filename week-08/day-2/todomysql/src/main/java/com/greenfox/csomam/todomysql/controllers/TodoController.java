package com.greenfox.csomam.todomysql.controllers;

import com.greenfox.csomam.todomysql.modules.Todo;
import com.greenfox.csomam.todomysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    @Autowired
    TodoRepository repo;

    @RequestMapping ({"","/"})
    public String list (Model model) {
        model.addAttribute("Todo", new Todo());
        model.addAttribute("Todos", repo.findAll());
        return "index";
    }

    @PostMapping("/add")
    public String add (@ModelAttribute Todo todo){
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("Todo", repo.findOne(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(@RequestParam("id") Long id,
                         @RequestParam("title") String title,
                         @RequestParam(value="isUrgent", required = false) boolean urgent,
                         @RequestParam(value = "isDone", required = false) boolean done) {
        Todo todo = repo.findOne(id);
        todo.setTitle(title);
        todo.setIsDone(done);
        todo.setIsUrgent(urgent);
        repo.save(todo);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete (@PathVariable Long id){
        repo.delete(id);
        return "redirect:/";
    }
}
