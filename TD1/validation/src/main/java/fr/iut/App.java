package fr.iut;

import bean.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person p = new Person();
        p.setFirstName("tata");
        p.setLastName("titi");
        p.setEmail("tata.titi@gmail.com");
        p.setLogin("toto2");
        p.setStudent(true);

    }
}
