package pl.patrykchmiel.demo.oauth2.application.client.github;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import pl.patrykchmiel.demo.oauth2.application.client.CustomRestClient;
import pl.patrykchmiel.demo.oauth2.application.client.github.model.GithubRepository;

import java.net.URI;
import java.util.List;

@Component
public class GithubClient {

    private final CustomRestClient customRestClient;

    public GithubClient(CustomRestClient customRestClient) {
        this.customRestClient = customRestClient;
    }

    public List<GithubRepository> getUserRepositories(String upstreamUri) {
        return customRestClient.get(URI.create(upstreamUri), new ParameterizedTypeReference<>() {});
    }
}
