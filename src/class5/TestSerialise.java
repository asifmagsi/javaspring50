/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author shahzad
 */
public class TestSerialise {

    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException {
        // Write 
        ObjectOutputStream obOut = new ObjectOutputStream(
                new FileOutputStream("c:/serial.txt"));
        synchronized (obOut) {
            obOut.writeObject(new Person(1, "shahzad", "12231", "shahzad@gmail.com"));
        }
        obOut.close();

        // Read
        ObjectInputStream obIn = new ObjectInputStream(
                new FileInputStream("c:/serial.txt"));
        Object o = obIn.readObject();
        System.out.println(o);
        obIn.close();
    }

}
