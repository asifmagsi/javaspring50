/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestLoop {

    public static void main(String[] args) {
        // init, condition, increment, statement
        // a. while
//        int a = 0; // init
//        while (a < 10) { // condition
//            out.println(a + 1); // statement
//            a++; // incre
//        }
        // b. do-while
//        Scanner scan = new Scanner(System.in);
//        int b = scan.nextInt();
//        do {
//            out.println("2 x " + (b) + " = " + (2 * (b)));
//            b++;
//        } while (b <= 10);
        // c. for
//        for (int c = 0; c < 10; c++) {
//            out.println(c);
//        }

        // d. for-each (TODO:)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    out.println(i + ":" + j + ":" + k);
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    out.println(i + ":" + j + ":" + k + "::" + (++count));
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 10; j++) {
                for (int k = j; k < 10; k++) {

                    for (int l = k; l < 10; i++) {
                        for (int m = l; m < 10; j++) {
                            for (int n = m; n < 4; k++) {
                                if (i + j + k == l + m + n) {
//                                    break ; // terminates the loop
                                    continue; // skip current
                                }
                                out.println(i + ":" + j + ":" + k + "---" + l + ":" + m + ":" + n);
                            }
                        }
                    }
                }
            }
        }

//        1:0:0 -- 0:0:1
        
        one: for ( int i = 0 ; i < 4 ; i ++ ) {
            two: for ( int j = 0 ; j < 4 ; j ++ ) {
                three: for ( int k = 0 ; k < 4 ; k ++ ) {
                    if ( i + j == k ) {
                        break two;
                    }
                }
            }
        }
        
        // Assignment: 1
        // input from user, 2 inputs
        // LCF, LCD, Factorial, Prime 
    }

}
