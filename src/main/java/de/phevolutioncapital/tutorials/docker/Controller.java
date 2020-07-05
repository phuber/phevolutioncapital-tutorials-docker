package de.phevolutioncapital.tutorials.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	private String sayHello() {
		return "Hallo Welt!";
	}
}