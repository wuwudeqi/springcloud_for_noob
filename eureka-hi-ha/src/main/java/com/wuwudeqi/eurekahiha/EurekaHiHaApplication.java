package com.wuwudeqi.eurekahiha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaHiHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaHiHaApplication.class, args);
	}

}
