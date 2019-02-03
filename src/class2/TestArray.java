/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author shahzad
 */
public class TestArray {

    public static void main(String[] args) {
//        int a, b, d, e, f, g, h, i, j, k;
        int[] arr = new int[10];
        arr[0] = 1; //
        // declare + init + assign
        //1.
        int[] p1; // dec
        p1 = new int[10]; // init
        p1[0] = 10; // assign

        // 2.
        int[] p2 = new int[10];  // dec + init
        p2[0] = 10; // assign

        // 3.
        int[] p3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        p3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

//        for (int i = 0; i < 10; i++) {
//            p3[i] = 10;
//        }
        Arrays.fill(p3, 3, 6, 10);
        Arrays.binarySearch(p3, 3, 10, 10); // -1 = not found, * = found

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            p3[i] = rand.nextInt(100);
        }

        // CW: Find how many times 10 comes in this array (p3)
        int found = 0, prevIndex = -1;
//        for ( int i = 0 ; i < p3.length ; i ++ ) {
        for (;;) {
            prevIndex = Arrays.binarySearch(p3,
                    prevIndex + 1, p3.length, 10);
            if (prevIndex == -1) {
                break;
            }
            found++;
        }
        p1 = null;
        p2 = null;
        p3 = null;
        System.gc();

        float[][] f = new float[4][4];

        // fixed = both dimension same
        // graph = non-linear (different x or y)
        // linear = increasing type
        float[][] f1 = new float[5][];
        f1[0] = new float[5];
        f1[1] = new float[6];
        f1[2] = new float[7];
        f1[3] = new float[8];
        f1[4] = new float[9];
//        f1[0][0] = 30 ;
//        f1[0][1] =40 ;
//        f1[0][5] = 20 ;

        for (int i = 0; i < f1.length; i++) {
            Arrays.fill(f1[i], 10);
        }

        float[][] f2 = {{2, 3}, {4, 5, 6}, {5, 4, 3, 2, 1}};

        for (int i = 0; i < f2.length; i++) {
            for (int j = 0; j < f2[i].length; j++) {
                System.out.println(f2[i][j]);
            }
        }
        
        int[][] checker = new int[10][10] ;
        for ( int i = 0 ; i < checker.length ; i ++ ) {
            for ( int j = 0 ; j < checker[i].length ; j ++ ) {
                if ( i %2 == 0 ) { // EVEN ROW
                    if ( j %2 == 0 ) {
                        checker[i][j] = 1 ;
                    }
                }
                else {
                    if ( j %2 == 1 ) {
                        checker[i][j] = 1 ;
                    }
                }
            }
        }
        
        for ( int[] x : checker ) {
            for ( int y : x ) {
                System.out.print(y + " ");
            }
            System.out.println() ; 
        }

    }

}
