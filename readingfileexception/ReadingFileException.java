/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfileexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mustafa Bayar
 */
public class ReadingFileException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BufferedReader bufferedReader = null;
        try {
            bufferedReader=new BufferedReader(new FileReader("F:\\JAVA(BTK)\\readingFileException\\src\\readingfileexception\\sayilar.txt"));
        } catch (FileNotFoundException ex) {
            
        }finally{
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                
            }
        }
    }
    
}
