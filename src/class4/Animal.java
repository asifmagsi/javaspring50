/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

import java.util.Objects;

/**
 *
 * @author shahzad
 */
public abstract class Animal implements Color{

    protected String type;

    public Animal() {
//        this.type = "Unknown";
        this("Unknown");
    }

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.type);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + type + '}';
    }

    public abstract String sound() ;
//    {
//        return "Don't know";
//    }
}
