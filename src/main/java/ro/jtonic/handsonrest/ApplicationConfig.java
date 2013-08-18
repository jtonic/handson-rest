package ro.jtonic.handsonrest;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
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

}
