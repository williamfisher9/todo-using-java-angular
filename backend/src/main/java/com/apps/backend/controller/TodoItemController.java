package com.apps.backend.controller;

import com.apps.backend.dto.Response;
import com.apps.backend.dto.TodoItemDTORequest;
import com.apps.backend.model.TodoItem;
import com.apps.backend.service.TodoItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/todo")
public class TodoItemController {
    private final TodoItemService service;

    @Autowired
    public TodoItemController(TodoItemService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Response> getAll(){
        Response response = new Response();
        response.setTodoItems(service.getAllItems());
        response.setStatusCode(200);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response> createItem(@Valid @RequestBody TodoItemDTORequest request){
        TodoItem item = new TodoItem(request.getDetails(), request.getStatus(), request.getDueDate());
        TodoItem savedItem = service.createItem(item);
        Response response = new Response();
        response.setStatusCode(200);
        response.setTodoItems(savedItem);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
