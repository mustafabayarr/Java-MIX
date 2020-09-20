/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mustafa Bayar
 */
public class KronometreThreading implements Runnable {
    
    private Thread thread;
    private String threadName;
    
    public KronometreThreading(String theradName){
        this.threadName = theradName;
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor :  " + threadName);
        
        for(int i=1;i<10;i++){
            System.out.println(threadName + " : " + i);
            try {
                thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Kesildi : " + threadName);
            }
        }
        System.out.println("Therad bitti : " + threadName);
    }
    
    public void start(){
        System.out.println("Therad nesnesi oluşturuluyor.");
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
    
}
