/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pramojan
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class databaseconnectivity {
    Connection conn;
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/hamrolybrary","root","");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }}

 

