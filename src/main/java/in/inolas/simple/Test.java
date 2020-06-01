package in.inolas.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        HelloSpring hello1 = context.getBean(HelloSpring.class);
        HelloSpring hello2 = context.getBean(HelloSpring.class);

        System.out.println(hello1 == hello2);

        context.close();
    }
}
