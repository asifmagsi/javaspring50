/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.springmvc.class11.model;

//import javax.annotation.Entity ;
import evs.java.springmvc.class10.model.UserRole;
import evs.java.springmvc.class9.model.User;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author shahzad
 */
@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @Generated(value = "100")
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
    
    @Column(name = "phone")
    private String phone;

    @Column(name = "active")
    private Integer active;

    @Column(name = "username")
    private String username;

    @Column(name = "userpass")
    private String userpass;
//    private UserRole role ;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
    
    public User clone() {
        User um = new User() ;
        um.setName(getName());
        um.setEmail(getEmail());
        um.setId(getId());
        um.setPhone(getPhone());
        um.setUsername(getUsername());
        um.setUserpass(getUserpass());
        
        return um ;
    }

}
