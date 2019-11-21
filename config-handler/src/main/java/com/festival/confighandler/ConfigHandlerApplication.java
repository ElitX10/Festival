package com.festival.confighandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigHandlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigHandlerApplication.class, args);
	}

}
