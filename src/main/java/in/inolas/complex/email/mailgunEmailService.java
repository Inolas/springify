package in.inolas.complex.email;

import org.springframework.stereotype.Component;

@Component("mailgun")
public class mailgunEmailService implements EmailService
{
    @Override
    public void sendEmail(String to, String message)
    {
        System.out.println("Mailgun Email service");
        System.out.println("Send to - "+to);
        System.out.println("Message - "+message);
    }
}
