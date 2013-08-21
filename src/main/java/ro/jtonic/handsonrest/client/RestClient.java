package ro.jtonic.handsonrest.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jtonic on 8/21/13.
 */
public class RestClient implements IRestClient {

    private RestTemplate restTemplate;

    @Autowired
    public void config(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public void deleteCourse() {
        final ResponseEntity<Void> responseEntity = restTemplate.exchange("http://localhost:9090/handson-rest/course", HttpMethod.DELETE, null, Void.class);
        final HttpStatus statusCode = responseEntity.getStatusCode();
        final Void body = responseEntity.getBody();
        System.out.println("statusCode = " + statusCode);
        System.out.println("body = " + body);
    }

}
