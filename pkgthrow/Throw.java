/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgthrow;


/**
 *
 * @author Mustafa Bayar
 */
public class Throw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AccountManager accountManager = new AccountManager();
        System.out.println(accountManager.getBalance());
        
        accountManager.deposit(100);
        System.out.println("Hesap bakiyesi : " + accountManager.getBalance());
        
        try {
            accountManager.withdraw(90);
        } catch (BalanceInSufficentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Hesap bakiyesi : " + accountManager.getBalance());
        
        try {
            accountManager.withdraw(50);
        } catch (BalanceInSufficentException exception) {
            System.out.println(exception.getMessage());
        }
        

        
        
        
        
    }
    
}
