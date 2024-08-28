package com.apps.backend.validator;

import com.apps.backend.enums.Status;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidateStatus implements ConstraintValidator<StatusValidator, Integer> {
    @Override
    public void initialize(StatusValidator constraintAnnotation) {
    }

    @Override
    public boolean isValid(Integer status, ConstraintValidatorContext constraintValidatorContext) {
        if(Status.getNameByCode(status) != null){
            return true;
        }
        return false;
    }
}
