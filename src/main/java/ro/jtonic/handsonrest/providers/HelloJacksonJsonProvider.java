package ro.jtonic.handsonrest.providers;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@Consumes(HelloJacksonJsonProvider.MESSAGES_MEDIA_TYPE)
@Produces(HelloJacksonJsonProvider.MESSAGES_MEDIA_TYPE)
public class HelloJacksonJsonProvider extends JacksonJsonProvider {

	public static final String MESSAGES_MEDIA_TYPE = "application/vnd.ro.jtonic.hello+json;version=1";
}
