/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import JDBC.ConnectionFactory;
import Classes.Gato;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 *
 * @author limag
 */
public class GatoDAO {
    private Connection conecta;
    

public GatoDAO(){
 this.conecta = new ConnectionFactory().conecta();

}
public void cadGato(Gato obj){
        try { 
            String sql = "INSERT INTO Gato(Nome,Idade,Raca,Sexo,Cor"
                    + ",Castrado,Vermifugado,status) VALUES (?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, obj.getId());
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getRaca());
            stmt.setString(4, obj.getSexo());
            
            stmt.setString(5, obj.getCor());
            
            stmt.setString(6, obj.getCastrado());
            stmt.setString(7, obj.getVermifugado());
            stmt.setString(8, obj.getStatus());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Gato> ConsGato(){
        try {
            List<Gato> list = new ArrayList<Gato>();
            
            String sql = "SELECT * FROM Gato"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, ConsId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Gato f = new Gato();
                
                f.setId(rs.getInt("IDGato"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getInt("Idade"));
                f.setRaca(rs.getString("Raca"));
                f.setSexo(rs.getString("Sexo"));
                f.setCor(rs.getString("Cor"));
               // f.setPorte(rs.getString("Porte"));
                f.setCastrado(rs.getString("Castrado"));
                f.setVermifugado(rs.getString("Vermifugado"));
                f.setStatus(rs.getString("status"));
                
                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //ConsultarId
    public List<Gato> ConsGatoId(Integer consId){
        try {
            List<Gato> list = new ArrayList<Gato>();
            
            String sql = "SELECT * FROM Gato WHERE idgato = ?"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, consId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Gato f = new Gato();
                
                f.setId(rs.getInt("IDGato"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getInt("Idade"));
                f.setRaca(rs.getString("Raca"));
                f.setSexo(rs.getString("Sexo"));
                f.setCor(rs.getString("Cor"));
                //f.setPorte(rs.getString("Porte"));
                f.setCastrado(rs.getString("Castrado"));
                f.setVermifugado(rs.getString("Vermifugado"));
                f.setStatus(rs.getString("status"));
                
                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   
    //com filtro

    /**
     *
     * @param tipo
     * @param arg
     * @return
     * @throws SQLException
     */
    
    /*public static ResultSet ConsCaoFiltro(String tipo, String arg) throws SQLException{
        String argumento=tipo+" "+"like '"+arg+"% '";
        ConnectionFactory conexao = new ConnectionFactory();
        PreparedStatement pstmt = conexao.getConnectionFactory().prepareStatement("SELECT idcao,nome,idade,raca,sexo,cor,porte,castrado,vermifugado FROM Cachorro WHERE"+argumento+"");
        //String sql = "SELECT idcao,no,e.idade,raca,sexo,cor,porte,castrado,vermifugado FROM Cachorro WHERE"+argumento+""; 
        //PreparedStatement pstmt = conexao.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        return rs;
    }*/
    public  List<Gato> ConsGatoFiltro(String tipo, String arg){//throws SQLException{
       //Connection con =  ConnectionFactory.getConnection();
       //PreparedStatement stmt = null;
      // ResultSet rs = null;
      try {
            List<Gato> list = new ArrayList<Gato>();
            //String argumento=tipo+" "+"like '"+arg+"% '";
            String sql = "SELECT idcao,nome,idade,raca,sexo,cor,castrado,vermifugado FROM Gato WHERE"+arg+"like ?"; 
            //stmt = con.prepareStatement("SELECT * FROM cachorro where"+argumento+"like ?");
            PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setString(1, "%"+arg+"%");
            //rs = stmt.executeQuery();
            stmt.setString(1, arg);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
               Gato f = new Gato();
                
                f.setId(rs.getInt("IDGato"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getInt("Idade"));
                f.setRaca(rs.getString("Raca"));
                f.setSexo(rs.getString("Sexo"));
                f.setCor(rs.getString("Cor"));
                //f.setPorte(rs.getString("Porte"));
                f.setCastrado(rs.getString("Castrado"));
                f.setVermifugado(rs.getString("Vermifugado"));
                
              list.add(f);
            }

           return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void alterarGato(Gato obj){
        try { 
            String sql = "UPDATE Gato SET Nome = ?,Idade = ?,Raca = ?,"
                    + "Sexo = ?,Cor = ?,Castrado = ?,Vermifugado = ?,Status = ? WHERE IDGato = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            
            stmt.setString(1, obj.getNome().toUpperCase().trim());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getRaca());
            stmt.setString(4, obj.getSexo());
            stmt.setString(5, obj.getCor());
           // stmt.setString(6, obj.getPorte());
            stmt.setString(6, obj.getCastrado());
            stmt.setString(7, obj.getVermifugado());
            stmt.setString(8, obj.getStatus());
            stmt.setInt(9, obj.getId());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
        
    public void removeCao(Gato obj){
        try { 
            String sql = "DELETE FROM Gato WHERE IDGato = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
         
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    } 
}  
