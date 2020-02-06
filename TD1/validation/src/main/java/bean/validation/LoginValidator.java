package bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator implements ConstraintValidator<Login, String> {

    public void initialize(Login parameters) {}

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null) return false;
        return s.length() >= 3 && s.length() <= 8 && !s.isEmpty();
    }
}
