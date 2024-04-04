package com.kafka.emailecho.kafka.producer;

import com.kafka.emailecho.mail.integration.model.EmailResponse;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

  private final KafkaTemplate<String, Object> kafkaTemplate;

  public KafkaProducerService(KafkaTemplate<String, Object> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(EmailResponse emailResponse) {
    //Todo : Sending it to seperate partition
    kafkaTemplate.send("topic1", emailResponse);
  }
}
