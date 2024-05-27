package tr.edu.metu.sm703;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import jakarta.inject.Inject;

@MicronautTest
public class HomeControllerTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    public void testHomeEndpoint() {
        HttpRequest<String> request = HttpRequest.GET("/");
        HttpResponse<String> response = client.toBlocking().exchange(request, String.class);

        Assertions.assertEquals(200, response.getStatus().getCode());
        Assertions.assertEquals("Hello World", response.getBody().orElse(null));
    }
}
