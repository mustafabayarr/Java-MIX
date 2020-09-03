/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

/**
 *
 * @author Mustafa Bayar
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String[] students = new String[3];
        students[0]="Mustafa";
        students[1]="Bayar";
        students[2]="Kulaklık";
        
        for(int i=0; i<students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("---------------");
        for(String student:students){ // students taki her student ı gez.
            System.out.println(student);
        }
    }
    
}
