package com.iu.home.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.extern.slf4j.Slf4j;

@Configuration //**-context.xml의 역할(설정)
@Slf4j
public class WebConfig implements WebMvcConfigurer {
	
	@Value("${app.upload.base}")//spEl
	private String filePath;
	@Value("${app.url.path}")	
	private String urlPath;

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		log.info("============================================================");
		log.info("FilePath: {}", filePath);
		log.info("URL Path: {}", urlPath);
		log.info("============================================================");
		registry.addResourceHandler(urlPath) //요청URL주소
				.addResourceLocations(filePath);
	}
}
