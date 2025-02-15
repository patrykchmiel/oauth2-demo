package pl.patrykchmiel.demo.oauth2.application.user.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserInfo {

    private String userName;
    private List<String> repositories;
}
