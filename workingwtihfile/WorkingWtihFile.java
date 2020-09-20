/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwtihfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mustafa Bayar
 */
public class WorkingWtihFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createFile();
        getInfoFile();
        readFile();
        writeFile();
        
    }
    
    public static void createFile(){
        File file = new File("F:\\JAVA(BTK)\\workingWtihFile\\src\\workingwtihfile\\students.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException ex) {
            Logger.getLogger(WorkingWtihFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void getInfoFile(){
        File file = new File("F:\\JAVA(BTK)\\workingWtihFile\\src\\workingwtihfile\\students.txt");
        if(file.exists()){
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());
        }
    }
    
    public static void readFile(){
        File file = new File("F:\\JAVA(BTK)\\workingWtihFile\\src\\workingwtihfile\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WorkingWtihFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter("F:\\JAVA(BTK)\\workingWtihFile\\src\\workingwtihfile\\students.txt",true));
            writer.newLine();
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(WorkingWtihFile.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                
    }
}
