package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService notification = new EmailService();

        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
