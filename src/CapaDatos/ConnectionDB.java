/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import javax.swing.JOptionPane;


/**
 *
 * @author tonyM
 */
public class ConnectionDB {
    Connection con = null;
    
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String usuario = "root";
    private static String password = "owomfZWpoTvzPvUgycymtvQvEOnQFPOG";
    private static String url = "jdbc:mysql://hayabusa.proxy.rlwy.net:10505/_PERSONAS?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e.toString(), "Project", 0);
        }
    }
    
    public Connection getConn()
    {
        try {
            con = DriverManager.getConnection(url, usuario, password);
            
        } catch (Exception e) {
            System.out.println("Error al conectarnos");
            con = null;
        }
        return con;
    }
    
}
