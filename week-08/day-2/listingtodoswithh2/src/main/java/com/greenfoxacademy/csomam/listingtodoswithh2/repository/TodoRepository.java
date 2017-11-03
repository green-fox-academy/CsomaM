package com.greenfoxacademy.csomam.listingtodoswithh2.repository;

import com.greenfoxacademy.csomam.listingtodoswithh2.modules.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{


}