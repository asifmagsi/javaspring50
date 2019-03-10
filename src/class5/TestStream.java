/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestStream {

    public static void main(String[] args) {
        // Input Stream
        // int read () ; // single byte
        // int read ( byte[]) ; // multiple bytes read, count return
        // int read ( byte[], int offset, int length) ; // 

        // Output Stream
        // void write ( byte) ; single byte
        // void write ( byte[]) ; // byte array
        // void write ( byte[], int offset, int length) ; 
//        InputStream is = new BufferedInputStream(System.in) ;
//        try {
//            byte[] b = new byte[1024] ;
//            System.out.print(">> ") ;
//            int readBytes = is.read(b) ;
//            String s = new String ( b, 0, readBytes ) ;
//            System.out.println(s) ;
//        } catch (Exception e) {
//        }
//        Reader is = new BufferedReader(new InputStreamReader(System.in)) ;
//        try {
//            char[] b = new char[1024] ;
//            System.out.print(">> ") ;
//            int readBytes = is.read(b) ;
//            String s = new String ( b, 0, readBytes ) ;
//            System.out.println(s) ;
//        } catch (Exception e) {
//        }
        String charOpt = read("1. Character", "2. Digit", "3. Number", "4. Decimal");
        switch (charOpt) {
            case "1":
                read("1. Bold Character", "2. Italic", "3. Non-Italic");
                break;
            default:
                break;
        }

    }

    public static String read(String... cmds) {
        System.out.println("Choose from below, ");
        for (String cmd : cmds) {
            System.out.println(cmd);
        }
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
