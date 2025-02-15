package pl.patrykchmiel.demo.oauth2.web.dto;

import lombok.Builder;

import java.util.List;

@Builder
public class GetUserResponseDTO {

    private String name;
    private List<String> repos;
}
