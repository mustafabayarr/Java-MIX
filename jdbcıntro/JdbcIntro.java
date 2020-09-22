/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcıntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Mustafa Bayar
 */
public class JdbcIntro {

//    static String userName = "root";
//    static String password = "12345";
//    static String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    public static void main(String[] args) throws SQLException {
//       
//        Connection connection = null;
//        try{
//            connection = DriverManager.getConnection(dbUrl, userName, password);
//            System.out.println("Bağlantı oluşturuldu");
//        }catch(SQLException exception){
//            System.out.println(exception.getMessage());
//        }finally{
//            connection.close();
//        }
//        
//    }

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        try{
            connection = dbHelper.getConnection();
            System.out.println("Bağlantı oluşturuldu");
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            connection.close();
        }
        
    }
    
}
