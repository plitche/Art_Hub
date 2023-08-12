package com.artHub;

import com.artHub.config.SiteMeshConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class ArtHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArtHubApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<SiteMeshConfig> siteMeshFilter() {

		FilterRegistrationBean<SiteMeshConfig> filter = new FilterRegistrationBean<SiteMeshConfig>();
		filter.setFilter(new SiteMeshConfig());

		return filter;

	}
}
