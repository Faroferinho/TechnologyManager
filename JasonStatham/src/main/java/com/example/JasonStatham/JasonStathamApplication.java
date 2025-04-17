package com.example.JasonStatham;

import com.example.JasonStatham.controllers.TechnologyController;
import com.example.JasonStatham.objects.DataTransferObjects.TechnologyDTO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Jason Statham", version = "1.0", description = "Documentação"))
public class JasonStathamApplication {
	public static void main(String[] args) {
		SpringApplication.run(JasonStathamApplication.class, args);
	}
}
