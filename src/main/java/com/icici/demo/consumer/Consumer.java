package com.icici.demo.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.icici.demo.store.MessageStorage;

@Component
public class Consumer {
	
	@Autowired
	private MessageStorage messageStorage;
	
	@KafkaListener(topics = "${my.app.topicname}", groupId="groupId")
	public void consume(String message) {
		messageStorage.put(message);
	}

}
