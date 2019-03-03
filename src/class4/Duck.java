/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

/**
 *
 * @author shahzad
 */
public class Duck extends Animal {

    String breed;

    public Duck() {
        this("Unknown");
    }

    public Duck(String breed) {
        super("Duck");
        this.breed = breed;
    }

    public Duck(String type, String breed) {
        super(type);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Duck{" + "breed=" + breed + '}' + super.toString();
    }

    @Override
    public String sound() {
        return "Quak !!!! ";
    }

    @Override
    public String color() {
        return "White";
    }

}
