package bean;


public class Person {
    private String email;
    private String firstName;
    private String lastName;
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
