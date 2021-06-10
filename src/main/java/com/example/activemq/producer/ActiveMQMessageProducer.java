package com.example.activemq.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMessageProducer {
	
	@Autowired JmsMessagingTemplate jmsMessagingTemplate;


	 public void sendMessageToQueue (Queue destination, String payload) {
		 jmsMessagingTemplate.convertAndSend(destination, payload);
		 System.out.println("message send to queue");
	 }
}
