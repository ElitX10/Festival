package com.festival.msfestival;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class MsFestivalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFestivalApplication.class, args);
	}

}
