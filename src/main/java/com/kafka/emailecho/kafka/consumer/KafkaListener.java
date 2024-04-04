package com.kafka.emailecho.kafka.consumer;

import org.springframework.messaging.handler.annotation.Payload;

public class KafkaListener {

  @org.springframework.kafka.annotation.KafkaListener(topics = "topic1")
  void listener1(@Payload String data) {
    System.out.println("Listener 1 - Received message : "+ data);
  }
}
