/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectionFactory {
    
//    private final String url = "jdbc:postgresql://localhost/AlvesBikes";
//    private final String user = "postgres";
//    private final String password = "96374159753";
    
    public Connection conecta(){
        //Connection conn = null;
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/bdong", "postgres", "534231");
           // System.out.println("Conexao estabelecida com sucesso!!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Object getConnetion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
