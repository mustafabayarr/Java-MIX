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
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        BaseLogger baseLogger = new BaseLogger();
//        baseLogger.log(" log mesajı.");

/*
        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger(),new ConsoleLogger()};
        
        for(BaseLogger logger: baseLoggers){
            logger.log(" log mesajı.");
        }
*/
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add(new DatabaseLogger());
        


    }
    
}
