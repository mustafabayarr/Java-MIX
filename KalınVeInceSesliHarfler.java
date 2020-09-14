/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalınveıncesesliharfler;

/**
 *
 * @author Mustafa Bayar
 */
public class KalınVeInceSesliHarfler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        KALIN SESLİ HARFLER => A,I,O,U
        iNCE SESLİ HARFLER => E,İ,Ö,Ü
        */
        char letter = 'İ';
        
        switch(letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harftir.");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println("İnce sesli harftir.");
                break;
            default:
                System.out.println("A-E-I-İ-O-Ö-U-Ü harflerinden birini yazınız.");
        }
        
    }
    
}
