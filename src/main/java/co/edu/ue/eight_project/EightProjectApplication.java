package co.edu.ue.eight_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"co.edu.ue.eight_project.model"})
@EnableJpaRepositories(basePackages =  {"co.edu.ue.eight_project.dao"})
@ComponentScan(basePackages = {
		"co.edu.ue.eight_project.service",
		"co.edu.ue.eight_project.controller",
		"co.edu.ue.eight_project.dao",
		"co.edu.ue.eight_project.security",
		"co.edu.ue.eight_project.exception"
})
public class EightProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EightProjectApplication.class, args);
	}

}
