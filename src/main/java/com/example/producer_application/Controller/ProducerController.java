package com.example.producer_application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.producer_application.Producer.KafkaProducer;

@RestController
public class ProducerController {
    
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/publish")
    public String sendMessageToTopic(@RequestParam(name = "message") String message) {
        return kafkaProducer.sendMessageToTopic(message);
    }

    @PostMapping("/publish")
    public String sendMessageObjectToTopic(@RequestBody String message) {
        return kafkaProducer.sendMessageToTopic(message);
    }
}
