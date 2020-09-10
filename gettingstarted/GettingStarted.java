/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gettingstarted;

/**
 *
 * @author Mustafa Bayar
 */
public class GettingStarted {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        insan mustafa = new insan();
        mustafa.boy = 178;
        mustafa.kilo = 65;
        mustafa.yas = 21;
        System.out.println("Mustafa'nın yaşı : " + mustafa.yas + " Mustafa'nın kilosu : " + mustafa.kilo + " Mustafa'nın boyu : " + mustafa.boy);
        
        insan ahmet = new insan();
        ahmet.boy = 160;
        ahmet.kilo = 75;
        ahmet.yas = 30;
        System.out.println("Ahmet'in yaşı : " + ahmet.yas + " Ahmet'in kilosu : " + ahmet.kilo + " Ahmet'in boyu : " + ahmet.boy);
        
        mustafa.yemek();
        ahmet.yemek();
        System.out.println("Mustafa'nın yaşı : " + mustafa.yas + " Mustafa'nın kilosu : " + mustafa.kilo + " Mustafa'nın boyu : " + mustafa.boy);
        //Mustafa nın kilosu 1 arttı. Çünkü yemek metodunu bir kere çalıştırdık.
        System.out.println("Ahmet'in yaşı : " + ahmet.yas + " Ahmet'in kilosu : " + ahmet.kilo + " Ahmet'in boyu : " + ahmet.boy);
        //Aynı şekilde Ahmet'inde kilosu bir artmış oldu.

        
        
    }
    
}
