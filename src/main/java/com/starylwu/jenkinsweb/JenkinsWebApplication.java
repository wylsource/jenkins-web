package com.starylwu.jenkinsweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsWebApplication.class, args);
	}
}
