package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

	@GetMapping("/")
	public String welcomeToUser(@AuthenticationPrincipal  OidcUser principal){
		return "Welcome "+principal.getFullName();
	}



	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
