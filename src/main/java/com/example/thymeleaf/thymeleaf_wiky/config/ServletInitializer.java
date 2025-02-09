package com.example.thymeleaf.thymeleaf_wiky.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.example.thymeleaf.thymeleaf_wiky.ThymeleafWikyApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ThymeleafWikyApplication.class);
	}
}