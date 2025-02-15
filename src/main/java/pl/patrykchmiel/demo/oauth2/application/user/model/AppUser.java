package pl.patrykchmiel.demo.oauth2.application.user.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AppUser {

    private String username;
    private String avatarUrl;
    private String followersUrl;
    private String subscriptionsUrl;
    private String reposUrl;

}
