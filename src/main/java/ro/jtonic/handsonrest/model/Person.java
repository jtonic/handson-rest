package ro.jtonic.handsonrest.model;

/**
 * Created by jtonic on 9/3/13.
 */
public class Person {
    public String firstName;
    public String lastName;
    public byte age;

    public Person(String firstName, String lastName, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
