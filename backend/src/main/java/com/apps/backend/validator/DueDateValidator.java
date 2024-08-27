package com.apps.backend.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DueDateFormatValidator.class)
public @interface DueDateValidator{
    String message() default "Invalid due date value";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}