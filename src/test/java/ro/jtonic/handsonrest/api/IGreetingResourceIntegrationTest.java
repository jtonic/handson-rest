package ro.jtonic.handsonrest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
public class IGreetingResourceIntegrationTest extends AbstractTestNGSpringContextTests {

    @Configuration
    static class ContextConfiguration {

        @Bean
        public Person person() {
            return new Person("Antonel", "Pazargic");
        }

        @Bean
        public RestTemplate restTemplate() {
            RestTemplate restTemplate = new RestTemplate();
           return restTemplate;
        }

    }

    @Autowired
    private Person person;

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void testPerson() {
        Assert.assertNotNull(person);
    }

    @Test
    public void testResource() {
        final ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:9000/cxf/test/name", String.class);
        final String name = entity.getBody();
        Assert.assertEquals(name, "Antonel Pazargic");
    }

}
