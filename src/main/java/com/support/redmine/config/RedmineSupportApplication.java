package com.support.redmine.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = {"com.support.redmine"})
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ImportResource({ "classpath:redmine-context.xml" })
public class RedmineSupportApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RedmineSupportApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RedmineSupportApplication.class, args);
	}

}
