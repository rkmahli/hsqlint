package com.elpsycongroo.hsqlint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.elpsycongroo.repository")
@EntityScan("com.elpsycongroo.entity")
@ComponentScan("com.elpsycongroo.controller")
public class HsqlintApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsqlintApplication.class, args);
	}

}
