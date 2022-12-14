/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rental_motor;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class koneksi {
    private static java.sql.Connection koneksi;
    static final String jdbc_driver = "com.mysql.jdbc.Driver";
    static final String url = "jdbc:mysql://localhost:3306/rental_motor?zeroDateTimeBehavior=convertToNull";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static java.sql.Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver); 
            
        }catch(ClassNotFoundException cnf){
            
        }try{
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi Database BERHASIL", "SUKSES",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database GAGAL","PERHATIAN",JOptionPane.WARNING_MESSAGE);
        }
        return conn;
    }
}
