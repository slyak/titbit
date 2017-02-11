package com.slyak.titbit.config;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.mapping.event.LoggingEventListener;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

/**
 * .
 *
 * @author stormning on 2017/2/11.
 */

@EnableReactiveMongoRepositories(basePackages = "com.slyak.titbit.repository")
@RequiredArgsConstructor
@Configuration
public class MongoConfig extends AbstractReactiveMongoConfiguration {

	private final MongoProperties mongoProperties;

	@Bean
	public LoggingEventListener mongoEventListener() {
		return new LoggingEventListener();
	}

	@Override
	@Bean
	public MongoClient mongoClient() {
		return MongoClients.create(mongoProperties.getUri());
	}

	@Override
	protected String getDatabaseName() {
		return mongoProperties.getDatabase();
	}
}
