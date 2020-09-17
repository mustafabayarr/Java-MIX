/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistwithcollections;

import java.util.ArrayList;

/**
 *
 * @author Mustafa Bayar
 */
public class ArrayListWithCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add("Ankara");
       // System.out.println(arrayList.size()); // arrayList in size ını verir.
//        System.out.println(arrayList.get(0)); // İndex 0 verir.
//        System.out.println(arrayList.get(2)); // Index 2 verir.
        /*
        arrayList.set(1, 100); // arraylistin index 1 ini 100 yapar.
        System.out.println(arrayList.get(1));
        */
        /*
        arrayList.remove(0); // index 0 ı siler. index 1 ve 2 yi index 0 ve 1 yapar. sola kaydırır yani.
        arrayList.clear();  // bütün listeyi siler.
        */
        
        for(Object arrayList1: arrayList){
            System.out.println(arrayList1);
        }
    }
    
}
