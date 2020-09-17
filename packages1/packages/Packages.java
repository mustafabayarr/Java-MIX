/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

//import mathematic.DortIslem;
//import mathematic.Logaritma;
import mathematic.*;

/**
 *
 * @author Mustafa Bayar
 */
public class Packages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DortIslem dortIslem = new DortIslem();
        System.out.println(dortIslem.add(4, 5));
        Logaritma logaritma = new Logaritma();
        System.out.println(logaritma.logaritmaHesapla());
                
        
    }
    
}
