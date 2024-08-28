package com.apps.backend.dto;

import com.apps.backend.validator.DueDateValidator;
import com.apps.backend.validator.StatusValidator;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class Request {
    @NotBlank(message = "Details field is required.")
    private String details;

    @StatusValidator
    private int status;

    @DueDateValidator
    private LocalDate dueDate;

    public Request() {
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
