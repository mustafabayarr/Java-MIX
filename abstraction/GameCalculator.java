/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author Mustafa Bayar
 */
public abstract class GameCalculator {
    
    public abstract void hesapla();
    
    public final void gameOver(){
        System.out.println("Game Over");
    }
    
}
