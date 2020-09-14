/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfectnumber;

/**
 *
 * @author Mustafa Bayar
 */
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 27;
        int sum = 0;
        
        for(int i=1; i<number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        
        if(sum == number){
            System.out.println(number + " mükemmel sayıdır.");
        }
        else{
            System.out.println(number + " mükemmel sayı değildir.");
        }
    }
    
    
}
