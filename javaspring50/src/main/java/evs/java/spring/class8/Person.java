/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evs.java.spring.class8;

import evs.java.spring.class7.FirstBean;
import java.io.File;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author shahzad
 */
public class Person implements InitializingBean {

    private Integer id;
    private String name;

    @Autowired
    private File outputFolder;
    
    @Autowired
    private Address address ;

    public File getOutputFolder() {
        return outputFolder;
    }

    public void setOutputFolder(File outputFolder) {
        this.outputFolder = outputFolder;
    }

    public Person() {
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("-- after all properties set -- ");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("-- Before Destroying Object ");
    }

    public void init() {
        System.out.println("--- Before Init ---");
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("---Init ---");
    }

}
