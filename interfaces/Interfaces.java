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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
        ICustomerDal customerDal2 = new MysqlCustomeDal();
        customerDal2.add();
       
        IRepository repository = new OracleCustomerDal();
        repository.something();
        */
        
        /* 1.yol
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(new OracleCustomerDal());
        */
        
        /* 2 .yol
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal= new MysqlCustomeDal();
        customerManager.add();
        */
        
        // 3.yol
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
    
}
