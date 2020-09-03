/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistex;

/**
 *
 * @author Mustafa Bayar
 */
public class ArrayListEx {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        double[] myList = {1.1,2.2,3.3,4.4,5.4};
        double total = 0;
        double max = myList[0];
        
        for(double number:myList){
            if(max<number){
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Total : " + total);
        System.out.println("Max : " + max );
        
    }
    
}
