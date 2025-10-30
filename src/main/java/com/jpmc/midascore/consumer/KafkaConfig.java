package com.jpmc.midascore.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

@Configuration
@EnableKafka

public class KafkaConfig {
    // No need to define host/port — embedded Kafka will auto-wire.
}