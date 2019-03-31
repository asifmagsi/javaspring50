/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class Student implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        // TODO: Handle the change
        System.out.println(
                "This change belongs to "
                + ((Teacher) o).getStudentName()
                + "[" + this.name + "]"
        );
    }

    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
