package com.estelle.springboottodoapplication.repositories;

import com.estelle.springboottodoapplication.models.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
