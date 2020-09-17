/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistwithclasses;

import java.util.ArrayList;

/**
 *
 * @author Mustafa Bayar
 */
public class ArrayListWithClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Customer> customers = new ArrayList<Customer>();
       Customer mustafa = new Customer(1, "Mustafa", "BAYAR");
       customers.add(mustafa);
       customers.add(new Customer(10, "Mouse", "BAYAR"));
       customers.add(new Customer(100, "Laptop", "BAYAR"));
       
       customers.remove(mustafa);
       
       for(Customer customer:customers){
           System.out.println(customer.firstName);
       }
       
    }
    
}
