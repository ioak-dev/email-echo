package com.kafka.emailecho.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class TopicConfig {

  @Bean
  public NewTopic createTopic1() {
    return TopicBuilder.name("topic1")
        .partitions(10)
        .replicas(1)
        .build();
  }

}
