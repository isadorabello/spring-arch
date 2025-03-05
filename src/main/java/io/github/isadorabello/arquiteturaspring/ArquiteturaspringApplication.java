package io.github.isadorabello.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {

		SpringApplication.run(ArquiteturaspringApplication.class, args);

		/*
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("Production", "Homologation");
		builder.run(args);

		// Contexto da aplicação - pós iniciação
		ConfigurableApplicationContext applicationContext = builder.context();
//		var produto = applicationContext.getBean("productionRepository");

		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String appName = environment.getProperty("spring.application.name");
		System.out.println("Nome da aplicação: " + appName);
		 */

	}


}
