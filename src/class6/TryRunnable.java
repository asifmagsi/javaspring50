/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author shahzad
 */
public class TryRunnable implements Runnable {

    private String lastName;
    private String firstName;
    private Long delay;

    public TryRunnable(String lastName, String firstName, Long delay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.delay = delay;
    }

    public TryRunnable(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public void run() {
        while (true ){
            try{
            System.out.println(lastName);
            Thread.sleep(this.delay) ;
            System.out.println(firstName);
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
//        Thread a = new Thread(new TryRunnable("one", "1", 1000L )) ;
//        Thread b = new Thread(new TryRunnable("two", "2", 2000L));
//        Thread c = new Thread(new TryRunnable("three", "3", 3000L));
//        Thread d = new Thread(new TryRunnable("four", "4", 4000L));
//        a.setDaemon(true);
//        a.start(); 
//        b.start(); 
////        b.join(); 
//        c.start(); 
////        c.join();
//        d.start();
        
        ExecutorService service = Executors.newFixedThreadPool(4) ;
        service.submit(new TryRunnable("one", "1", 1000L )) ;
        service.submit(new TryRunnable("two", "2", 2000L )) ;
        service.submit(new TryRunnable("three", "3", 3000L )) ;
        service.submit(new TryRunnable("four", "4", 4000L )) ;
        
    }

}
