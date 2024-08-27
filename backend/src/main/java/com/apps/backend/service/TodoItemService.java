package com.apps.backend.service;

import com.apps.backend.model.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemService {
    List<TodoItem> getAllItems();
    Optional<TodoItem> getItemById(long id);
    TodoItem updateItem(long id, TodoItem item);
    TodoItem createItem(TodoItem item);
    boolean deleteItem(long id);
}
