package org.example.notification;

public class PopNotificationService implements NotificationService {

    @Override
    public void sendNotification(){
        System.out.println("PopNotification Send");
    }

}
