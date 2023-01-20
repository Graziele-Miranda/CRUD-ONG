/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import JDBC.ConnectionFactory;
import Classes.Almoxarifado;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;


public class AlmxDAO {
    private Connection conecta;
    

public AlmxDAO(){
 this.conecta = new ConnectionFactory().conecta();

}
public void cadProd(Almoxarifado obj){
        try { 
            String sql = "INSERT INTO Almoxarifado(Nome,cat"
                    + ",qtd) VALUES (?,?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, obj.getId());
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCat());
            stmt.setInt(3, obj.getQuant());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Almoxarifado> ConsProd(){
        try {
            List<Almoxarifado> list = new ArrayList<Almoxarifado>();
            
            String sql = "SELECT * FROM Almoxarifado"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, ConsId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Almoxarifado f = new Almoxarifado();
                
                f.setId(rs.getInt("ID"));
                f.setNome(rs.getString("Nome"));
                f.setCat(rs.getString("cat"));
                f.setQuant(rs.getInt("qtd"));

                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //ConsultarId
    public List<Almoxarifado> ConsProdId(Integer consId){
        try {
            List<Almoxarifado> list = new ArrayList<Almoxarifado>();
            
            String sql = "SELECT * FROM Almoxarifado WHERE id = ?"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, consId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Almoxarifado f = new Almoxarifado();
                
                f.setId(rs.getInt("ID"));
                f.setNome(rs.getString("Nome"));
                f.setCat(rs.getString("cat"));
                f.setQuant(rs.getInt("qtd"));

                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void alterarProd(Almoxarifado obj){
        try { 
            String sql = "UPDATE Almoxarifado SET Nome = ?,cat = ?,"
                    + "qtd = ? WHERE ID = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            
            stmt.setString(1, obj.getNome().toUpperCase().trim());
            stmt.setString(2,obj.getCat());
            stmt.setInt(3, obj.getQuant());

            stmt.setInt(4, obj.getId());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
        
    public void removeProduto(Almoxarifado obj){
        try { 
            String sql = "DELETE FROM Almoxarifado WHERE ID = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
         
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    } 

    public void removeProduto(JTextField id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}