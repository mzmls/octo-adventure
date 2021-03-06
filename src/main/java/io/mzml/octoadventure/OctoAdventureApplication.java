package io.mzml.octoadventure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OctoAdventureApplication {

	@RequestMapping("/")
	public String home() {
		return "Hi!";
	}

	public static void main(String[] args) {
		SpringApplication.run(OctoAdventureApplication.class, args);
	}
}
