/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistwithcollections2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mustafa Bayar
 */
public class ArrayListWithCollections2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Aydın");
        
        sehirler.remove("İzmir");
        Collections.sort(sehirler);
        
        for(String sehir: sehirler){
            System.out.println(sehir);
        }
    }
    
}
