/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.spring.class7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author shahzad
 */
public class Main {

    public static void main(String[] args) {
        // Load Definitions (XML)
        AbstractApplicationContext context
                = new ClassPathXmlApplicationContext(
                        "applicationContext.xml");
        // Fetch Bean 
        FirstBean first = (FirstBean) context.getBean("firstbean");
        FirstBean second = (FirstBean) context.getBean("secondbean");
FirstBean third = (FirstBean) context.getBean("thirdbean");

        // Method Invocation
        System.out.println(first.getName() + "=== " + first.hello());
        System.out.println(second.getName() + "=== " + second.hello());
        System.out.println(third.getName() + "=== " + third.hello());
    }

}
