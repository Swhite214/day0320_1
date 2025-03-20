package com.kh.memo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //이건 spiring킬때 반드시 실행되어야한다는뜻과비슷
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOrigins("http://localhost:5173")
		.allowedMethods("GET","POST")
		.allowCredentials(true)
		;
		
	}

	
	
}
