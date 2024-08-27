package com.apps.backend.dto;

public class Response {
    private Object todoItems;
    private int statusCode;

    public Response() {
    }

    public Response(Object todoItems, int statusCode) {
        this.todoItems = todoItems;
        this.statusCode = statusCode;
    }

    public Object getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(Object todoItems) {
        this.todoItems = todoItems;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
