package com.niit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceApiGateway2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApiGateway2Application.class, args);
	}

}
