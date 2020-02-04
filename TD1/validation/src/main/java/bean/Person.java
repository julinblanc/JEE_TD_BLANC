package bean;


import bean.validation.Login;
import bean.validation.Email;

import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {

    @NotNull
    @Email
    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Login
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
