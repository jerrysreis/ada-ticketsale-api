package com.ada.ticketsaleapi.domain.infra.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("notifications")
public interface NotificationClient {
    @GetMapping("/notifications/bilhetes/{id}")
    void sendNotification(@PathVariable Long long1);
}