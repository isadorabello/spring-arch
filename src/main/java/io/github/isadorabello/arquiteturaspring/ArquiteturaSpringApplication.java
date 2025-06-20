package io.github.isadorabello.arquiteturaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// ctrl + alt + o
@SpringBootApplication
public class ArquiteturaSpringApplication {

	public static void main(String[] args) {


		SpringApplication.run(ArquiteturaSpringApplication.class, args);

		/*
		var context = SpringApplication.run(ArquiteturaSpringApplication.class, args);
		AutorRepository autorRepository = context.getBean(AutorRepository.class);
		exemploSalvarRegistro(autorRepository);
		 */

		/*
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("Production", "Homologation");
		builder.lazyInitialization(true); //ou ir no arquivo .properties e usar a seguinte linha: spring.main.lazy-inicialization=true (apenas nesse contexto faz sentido usar a marcação @Lazy(false) em outros beans)
		builder.run(args);

		// Contexto da aplicação - pós iniciação
		ConfigurableApplicationContext applicationContext = builder.context();
//		var produto = applicationContext.getBean("productionRepository");

		// ConfigurableEnvironment environment = applicationContext.getEnvironment();
		// String appName = environment.getProperty("spring.application.name");
		// System.out.println("Nome da aplicação: " + appName);

		// ToDoValidator valor = applicationContext.getBean(ToDoValidator.class);
		// valor.imprimirVariavel();
		 */

	}

	/*
	public static void exemploSalvarRegistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setNome("Mariana Bezerra de Moraes");
		autor.setNacionalidade("Brasileira");
		autor.setDataNascimento(LocalDate.of(1996, 5, 23));
		var autorSalvo = autorRepository.save(autor);
		System.out.println(autorSalvo);
	}
	*/

}
