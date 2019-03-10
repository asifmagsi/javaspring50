/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.io.Serializable;

/**
 *
 * @author shahzad
 */
public class Person implements Serializable {

    private Integer id;
    private String name;
    private String rollNo;
    private String email;

    public Person(Integer id, String name, String rollNo, String email) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", email=" + email + '}';
    }

}
