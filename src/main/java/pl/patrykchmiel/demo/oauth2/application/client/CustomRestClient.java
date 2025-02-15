package pl.patrykchmiel.demo.oauth2.application.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.net.URI;

@Component
public class CustomRestClient {

    private final RestClient restClient;

    public CustomRestClient(RestClient restClient) {
        this.restClient = restClient;
    }

    public <T> T get(URI uri, ParameterizedTypeReference<T> responseType) {
        return restClient.get().uri(uri).retrieve().body(responseType);
    }
}
