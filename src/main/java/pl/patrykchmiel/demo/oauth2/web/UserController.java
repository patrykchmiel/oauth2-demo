package pl.patrykchmiel.demo.oauth2.web;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.patrykchmiel.demo.oauth2.application.user.UserService;
import pl.patrykchmiel.demo.oauth2.web.dto.GetUserResponseDTO;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public ResponseEntity<GetUserResponseDTO> user(@AuthenticationPrincipal OAuth2User principal) {
        return ResponseEntity.ok(userService.getUserInfo(principal));
    }

}
