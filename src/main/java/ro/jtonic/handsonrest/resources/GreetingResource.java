package ro.jtonic.handsonrest.resources;

import ro.jtonic.handsonrest.api.IGreetingResource;
import ro.jtonic.handsonrest.model.Person;

public class GreetingResource implements IGreetingResource {

    @Override
    public String hello() {
        return "Hello 1st REST project!";
    }

    @Override
    public Person twoMediaTypeSupported() {
        return  new Person("Antonel", "Pazargic", (byte)43);
    }

    @Override
    public void deleteCourse() {
        System.out.println("Deleting resource...");
    }

}
