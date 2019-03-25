package com.sid.game.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GameDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameDataApplication.class, args);
	}

}
