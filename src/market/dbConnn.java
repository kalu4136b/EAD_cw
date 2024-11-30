/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package market;
import java.sql.*;

/**
 *
 * @author ranat
 */
public class dbConnn {
    Connection Con = null;
     
    public Connection getConnection(){
    
        try{
        
           
            
            final String url ="jdbc:mysql://localhost:3306/bill_app";
            final String user = "root";
            final String pw = "KAle@2002";
           
             Class.forName("com.mysql.cj.jdbc.Driver");
             Con=DriverManager.getConnection(url,user,pw);
           
            System.out.println("Database connected successfully.");
            
  
        }catch(Exception e){
            
            System.out.println(e);
        
        }
    
        return Con;
    }



    public static void main(String[] args) {
        dbConnn db = new dbConnn();
        Connection conn = db.getConnection();

        if (conn != null) {
            System.out.println("Connection test successful.");
        } else {
            System.out.println("Connection test failed.");
        }

        
    }
}