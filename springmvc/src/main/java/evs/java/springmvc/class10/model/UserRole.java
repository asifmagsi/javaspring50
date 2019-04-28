/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class10.model;

/**
 *
 * @author shahzad
 */
public class UserRole {

    private Integer id;
    private String name;
    private String description;
    private Integer active;

    public UserRole() {
    }

    public UserRole(Integer id, String name, String description, Integer active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}
