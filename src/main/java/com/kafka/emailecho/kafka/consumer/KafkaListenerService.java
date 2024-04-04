package com.kafka.emailecho.kafka.consumer;

import com.kafka.emailecho.mail.integration.model.EmailResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaListenerService {

  @KafkaListener(topics = "topic1")
  public void listenKafkaIncomingMessages(EmailResponse data) {
    try {
      //Todo- sending the reply back to sender
      log.info("Listener 1 - Received message : " + data);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
