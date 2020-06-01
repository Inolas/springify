package in.inolas.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "in.inolas")
public class Application
{
    /*
    * 1. You don't have access to the class's source code
    * 2. You want to pre-configure instance before handing it over to Spring
    * */
//    @Bean
//    @Scope("prototype") -- default is singleton
//    public HelloSpring getHello(){
//        return new HelloSpring();
//    }
}
