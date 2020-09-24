/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcıntro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        
        //metodları buradan çağırabilirsin.
    }
    
    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resulSet;
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resulSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            
            while(resulSet.next()){
                countries.add(new Country(resulSet.getString("Code"),resulSet.getString("Name"),resulSet.getString("Continent"),resulSet.getString("Region")));
           // System.out.println(resulSet.getString("Name"));
            }
            System.out.println(countries.size());
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            connection.close();
        }
}
    public static void insertDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resulSet;
        try{
            connection = dbHelper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce 2");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 90000);
            statement.executeUpdate(); // how many result row(s) affected. FİND
            System.out.println("Kayıt Eklendi");
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
    
    }
    
    public static void updateData() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resulSet;
        try{
            connection = dbHelper.getConnection();
            String sql = "update city set population = 1000000,district='Turkey' where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4091);
            statement.executeUpdate(); // how many result row(s) affected. FİND
            System.out.println("Kayıt Güncellendi");
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
    
    }
     public static void deleteData() throws SQLException{
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resulSet;
        try{
            connection = dbHelper.getConnection();
            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4088);
            statement.executeUpdate(); // how many result row(s) affected. FİND
            System.out.println("Kayıt silindi.");
        }catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally{
            statement.close();
            connection.close();
        }
     }
}
    