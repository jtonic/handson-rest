package ro.jtonic.handsonrest.api;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by jtonic on 8/28/13.
 */
@Path("multipart")
public interface IMultipartResource {

    @POST
    @Path("one")
    @Consumes("multipart/form-data")
    public void postMultipartData1(@Multipart("username") String username, @Multipart("role") String role);

    @POST
    @Path("two")
    @Consumes("multipart/form-data")
    public void postMultipartData2(@Multipart(value = "username", type = MediaType.TEXT_PLAIN) String username,
                                   @Multipart(value = "role", type = MediaType.TEXT_PLAIN) String role,
                                   @Multipart(value = "image") Attachment image);

}
