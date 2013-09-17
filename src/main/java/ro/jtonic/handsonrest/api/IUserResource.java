package ro.jtonic.handsonrest.api;

import org.apache.cxf.common.util.Base64Exception;
import ro.jtonic.handsonrest.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jtonic on 9/17/13.
 */
@Path("users")
@Produces(MediaType.APPLICATION_JSON)
public interface IUserResource {

    @GET
    List<User> getUsers(@HeaderParam(HttpHeaders.AUTHORIZATION) String authorization) throws Base64Exception;

}
