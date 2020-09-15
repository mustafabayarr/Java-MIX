/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancedemo;

/**
 *
 * @author Mustafa Bayar
 */
public class InheritanceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TeacherCrediManager teacherCrediManager = new TeacherCrediManager();
        teacherCrediManager.Hesapla();
        FarmingCrediManager farmingCrediManager = new FarmingCrediManager();
        farmingCrediManager.Hesapla();
        
        CrediUI crediUI = new CrediUI();
        crediUI.krediHesapla(teacherCrediManager); // crediUI.krediHesapla(new TeacherCrediManager());  
        crediUI.krediHesapla(new FarmingCrediManager()); // crediUI.krediHesapla(farmingCrediManager);
        crediUI.krediHesapla(new SoldierCrediManager());
        
        
          
          
        
    }
    
}
