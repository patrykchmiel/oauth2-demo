package pl.patrykchmiel.demo.oauth2.application.user.appuser;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Component;
import pl.patrykchmiel.demo.oauth2.application.user.model.AppUser;

import java.util.Map;

@Component
public class AppUserFactory {

    public AppUser create(OAuth2User oAuth2User) {
        Map<String, Object> attributes = oAuth2User.getAttributes();
        return AppUser.builder()
                .username((String)attributes.get("login"))
                .reposUrl((String)attributes.get("repos_url"))
                .build();
    }
}
