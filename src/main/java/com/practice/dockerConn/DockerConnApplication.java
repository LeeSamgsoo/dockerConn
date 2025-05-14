package com.practice.dockerConn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DockerConnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerConnApplication.class, args);
	}

}
