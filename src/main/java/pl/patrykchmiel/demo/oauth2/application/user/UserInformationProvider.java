package pl.patrykchmiel.demo.oauth2.application.user;

import pl.patrykchmiel.demo.oauth2.application.user.model.AppUser;
import pl.patrykchmiel.demo.oauth2.application.user.model.UserInfo;
import pl.patrykchmiel.demo.oauth2.application.user.model.UserProvider;

public interface UserInformationProvider {

    UserProvider getProviderName();

    UserInfo getUserInfo(AppUser appUser);
}
