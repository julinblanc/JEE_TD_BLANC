package bean;


import javax.validation.Constraint;
import javax.validation.constraints.Size;

public class Person {

    private String email;
    private String firstName;

    private String lastName;

    @Size(min = 2, max = 8)
    private String login;

    private boolean isStudent;

    public Person(String em, String firstN, String lastN, String log, boolean stu) {
        email = em;
        firstName = firstN;
        lastName = lastN;
        login = log;
        isStudent = stu;
    }
}
