package com.greenfox.csomam.todomysql.repository;

import com.greenfox.csomam.todomysql.modules.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{
}
