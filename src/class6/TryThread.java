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
public class TryThread extends Thread {

    private String lastName;
    private String firstName;
    private Long delay;

    public TryThread(String lastName, String firstName, Long delay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.delay = delay;
    }

    public TryThread(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public void run() {
        while (true ){
            try{
            System.out.println(lastName);
            sleep(this.delay) ;
            System.out.println(firstName);
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread a = new TryThread("one", "1", 1000L ) ;
        Thread b = new TryThread("two", "2", 2000L);
        Thread c = new TryThread("three", "3", 3000L);
        Thread d = new TryThread("four", "4", 4000L);
        a.setDaemon(true);
        a.start(); 
        b.start(); 
//        b.join(); 
        c.start(); 
//        c.join();
        d.start();
    }

}
