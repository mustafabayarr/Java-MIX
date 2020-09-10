/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author Mustafa Bayar
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String message = "Bugün hava çok güzel";
        
        System.out.println(message);
        System.out.println("Eleman sayisi : " + message.length()); //mesajın uzunluğunu verir => 20
        System.out.println("5. elemanı : " + message.charAt(4));  //4. index teki harfi verir.
        System.out.println(message.concat(". Pikniğe gidelim!")); //yazdığım stringi mesajımın sonuna ekler.
        System.out.println(message); //en başta tanımladığım message verir. => "Bugün hava çok güzel"
        System.out.println(message.startsWith("B")); // B ile başladığı için true dödürdü.Büyük/Küçük harf duyarlılığı olduğu için küçük b olsaydı false döndürürdü.
        System.out.println(message.startsWith("AB")); // AB ile başlamadığı için false döndürdü.
        System.out.println(message.endsWith("l")); //message l ile bittiği için true döndürür.
        System.out.println(message.endsWith("e")); // message e ile bitmediği için false döndürdü.
        
        char[] ch = new char[5];
        message.getChars(0,5, ch, 0); // srcEnd bir eksiğini alıyor! 
        System.out.println(ch); // Aldığımız karakterleri yazdırdık.
        
        System.out.println(message.indexOf("ava")); // ilk gördüğü a nın indexi döndürür. Eğer message ta olmayan bir string verirsek -1 döndürür.
        System.out.println(message.lastIndexOf('a')); // sondan arama yapar hava daki ikinci a yı görür.
        
        
        
    }
    
}
