/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceex;

/**
 *
 * @author Mustafa Bayar
 */
public class InterfaceEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Çoklu implementasyon
        
        IWorkable iWorkable = new Worker();
        iWorkable.work();
        IEatable iEatable = new Worker();
        iEatable.eat();
    }
    
}
