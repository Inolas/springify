package in.inolas.simple;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HelloSpring
{
    public HelloSpring(){
        System.out.println("HelloSpring Initialized!");
    }
    public void sayHello(){
        System.out.println("Hello Spring!");
    }

}
