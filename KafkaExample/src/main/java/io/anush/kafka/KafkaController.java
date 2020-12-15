package io.anush.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	@Autowired
	KafkaMessageProducer kafkaMessageProducer;

	@PostMapping("/pushMessage")
	public String postMessage(@RequestBody String message) {
		kafkaMessageProducer.sendMessage(message);
		return "Message Published";
	}

}