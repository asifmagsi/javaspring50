/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

/**
 *
 * @author shahzad
 */
public class Single {

    @Override
    public String toString() {
        return "Single{ Class with private constructor" + '}';
    }

    
    
    private Single () {
    }
    
    private static Single inst ;
    
    public static Single getInst() {
        if ( inst == null ) {
            inst = new Single () ;
        }
        return inst ;
    }
}
