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
public class StudentCrediManager extends BaseCrediManager {

    @Override
    public double calculateCredi(int amount) {
        return amount*1.10;
    }
    
    
}
