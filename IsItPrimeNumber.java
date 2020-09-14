/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isıtprimenumber;

/**
 *
 * @author Mustafa Bayar
 */
public class IsItPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 1;
        boolean isPrime = true;
        
        if(number == 1){
            System.out.println(number + " asal sayı değildir.");
            return;
        }
        if(number<1){
            System.out.println("Pozitif bir sayı giriniz.");
            return;
        }
        for( int i=2; i<number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " asal sayıdır.");
        }
        else{
            System.out.println(number + " asal sayı değildir.");
        }
    }
    
}
