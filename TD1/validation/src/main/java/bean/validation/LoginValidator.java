package bean.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LoginValidator implements ConstraintValidator<Login, String> {
    public void initialize(Login login) {}

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return true;
    }
}
