/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findanumber;

/**
 *
 * @author Mustafa Bayar
 */
public class FindANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aranacak sayıyı bulma
        int[] numbers = {1,2,3,4,5};
        int searchFor = 4;
        
        for(int number: numbers){
            if(number == searchFor){
                System.out.println("sayı bulundu" + searchFor);
            }
        }
    }
    
}
