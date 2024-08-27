package com.apps.backend.model;

import com.apps.backend.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class TodoItem implements Serializable {
    @Serial
    private static final long serialVersionUID = -9819283L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "details")
    @NotBlank(message = "Details field is required.")
    private String details;

    @Enumerated(value = EnumType.ORDINAL)
    private Status status;

    @Column(name = "due_date")
    private LocalDate dueDate;

    public TodoItem() {
    }

    public TodoItem(String details, Status status, LocalDate dueDate) {
        this.details = details;
        this.status = status;
        this.dueDate = dueDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem item = (TodoItem) o;
        return id == item.id && Objects.equals(details, item.details) && status == item.status && Objects.equals(dueDate, item.dueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, details, status, dueDate);
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", status=" + status +
                ", dueDate=" + dueDate +
                '}';
    }
}
