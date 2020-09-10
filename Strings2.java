/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings2;

/**
 *
 * @author Mustafa Bayar
 */
public class Strings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String message = "Bugün hava çok güzel";
        System.out.println(message);
        
        String newMessage = message.replace(" ","-"); // boşluk yerine - almasını istedik.
        System.out.println(newMessage);
        
        System.out.println(message.substring(2,5)); // bitiş-1 alır => 5-1 
        
        for(String word: message.split(" ")){  // boşluğa göre message ın her kelimesini word e dizi olarak atar ve
            System.out.println(word);          // alt alta her kelimeyi yazar.
        }
        
        System.out.println(message.toLowerCase()); // Bütün mesajı küçük harfe çevirir
        System.out.println(message.toUpperCase()); // Bütün mesajı büyük harfe çevirir
        
        
    }
    
}
