package com.example.notificationservice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "eCommerce", groupId = "1234" )
    void listener(String data){
        System.out.println("Listener received: " + data + " 🎊");
    }
}
