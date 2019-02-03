/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import static java.lang.System.out;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.isLowerCase;

/**
 *
 * @author shahzad
 */
public class TestLetter {

    enum ShirtSize {

        small, medium, large, xlarge, xxlarge
    }

    public static void main(String[] args) {
        char a = 'A';
        if (isUpperCase(a)) {
//        if ( a > 64 && a < 92 ) {
            out.println("Upper Case");
        } else if (isLowerCase(a)) {
            out.println("Lower Case");
        }

        int i = 0;
        if (i == 0 && a == 'A') {
            out.println("Zero");
        } else if (i == 1) {
            out.println("One");
        } else if (i == 2) {
            out.println("Two");
        } else {
            out.println("Nothing");
        }

        switch (i) {
            case 10:
            case 0:
                out.println("Zero");
                break;
            case 1:
                out.println("One");
                break;
            case 2:
                out.println("Two");
                break;
            default:
                out.println("Nothing");
                break;
        }

//        expression? true : false ;
        out.println(
                i == 0 ? "Zero" 
                : i == 1 ? "One" 
                : i == 2 ? "Two" : "Nothing");

        ShirtSize size = ShirtSize.medium ;
        switch (size) {
            case small:
                break;
            case medium:
                break;
            case large:
                break;
            case xlarge:
                break;
            case xxlarge:
                break;
        }

    }

}
