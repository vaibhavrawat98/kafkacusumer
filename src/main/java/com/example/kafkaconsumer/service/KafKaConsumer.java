package com.example.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafkaconsumer.constants.AppConstants;

import lombok.extern.java.Log;

@Log
@Service
public class KafKaConsumer {


    @KafkaListener(topics = AppConstants.TOPIC_NAME,
                    groupId = AppConstants.GROUP_ID)
    public void consume(String message){
        log.info(String.format("MESSAGE RECEIVED BY CONSUMER-> %s", message));
    }
}
