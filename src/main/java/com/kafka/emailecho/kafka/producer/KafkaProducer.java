package com.kafka.emailecho.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.emailecho.mail.integration.model.EmailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  @Autowired
  private ObjectMapper objectMapper;

  private final KafkaTemplate<String, String> kafkaTemplate;

  public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(EmailResponse emailResponse) throws JsonProcessingException {
    String emailResponseJson = objectMapper.writeValueAsString(emailResponse);
    kafkaTemplate.send("topic1", emailResponseJson);
  }
}
