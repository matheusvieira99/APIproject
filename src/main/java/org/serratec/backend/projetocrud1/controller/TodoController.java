package org.serratec.backend.projetocrud1.controller;

import java.util.List;

import org.serratec.backend.projetocrud1.entity.TodoEntity;
import org.serratec.backend.projetocrud1.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todo")
public class TodoController {
	@Autowired
	private TodoService service;
	
	@PostMapping("/")
	public String cadastrar(@RequestBody TodoEntity todo) {
		todo.setId(service.read().size()+1);
		service.create(todo);
		return "Cadastrado com sucesso";
		
	}
	@GetMapping("/")
	public List<TodoEntity> obter() {
		return service.read();
	}
}
