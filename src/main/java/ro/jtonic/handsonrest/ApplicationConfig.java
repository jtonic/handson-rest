package ro.jtonic.handsonrest;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import ro.jtonic.handsonrest.api.CarResource;
import ro.jtonic.handsonrest.api.CourseResource;
import ro.jtonic.handsonrest.api.ICarResource;
import ro.jtonic.handsonrest.api.ICourseResource;
import ro.jtonic.handsonrest.api.IUserResource;
import ro.jtonic.handsonrest.api.UserResource;
import ro.jtonic.handsonrest.resources.GreetingResource;
import ro.jtonic.handsonrest.api.IGreetingResource;

@Configuration
@ImportResource({"classpath:beans.xml"})
public class ApplicationConfig {

    @Bean
    public JacksonJaxbJsonProvider jaxbJsonProvider() {
        return new JacksonJaxbJsonProvider();
    }

    @Bean
    public IGreetingResource resource() {
        return new GreetingResource();
    }

    @Bean
    public ICourseResource courseResource() {
        return new CourseResource();
    }

    @Bean
    public ICarResource carResource() {
        return new CarResource();
    }

    @Bean
    public IUserResource userResource() {
        return new UserResource();
    }

}
