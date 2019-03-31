/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class TestObserver {

    public static void main(String[] args) throws InterruptedException {
        Teacher t = new Teacher();
        Student[] students = {
            new Student("ahmed", "ahmed@gmail.com"),
            new Student("nawaz", "nawaz@gmail.com"),
            new Student("karim", "karim@outlook.com"),
            new Student("ali", "ali@yahoo.com")
        };

        // Bind
        for (Observer o : students) {
            t.addObserver(o);
        }

        while (true) {
            t.addAssignment("Assignment - "
                    + System.currentTimeMillis());
            
            System.out.println("-------------------------------");
            Thread.sleep(3000L); 
        }
    }

}
