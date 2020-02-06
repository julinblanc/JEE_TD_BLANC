package fr.iut;

import bean.Person;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class AppTest {
    private static Validator validator;
    private Set<ConstraintViolation<Person>> violations;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void TestNOK() {
        Person p2 = new Person();
        p2.setFirstName("21");
        p2.setLastName("a");
        p2.setEmail("21");
        p2.setLogin(null);
        violations = validator.validate(p2);
        assertEquals(4, violations.size());
    }

    @Test
    public void TestOk() {
        Person p2 = new Person();
        p2.setFirstName("Toto");
        p2.setLastName("Tata");
        p2.setEmail("toto.tata@gmail.com");
        p2.setLogin("toto");
        violations = validator.validate(p2);
        assertEquals(0, violations.size());
    }

}
