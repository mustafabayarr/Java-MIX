/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionex;

/**
 *
 * @author Mustafa Bayar
 */
public class CustomerManager {
    
    // -------- 1. yol -------
    BaseDatabaseManager baseDatabaseManager;
    
    public void getDatabase(){
        baseDatabaseManager.getData();
    }
    
    // ------ 1.yol ---------
    
    
    
    // -------- 2. yol ---------
    /*
    public void getDatabase(BaseDatabaseManager baseDatabaseManager){
        baseDatabaseManager.getData();
        
    }*/
    // -------2. yol -----------
    
}
