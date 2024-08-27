package com.apps.backend.service;

import com.apps.backend.model.TodoItem;
import com.apps.backend.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TodoItemServiceImpl implements TodoItemService{
    private final TodoItemRepository repository;

    @Autowired
    public TodoItemServiceImpl(TodoItemRepository repository){
        this.repository = repository;
    }

    @Override
    public List<TodoItem> getAllItems() {
        return repository.findAll();
    }

    @Override
    public Optional<TodoItem> getItemById(long id) {
        return repository.findById(id);
    }

    @Override
    public TodoItem updateItem(long id, TodoItem item) {
        if(repository.findById(id).isPresent()){
            item.setId(id);
            return repository.save(item);
        }
        return null;
    }

    @Override
    public TodoItem createItem(TodoItem item) {
        return repository.save(item);
    }

    @Override
    public boolean deleteItem(long id) {
        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
