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
public class ProductManager {
    
    //JDBC ile veritabanına bağlayacaz daha sonra.
    
    public void Add(Product product){
        System.out.println("Ürün eklendi " + product.name);
    }
    
}
