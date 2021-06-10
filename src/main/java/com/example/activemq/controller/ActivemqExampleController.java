package com.example.activemq.controller;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.activemq.producer.ActiveMQMessageProducer;

@RestController
public class ActivemqExampleController {

@Autowired ActiveMQMessageProducer activemqExampleController;

@Autowired Queue queue;
	
	@PostMapping(path = "/")
	public ResponseEntity<Void> sendPayloadToQueue(@RequestBody String payload){
		activemqExampleController.sendMessageToQueue(queue, payload);
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
}
