package bean.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EmailValidator.class)

public @interface Email {

    String message() default "{Email not null or doesn't have @}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default{};

}
