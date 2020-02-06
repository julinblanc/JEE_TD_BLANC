package bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameValidator implements ConstraintValidator<FirstName, String> {

    public void initialize(FirstName firstName) { }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.matches("\\p{Digit}+") && s.length() > 1 && !s.isEmpty();
    }
}
