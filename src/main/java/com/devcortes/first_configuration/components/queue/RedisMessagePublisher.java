package com.devcortes.first_configuration.components.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

/**
 * Created by cortes on 25.11.18.
 */

@Service
public class RedisMessagePublisher implements MessagePublisher {

	@Autowired
	private RedisTemplate<String, Object> redisTemplate;

	@Autowired
	private ChannelTopic topic;

	public RedisMessagePublisher() {
	}

	public RedisMessagePublisher(final RedisTemplate<String, Object> redisTemplate, final ChannelTopic topic) {
		this.redisTemplate = redisTemplate;
		this.topic = topic;
	}

	public void publish(final String message) {
		redisTemplate.convertAndSend(topic.getTopic(), message);
	}
}
