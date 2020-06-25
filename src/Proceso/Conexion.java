/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class Conexion {
    //private static String DRIVER="com.mysql.jdbc.Driver";
    private static String URL="jdbc:mysql://localhost:3306/cuenta";
    private static String USER="root";
    private static String PASSWORD="12345";
    
    
    static{
         try { 
             Class.forName("com.mysql.jdbc.Driver");
    } catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null,"ERROR EN EL DRIVER:"+ e);
    }
    }
    
    public Connection getConnection(){
        Connection con=null;
    try{
        con=DriverManager.getConnection(URL,USER,PASSWORD);
        JOptionPane.showConfirmDialog(null,"CONEXION EXITOSA");
        } catch(SQLException e){
        JOptionPane.showMessageDialog(null,"ERROR DE CONEXION"+ e );
    }
    return con;
    }
}
