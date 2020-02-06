package bean;


import bean.validation.FirstName;
import bean.validation.LastName;
import bean.validation.Login;
import bean.validation.Email;

import javax.validation.constraints.NotNull;

public class Person {

    @Email
    private String email;

    @FirstName
    private String firstName;

    @LastName
    private String lastName;

    @Login
    private String login;

    private boolean isStudent;

    public Person() {
        System.out.println("Personne créée");
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }
}
