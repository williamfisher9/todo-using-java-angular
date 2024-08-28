package com.apps.backend.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidateStatus.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StatusValidator {
    String message() default "Improper status type";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
