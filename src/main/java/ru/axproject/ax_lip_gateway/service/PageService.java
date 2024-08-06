package ru.axproject.ax_lip_gateway.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PageService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC = "ax-lip-topic";

    public void sendPage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }

}
