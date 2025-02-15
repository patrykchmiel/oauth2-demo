package pl.patrykchmiel.demo.oauth2.application.user;

import org.springframework.stereotype.Component;
import pl.patrykchmiel.demo.oauth2.application.user.model.AppUser;
import pl.patrykchmiel.demo.oauth2.application.user.model.UserInfo;

import java.util.List;

@Component
public class UserInfoFactory {

    UserInfo create(AppUser appUser, List<String> repos) {
        return UserInfo.builder()
                .userName(appUser.getUsername())
                .repositories(repos)
                .build();
    }
}
