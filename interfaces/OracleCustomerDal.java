/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Mustafa Bayar
 */
public class OracleCustomerDal implements ICustomerDal,IRepository{

    @Override
    public void add() {
        System.out.println("Oracle eklendi.");
    }

    @Override
    public void something() {
        System.out.println("Something happen from Oracle");
    }
    
}
