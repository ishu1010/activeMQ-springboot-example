package com.example.activemq.onfig;

import javax.jms.Queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsMessagingTemplate;

@Configuration
@EnableJms
public class ActiveMQQueueConfig {

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("test.queue");
	}
	
	@Value("${spring.activemq.broker-url}")
	private String activeMQBrokerUrl;

	@Bean
	public ActiveMQConnectionFactory activeMQConnectionFactory() {
		return new ActiveMQConnectionFactory(activeMQBrokerUrl);
	}
	
	@Bean 
	public JmsMessagingTemplate jmsMessagingTemplate() {
		return new JmsMessagingTemplate(activeMQConnectionFactory());
	}

}
