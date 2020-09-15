/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author Mustafa Bayar
 */
public class FileLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println("Logged to File : " + message);
    }
    
}
