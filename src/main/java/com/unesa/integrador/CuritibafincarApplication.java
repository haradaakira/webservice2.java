package com.unesa.integrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CuritibafincarApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CuritibafincarApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(CuritibafincarApplication.class);
	}

}
