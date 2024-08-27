package com.apps.backend.dto;

import com.apps.backend.enums.Status;
import com.apps.backend.validator.DueDateValidator;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class TodoItemDTORequest {
    @NotBlank(message = "Details field is required")
    private String details;

    private Status status;

    @DueDateValidator(message = "invalid value")
    private LocalDate dueDate;

    public TodoItemDTORequest() {
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
