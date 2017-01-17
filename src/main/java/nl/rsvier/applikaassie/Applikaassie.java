/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.rsvier.applikaassie;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jurjen
 */
public class Applikaassie {
    public static void main(String args) {
        
        try {
            // Load the driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establish connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "user", "password"); //user en password nog aanpassen
        }
        catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
         
    }
}
