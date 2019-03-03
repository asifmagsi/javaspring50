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
public class Dog extends Animal implements BiteDisease {

    String breed;

    public Dog() {
//        this.breed = "Unknown";
        this("Unknown");
    }

    public Dog(String breed) {
        super("Dog");
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}' + super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash
                + Objects.hashCode(this.breed)
                + super.hashCode();
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
        final Dog other = (Dog) obj;
        return true;
    }

    @Override
    public String sound() {
        return "Bark Bark !!!! ";
    }

    public static void main(String[] args) {
        Duck c = new Duck("Bulgarian");
        Dog d = new Dog("Russian");

        Animal a = new Dog("American");
        Animal b = new Duck("Persian");

        Animal e = new Animal("Cat") {
            @Override
            public String sound() {
                return "Meow !!!! ";
            }

            @Override
            public String color() {
                return "Silk color ";
            }
        };

        Color f = new Color() {
            @Override
            public String color() {
                return "color ";
            }
        };

        Animal[] ar = {a, b, c, d, e};
        for (Animal aa : ar) {
            System.out.println(aa.sound());
        }

        Color[] arc = {a, b, c, d, e, f};
        for (Color aa : arc) {
            System.out.println(aa.color());
        }
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e

        // Remote 
        // VCD, AC, DVD, TV, MediaPlayer, Satellite Remote
        // work through different models, and create a simple class 
        // hierarchy for this problem
    }

    @Override
    public String color() {
        return "black";
    }

    @Override
    public String disease() {
        return "Bite Disease";
    }

}
