/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.spring.class8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author shahzad
 */
@Configuration
@ComponentScan(basePackages = "evs.java.spring.class8.*")
public class ContextConfig {

    @Bean(name = "shahzad")
    public Person shahzad() {
        return new Person(1, "shahzad");
    }

    @Bean(name = "masud")
    public Person masud() {
        return new Person(2, "masud");
    }

    @Bean(name = "outputFolder")
    public java.io.File outputfolder() {
        return new java.io.File("c:/beancontextoutputfolder");
    }
    
    @Bean (name="address")
    public Address address(){
        return new Address() ;
    }
}
