package ro.jtonic.handsonrest.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jtonic on 8/21/13.
 */
public class StartHere {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RestClientConfig.class);
        final IRestClient restClient = ctx.getBean(IRestClient.class);
        restClient.deleteCourse();
    }

}
