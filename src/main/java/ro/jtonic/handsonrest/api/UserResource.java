package ro.jtonic.handsonrest.api;

import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.common.util.Base64Exception;
import org.apache.cxf.common.util.Base64Utility;
import ro.jtonic.handsonrest.model.User;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by jtonic on 9/17/13.
 */
public class UserResource implements IUserResource {

    @Override
    public List<User> getUsers(String authorization) throws Base64Exception {
        if (null == authorization) {
            final Response response = Response.status(Response.Status.UNAUTHORIZED).header(HttpHeaders.WWW_AUTHENTICATE, "Basic realm=\"UserDB Realm\"").build();
            throw new WebApplicationException(response);
        }

        System.out.println("authorization = " + authorization);

        final String encodedUserPass = StringUtils.split(authorization)[1];

        final String userPass = new String(Base64Utility.decode(encodedUserPass));

        final String[] up = StringUtils.split(userPass, ":");
        final String username = up[0];
        final String password = up[1];

        System.out.println("username = " + username);
        System.out.println("password = " + password);

        if ("username".equals(username) && "password".equals(password)) {
            final User user = new User(username, "username@gmail.com");
            return Lists.newArrayList(user);
        }
        throw new WebApplicationException(Response.status(Response.Status.UNAUTHORIZED).build());
    }

}
