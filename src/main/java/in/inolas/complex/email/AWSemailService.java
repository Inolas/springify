package in.inolas.complex.email;

import org.springframework.stereotype.Component;

@Component("awsSes")
public class AWSemailService implements EmailService
{
    @Override
    public void sendEmail(String to, String message)
    {
        System.out.println("AWS Email service - SES");
        System.out.println("Send to - "+to);
        System.out.println("Message - "+message);
    }
}
