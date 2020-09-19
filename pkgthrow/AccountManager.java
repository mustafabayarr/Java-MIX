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
public class AccountManager {
    private double balance;
    
    public void deposit(double amount){
        balance = getBalance() + amount;
    }
    
    public void withdraw(double amount) throws BalanceInSufficentException{
        if(getBalance() >= amount){
            balance = getBalance() - amount;
        }else{
            throw new BalanceInSufficentException("Bakiye Yetersiz.");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
   
    
}
