package ro.jtonic.handsonrest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.PathSegment;
import java.util.List;

/**
 * Created by jtonic on 9/9/13.
 */
@Path("courses")
public interface ICourseResource {

    @GET
    String getCourses(@QueryParam("id") List<Integer> ids);

    @GET()
    @Path("query")
    String getCourses(@QueryParam("") Criteria criteria);

    @GET()
    @Path("matrix/{model}")
    String getCoursesThroughMatrix(@PathParam("model") PathSegment pathSegment);
}
