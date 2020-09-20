/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

/**
 *
 * @author Mustafa Bayar
 */
public class Threading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KronometreThreading therad1 = new KronometreThreading("thread1");
        KronometreThreading therad2 = new KronometreThreading("thread2");
        KronometreThreading therad3 = new KronometreThreading("thread3");
        
        therad1.start();
        therad2.start();
        therad3.start();
    }
    
}
