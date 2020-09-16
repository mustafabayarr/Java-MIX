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
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // GameCalculator gameCalculator = new GameCalculator();
        // hatalı kullanımdır. Abstract bir classı direk new leyemezsin. new lersem abstract edilmiş metodları mainde override etmen gerekiyor.
        GameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
        
        GameCalculator gameCalculator1 = new ManGameCalculator();
        gameCalculator1.hesapla();
        gameCalculator1.gameOver();
        
        GameCalculator gameCalculator2 = new WomanGameCalculator();
        gameCalculator2.hesapla();
        gameCalculator2.gameOver();
    }
    
}
