package com.slyak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class })
//@EnableMongoHttpSession
//@EnableWebFlux
//@EnableSpringDataWebSupport
//@SpringBootApplication
public class TitbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TitbitApplication.class, args);
	}
}
