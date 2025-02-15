package pl.patrykchmiel.demo.oauth2.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class GetUserResponseDTO {

    private String name;
    private List<String> repos;
}
