package in.inolas.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tester
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        NotificationService notificationService = context.getBean(NotificationService.class);
        notificationService.sendNotification("saloni@gmail.com", "Whats up!");

        context.close();
    }
}
