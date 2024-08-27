package com.apps.backend.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;

public class DueDateFormatValidator implements ConstraintValidator<DueDateValidator, LocalDate> {

    @Override
    public void initialize(DueDateValidator constraintAnnotation) {
    }

    @Override
    public boolean isValid(LocalDate localDate, ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}