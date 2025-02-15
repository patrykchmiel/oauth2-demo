package pl.patrykchmiel.demo.oauth2.application.user;


import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import pl.patrykchmiel.demo.oauth2.application.user.appuser.AppUserFactory;
import pl.patrykchmiel.demo.oauth2.application.user.model.AppUser;
import pl.patrykchmiel.demo.oauth2.application.user.model.UserInfo;
import pl.patrykchmiel.demo.oauth2.web.dto.GetUserResponseDTO;

@Service
public class UserService {

    private final UserInformationProvider userInformationProvider;
    private final AppUserFactory appUserFactory;

    public UserService(UserInformationProvider userInformationProvider, AppUserFactory appUserFactory) {
        this.userInformationProvider = userInformationProvider;
        this.appUserFactory = appUserFactory;
    }

    public GetUserResponseDTO getUserInfo(OAuth2User oAuth2User) {
        AppUser appUser = appUserFactory.create(oAuth2User);
        UserInfo userInfo = userInformationProvider.getUserInfo(appUser);

        return GetUserResponseDTO.builder()
                .name(userInfo.getUserName())
                .repos(userInfo.getRepositories())
                .build();
    }
}
