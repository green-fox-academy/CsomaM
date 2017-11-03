package com.greenfox.csomam.todomysql;

import com.greenfox.csomam.todomysql.modules.Todo;
import com.greenfox.csomam.todomysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

	@Autowired
	TodoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(TodomysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
