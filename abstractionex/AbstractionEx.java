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
public class AbstractionEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        
        // --------- 1. yol ----------
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.getDatabase();
        
        // ------- 2 .yol -----------
       // customerManager.getDatabase(new MySqlDatabaseManager());
    }
    
}
