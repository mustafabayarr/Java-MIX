/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fouroperantions;

/**
 *
 * @author Mustafa Bayar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FourOperations fourOperations = new FourOperations();
        System.out.println(fourOperations.add(4, 7));
        System.out.println(fourOperations.substract(4, 7));
        System.out.println(fourOperations.multiply(4, 7));
        System.out.println(fourOperations.division(4, 7));
        
    }
    
}
