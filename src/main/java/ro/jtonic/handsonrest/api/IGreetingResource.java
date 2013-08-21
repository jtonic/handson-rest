package ro.jtonic.handsonrest.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public interface IGreetingResource {

    @GET
    @Path("hello")
    @Produces("text/plain")
    String hello();

    @DELETE
    @Path("course")
    void deleteCourse();


}
