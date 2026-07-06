package org.example;

import org.example.notification.NotificationService;

public class OrderService {

    //    EmailService notification = new EmailService();
    NotificationService notification;

    public OrderService(NotificationService notification) {
        this.notification = notification;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        notification.sendNotification();
    }
}
