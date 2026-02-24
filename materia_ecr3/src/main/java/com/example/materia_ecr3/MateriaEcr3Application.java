package com.example.materia_ecr3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MateriaEcr3Application {

	public static void main(String[] args) {
		SpringApplication.run(MateriaEcr3Application.class, args);
	}

	@GetMapping("/")
    public String helloWorld() {
        return "API FUNCIONANDO! xD";
    }

}
