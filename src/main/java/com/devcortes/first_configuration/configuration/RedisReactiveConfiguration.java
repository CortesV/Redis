/*
package com.devcortes.first_configuration.configuration;

import com.devcortes.first_configuration.components.enity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveKeyCommands;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.connection.ReactiveStringCommands;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.annotation.PreDestroy;

*/
/**
 * Created by cortes on 25.11.18.
 *//*


@Configuration
public class RedisReactiveConfiguration {

	@Autowired
	private RedisConnectionFactory factory;

	@Bean
	public ReactiveRedisTemplate<String, Employee> reactiveRedisTemplate(ReactiveRedisConnectionFactory factory) {
		Jackson2JsonRedisSerializer<Employee> serializer = new Jackson2JsonRedisSerializer<>(Employee.class);
		RedisSerializationContext.RedisSerializationContextBuilder<String, Employee> builder = RedisSerializationContext.newSerializationContext(new StringRedisSerializer());
		RedisSerializationContext<String, Employee> context = builder.value(serializer)
				.build();
		return new ReactiveRedisTemplate<>(factory, context);
	}

	@Bean
	public ReactiveRedisTemplate<String, String> reactiveRedisTemplateString(ReactiveRedisConnectionFactory connectionFactory) {
		return new ReactiveRedisTemplate<>(connectionFactory, RedisSerializationContext.string());
	}

	@Bean
	public ReactiveKeyCommands keyCommands(final ReactiveRedisConnectionFactory reactiveRedisConnectionFactory) {
		return reactiveRedisConnectionFactory.getReactiveConnection()
				.keyCommands();
	}

	@Bean
	public ReactiveStringCommands stringCommands(final ReactiveRedisConnectionFactory reactiveRedisConnectionFactory) {
		return reactiveRedisConnectionFactory.getReactiveConnection()
				.stringCommands();
	}

	@PreDestroy
	public void cleanRedis() {
		factory.getConnection()
				.flushDb();
	}

}
*/
