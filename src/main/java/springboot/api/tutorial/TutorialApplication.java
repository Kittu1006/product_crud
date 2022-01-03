package springboot.api.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TutorialApplication {

	public static void main(String[] args) {
		System.out.println("Hello Akshat");
		SpringApplication.run(TutorialApplication.class, args);
	}

}
