/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Mustafa Bayar
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.age = 3;
        System.out.println(customer.age);
        employee.firstName= "Mustafa";
        System.out.println(employee.firstName);
        
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.Add();
        customerManager.List();
        customerManager.Update();
        employeeManager.Add();
        employeeManager.List();
        employeeManager.BestEmployee();
        
    }
    
}
