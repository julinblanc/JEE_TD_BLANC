package bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LastNameValidator implements ConstraintValidator<LastName, String> {

    public void initialize(LastName lastName) { }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return !s.matches("\\p{Digit}+") && s.length() > 1 && !s.isEmpty();
    }
}
