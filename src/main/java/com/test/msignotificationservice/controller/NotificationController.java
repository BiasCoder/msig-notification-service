package com.test.msignotificationservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @PostMapping
    public ResponseEntity<String> sendNotification(
            @RequestParam String transactionId,
            @RequestParam String status) {

        System.out.println("Notification sent for transaction: " + transactionId + " with status: " + status);

        return ResponseEntity.ok("Notification sent");
    }
}
