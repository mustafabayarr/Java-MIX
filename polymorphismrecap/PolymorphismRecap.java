/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismrecap;

/**
 *
 * @author Mustafa Bayar
 */
public class PolymorphismRecap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseCrediManager[] baseCrediManagers = new BaseCrediManager[]{new FarmingCrediManager(),new TeacherCrediManager(),new StudentCrediManager()};
        
        for(BaseCrediManager baseCrediManager:baseCrediManagers){
            System.out.println(baseCrediManager.calculateCredi(1000));
        }
    }
    
}
