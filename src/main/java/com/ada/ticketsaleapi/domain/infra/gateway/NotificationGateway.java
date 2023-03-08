package com.ada.ticketsaleapi.domain.infra.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ada.ticketsaleapi.domain.infra.client.NotificationClient;


@Component
public class NotificationGateway {

    @Autowired
    NotificationClient notificationClient;
    
    final RestTemplate client;
    
    public NotificationGateway() {
		this.client = new RestTemplate();
    	
    }

    public void sendNotification(Long id){
        notificationClient.sendNotification(id);
    }
   
 
}