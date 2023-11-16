package br.com.adriano.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adriano.todolist.entitty.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
