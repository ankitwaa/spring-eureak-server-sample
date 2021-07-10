package com.example.springeureakserversample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringEureakServerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEureakServerSampleApplication.class, args);
	}

}
