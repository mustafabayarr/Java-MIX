/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Mustafa Bayar
 */
public class CustomerManager {
    
    private BaseLogger baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }
    
    
    public void add(BaseLogger baseLogger){
        
        System.out.println("Müşteri eklendi.");
        this.baseLogger.log(" log mesajı");
    }
    
}
