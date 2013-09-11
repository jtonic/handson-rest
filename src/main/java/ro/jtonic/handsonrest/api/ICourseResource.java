package ro.jtonic.handsonrest.api;

import org.springframework.scheduling.quartz.SimpleTriggerBean;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.UriInfo;
import java.util.List;

/**
 * Created by jtonic on 9/9/13.
 */
@Path("courses")
public interface ICourseResource {

    @GET
    String getCourses(@QueryParam("name") String[] courseNames);

    @GET()
    @Path("query")
    String getCourses(@QueryParam("") Criteria criteria);

    @GET()
    @Path("matrix/{model}")
    String getCoursesThroughMatrix(@PathParam("model") PathSegment pathSegment);

    @GET()
    @Path("{course}/{teacher}")
    String getCourse(@PathParam("course") String course,
                     @PathParam("teacher") String teacher,
                     @MatrixParam("name") String name,
                     @MatrixParam("duration") String duration);

    @GET
    @Path("criteria")
    String getByCriteria(@Context UriInfo uriInfo);
}
