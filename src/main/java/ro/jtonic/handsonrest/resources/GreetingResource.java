package ro.jtonic.handsonrest.resources;

import ro.jtonic.handsonrest.api.IGreetingResource;

public class GreetingResource implements IGreetingResource {

    @Override
    public String hello() {
        return "Hello 1st REST project!";
    }

}
