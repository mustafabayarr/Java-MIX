/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablearguments;

/**
 *
 * @author Mustafa Bayar
 */
public class VariableArguments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println(gather(1,2,2,6));
    }
    
    
     public static int gather(int... numbers){  // arkaplanda "int..." array gibi davranıyor 
         int sum = 0;
         
         for(int number:numbers){
             sum+=number;
         }
         return sum;
    }
}

   
