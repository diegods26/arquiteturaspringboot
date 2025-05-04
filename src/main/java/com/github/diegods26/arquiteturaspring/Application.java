package com.github.diegods26.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);

		SpringApplicationBuilder builder =
				new SpringApplicationBuilder(Application.class);

		builder.run(args);

		builder.bannerMode(Banner.Mode.OFF);
		ConfigurableApplicationContext applicationContext = builder.context();

		builder.profiles("producao");

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
	}

}
