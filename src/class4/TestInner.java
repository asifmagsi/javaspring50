/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

/**
 *
 * @author shahzad
 */
public class TestInner {

    // Access 
    // public, = Available to all 
    // protected, = Available to all in same package or child
    // private, = only in class 
    // <<>> = in package only
    // Scope
    // static, = global, no object 
    // <<>> = object required
    
    public class InnerClass {
        
    }
    
    private InnerClass in = new InnerClass() ;
    
    public abstract class InnerAbstractClass{
        
    }
    
    public interface InnerInterface {
        
    }
    
    
}
