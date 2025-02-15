package pl.patrykchmiel.demo.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Oauth2DemoApplication {

	public static final String LOCAL_PROFILE = "local";

	public static void main(String[] args) {
		SpringApplication.run(Oauth2DemoApplication.class, args);
	}

}

