/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author Adnan.Khadem
 */
public class PowerCalc {

    public static void main(String[] args) {
        System.out.println("5.0 ^ 4 " + power(5.0, 4));
        System.out.println("7.5 ^ 5 " + power(7.5, 5));
        System.out.println("7.5 ^ 0 " + power(7.5, 0));
        System.out.println("10.0 ^ -2 " + power(10.0, -2));
        System.out.println("-10.0 ^ 6 " + power(-10.0, 6));
    }

    public static double power(double x, long y) {
        if (y > 1) {
            return x * power(x, y - 1);
        } else if (y < 0) {
            return 1 / power(x, -y);
        } else {
            return y == 0 ? 1 : x;
        }
    }

}
