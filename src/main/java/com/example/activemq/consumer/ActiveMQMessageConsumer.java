package com.example.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageConsumer {

	@JmsListener(destination = "test.queue")
	public void MessageRecieve(String payload) {
		System.out.println("Message reciever: " + payload);
	}
}
