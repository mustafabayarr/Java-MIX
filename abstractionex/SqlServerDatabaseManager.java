/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionex;

/**
 *
 * @author Mustafa Bayar
 */
public class SqlServerDatabaseManager extends BaseDatabaseManager{
    
    @Override
    public void getData() {
        System.out.println("Veri getirildi : Sql Server");
    }
    
}
