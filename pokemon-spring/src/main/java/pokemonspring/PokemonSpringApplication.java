package pokemonspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PokemonSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonSpringApplication.class, args);
	}
}
