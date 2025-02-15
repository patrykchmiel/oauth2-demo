package pl.patrykchmiel.demo.oauth2.application.user;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import pl.patrykchmiel.demo.oauth2.application.client.github.GithubClient;
import pl.patrykchmiel.demo.oauth2.application.client.github.model.GithubRepository;
import pl.patrykchmiel.demo.oauth2.application.user.model.AppUser;
import pl.patrykchmiel.demo.oauth2.application.user.model.UserInfo;
import pl.patrykchmiel.demo.oauth2.application.user.model.UserProvider;

import java.util.List;

import static pl.patrykchmiel.demo.oauth2.Oauth2DemoApplication.LOCAL_PROFILE;

@Profile(LOCAL_PROFILE)
@Component
public class GithubUserInformationProvider implements UserInformationProvider {


    private final GithubClient githubClient;
    private final UserInfoFactory userInfoFactory;


    public GithubUserInformationProvider(GithubClient githubClient, UserInfoFactory userInfoFactory) {
        this.githubClient = githubClient;
        this.userInfoFactory = userInfoFactory;
    }

    @Override
    public UserProvider getProviderName() {
        return UserProvider.GITHUB;
    }


    @Override
    public UserInfo getUserInfo(AppUser appUser) {
        return userInfoFactory.create(appUser, getRepositories(appUser));
    }

    private List<String> getRepositories(AppUser appUser) {
        List<GithubRepository> repos = githubClient.getUserRepositories(appUser.getReposUrl());
        return repos.stream().map(GithubRepository::getFullName).toList();
    }

}
