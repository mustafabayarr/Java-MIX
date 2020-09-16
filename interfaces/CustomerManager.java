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
public class CustomerManager {
    /* 1.yol
    public void add(ICustomerDal customerDal){
        customerDal.add();
    }
    */
    
    /* 2. yol
    ICustomerDal customerDal;
    
    public void add(){
        customerDal.add();
    }
    */
    
    // 3.yol
    ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    
    public void add(){
        customerDal.add();
    }
}
