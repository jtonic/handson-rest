package ro.jtonic.handsonrest.api;

import ro.jtonic.handsonrest.model.Person;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public interface IGreetingResource {

    @GET
    @Path("hello")
    @Produces("text/plain")
    String hello();

    @GET
    @Path("hello_again")
    @Produces({"application/vnd.ro.jtonic.hello+json;version=1", "application/json"})
    Person twoMediaTypeSupported();

    @DELETE
    @Path("course")
    void deleteCourse();


}
