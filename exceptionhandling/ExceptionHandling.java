/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

/**
 *
 * @author Mustafa Bayar
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            int[] array = new int[]{1,2,3,4};
            System.out.println(array[6]);
        }catch(Exception exception){
            System.out.println("Hata oluştu.");
        }finally{
            System.out.println("Finally => Ben her türlü çalışırım.");
        }
        
        
    }
    
}
