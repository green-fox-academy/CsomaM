package com.greenfoxacademy.csomam.listingtodoswithh2;

import com.greenfoxacademy.csomam.listingtodoswithh2.modules.Todo;
import com.greenfoxacademy.csomam.listingtodoswithh2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Listingtodoswithh2Application implements CommandLineRunner {

	@Autowired
	TodoRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Listingtodoswithh2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
