/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Mustafa Bayar
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Product product = new Product();
        product.id=25;
        product.name="Laptop";
        product.description="Asus Laptop";
        product.price=9999;
        product.stockAmount=6;
        
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
       // System.out.println(product.description);
    }
    
}
