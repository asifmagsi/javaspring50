/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author Shahzad
 */
public class TestString {

    public static void main(String[] args) {
//        char[] name = {'s','h','a','h','z','a','d'}; 
        String n1 = "shahzad";
        String n2 = "shahzad";
        String n3 = new String("shahzad");

        if (n1 == n2) ; // true - Reference Comparison
        if (n1 == n3) ; // false - Reference Comparison
        if (n1.equals(n2)) ;; // true - Value Comparison
        if (n1.equals(n3)) ; // true - Value Comparison
        if (n1.compareTo(n3) == 0) ; // true
        if (n1.equalsIgnoreCase(n3)) ;
        if (n1.compareToIgnoreCase(n3) == 0) ;

        n1 = "shehzad" + "masud" + "abc" + "cde";
        n1 = n1.concat("shahzad").concat("masud");

        String str = "a quick brown fox jumps over the lazy dog";

        // IndexOf
//        int idx = str.indexOf("o");
//        System.out.println(idx);
//        // LastIndexOf
//        System.out.println(str.lastIndexOf("o", 30));
//        // SubString
//        System.out.println(str.substring(2, 3));
//        System.out.println(str.substring(20));

        System.out.println(str);
        
        // Split
        String[] arr = str.split("dog1");
        for ( String ar : arr ) {
            System.out.println(ar);
        }
        
        // 3.1 == Take two inputs from user, 1 ==> Website address, 
        // 2 ==> Word to find
        
        StringBuilder strBuf = new StringBuilder() ;
        
        // 3.2 ==> User Input --> 
        // a quick brown fox jumps over the lazy doog
        // a kciuq nworb xof spmuj revo eht yzal good
    }

}
