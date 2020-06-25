/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;
import java.awt.*;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Conexion {
   
    static Connection conexion=null;
    static String driver="com.mysql.jdbc.Driver";
    static String url="jdbc:mysql://localhost/cuenta";
    
   
    public static Statement sentencia;
    public Connection Conectar(){
        
    try 
    {
       if(conexion==null){
           Class.forName(driver);
           conexion=DriverManager.getConnection(url,"root","12345");
           System.out.println("CONEXION CORRECTA");
       }
    } catch(HeadlessException | ClassNotFoundException | SQLException e){
        System.out.println(e);
    }
    return conexion;
    }}
    
    

