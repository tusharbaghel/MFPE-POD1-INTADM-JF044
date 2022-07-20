package com.S3LT.fleetmsv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.S3LT.fleetmsv2.security.SpringSecurityAuditorAware;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class Fleetmsv2Application {

	@Bean
	public AuditorAware<String> auditorAware() {
		return new SpringSecurityAuditorAware();
	}

	public static void main(String[] args) {
		SpringApplication.run(Fleetmsv2Application.class, args);
	}

}
