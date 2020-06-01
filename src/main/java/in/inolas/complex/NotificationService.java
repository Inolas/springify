package in.inolas.complex;

import in.inolas.complex.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService
{
    /*
    * Property based DI.
    * When using property based use @Autowired before the property declaration
    * And Comment the Constructor based statements
    * */
    @Autowired
    @Qualifier("mailgun")
    private EmailService emailService;

    //Constructor based dependency injection
//    @Autowired
//    public NotificationService(@Qualifier("mailgun") EmailService emailService){
//        this.emailService = emailService;
//    }

    /*
    * Setter based
    * */
//    @Autowired
//    public void setEmailService(EmailService emailService){
//        this.emailService = emailService;
//    }

    public void sendNotification(String to, String message){
        emailService.sendEmail(to, message);
    }
}
