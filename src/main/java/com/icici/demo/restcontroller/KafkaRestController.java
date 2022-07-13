package com.icici.demo.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.icici.demo.producer.Producer;
import com.icici.demo.store.MessageStorage;

@RestController
public class KafkaRestController {
	
	@Autowired
	private Producer producer;
	@Autowired
	private MessageStorage messageStorage;
	
	@RequestMapping("/send")
	public String sendMessage(@RequestParam String message) {
		producer.sendMessage(message);
		return "Message was sent !!!";
	}
	
	
	@RequestMapping("/view")
	public String viewMessage() {
		return messageStorage.getAll();
	}

}
