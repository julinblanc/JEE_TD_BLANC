package bean.validation;

import javax.validation.Constraint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = LoginValidator.class)

public @interface Login {

    String message() default "{latin alphabet must be used.}";
    Class<?>[] groups() default {};
}
