/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

/**
 *
 * @author shahzad
 */
public class TestArgs {

    public static void main ( String[] args ) {
        print() ;
        print(2) ;
        print(2, "two", 4, "four") ;
        print(25, "anything", true, 4E4, 12.2, 1233234234 ) ;
    }
    
    public static void print ( Object ... args ) {
        for ( Object a : args ) {
            System.out.print(a + " " ) ;
        }
        System.out.println() ;
    }
}
