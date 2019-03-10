/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestOutputStream {

    public static void main(String[] args) {
//        try {
//            FileOutputStream fout
//                    = new FileOutputStream(
//                            "c:/springjava50.txt", true);
//            fout.write("this is my file 11111".getBytes());
//            fout.close();
//        } catch (Exception e) {
//        }

        try {
            Scanner scan
                    = new Scanner(new FileInputStream(
                                    "c:/springjava50.txt"));
            System.out.println(scan.nextLine()) ;
        } catch (Exception e) {
        }
    }
}
