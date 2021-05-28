package org.serratec.backend.projetocrud1.service;

import java.util.ArrayList;
import java.util.List;

import org.serratec.backend.projetocrud1.entity.TodoEntity;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	List<TodoEntity> afazeres = new ArrayList<TodoEntity> ();
	
	public void create(TodoEntity todo) {
		afazeres.add(todo);
		
	}
	
	public List<TodoEntity> read() {
		return afazeres;
	}
	
}
