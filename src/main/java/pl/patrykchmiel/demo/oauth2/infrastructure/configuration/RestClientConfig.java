package pl.patrykchmiel.demo.oauth2.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public RestClient estClient(ClientHttpRequestFactory clientHttpRequestFactory) {

        return RestClient
                .builder()
                .requestFactory(clientHttpRequestFactory)
                .build();

    }

    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(6000);
        factory.setConnectTimeout(6000);
        return factory;
    }
}
