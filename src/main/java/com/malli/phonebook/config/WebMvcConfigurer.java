package com.malli.phonebook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@Profile("development")
public class WebMvcConfigurer {
	 public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/api/**").allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS");
	    }

}
