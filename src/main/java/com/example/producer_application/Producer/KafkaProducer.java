package com.example.producer_application.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {
    
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    public String sendMessageToTopic(String message) {
        kafkaTemplate.send(topic, message);
        return "Message sent to the Kafka Topic Successfully";
    }
}
