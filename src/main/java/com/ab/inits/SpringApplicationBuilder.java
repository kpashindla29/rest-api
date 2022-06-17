package com.ab.inits;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.ab.RestApiApplication;

public class SpringApplicationBuilder extends SpringBootServletInitializer {

	
	@Override
	protected org.springframework.boot.builder.SpringApplicationBuilder configure(
			org.springframework.boot.builder.SpringApplicationBuilder builder) {
		
		System.out.println("Initialized!!!!");
		return builder.sources(RestApiApplication.class);
	}
}
