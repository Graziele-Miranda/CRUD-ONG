
package DAO;

import JDBC.ConnectionFactory;
import Classes.Cachorro;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




public class CaoDAO {
    private Connection conecta;
    
    public CaoDAO(){
        this.conecta = new ConnectionFactory().conecta();
    }
    
    //Cadastrar Funcionario
    public void cadCao(Cachorro obj){
        
        try { 
            String sql = "INSERT INTO Cachorro(Nome,Idade,Raca,Sexo,Cor"
                    + ",Porte,Castrado,Vermifugado,status) VALUES (?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, obj.getId());
 
            stmt.setString(1, obj.getNome());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getRaca());
            stmt.setString(4, obj.getSexo());
            stmt.setString(5, obj.getCor());
            stmt.setString(6, obj.getPorte());
            stmt.setString(7, obj.getCastrado());
            stmt.setString(8, obj.getVermifugado());
            stmt.setString(9, obj.getStatus());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    
    public List<Cachorro> ConsCao(){
        try {
            List<Cachorro> list = new ArrayList<Cachorro>();
            
            String sql = "SELECT * FROM Cachorro"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, ConsId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Cachorro f = new Cachorro();
                
                f.setId(rs.getInt("IDCao"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getInt("Idade"));
                f.setRaca(rs.getString("Raca"));
                f.setSexo(rs.getString("Sexo"));
                f.setCor(rs.getString("Cor"));
                f.setPorte(rs.getString("Porte"));
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
    public List<Cachorro> ConsCaoId(Integer consId){
        try {
            List<Cachorro> list = new ArrayList<Cachorro>();
            
            String sql = "SELECT * FROM Cachorro WHERE idcao = ?"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, consId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Cachorro f = new Cachorro();
                
                f.setId(rs.getInt("IDCao"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getInt("Idade"));
                f.setRaca(rs.getString("Raca"));
                f.setSexo(rs.getString("Sexo"));
                f.setCor(rs.getString("Cor"));
                f.setPorte(rs.getString("Porte"));
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
    public  List<Cachorro> ConsCaoFiltro(String tipo, String arg){//throws SQLException{
       //Connection con =  ConnectionFactory.getConnection();
       //PreparedStatement stmt = null;
      // ResultSet rs = null;
      try {
            List<Cachorro> list = new ArrayList<Cachorro>();
            //String argumento=tipo+" "+"like '"+arg+"% '";
            String sql = "SELECT idcao,nome,idade,raca,sexo,cor,porte,castrado,vermifugado,status FROM Cachorro WHERE"+arg+"like ?"; 
            //stmt = con.prepareStatement("SELECT * FROM cachorro where"+argumento+"like ?");
            PreparedStatement stmt = conecta.prepareStatement(sql);
           stmt.setString(1, "%"+arg+"%");
            //rs = stmt.executeQuery();
            stmt.setString(1, arg);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Cachorro f = new Cachorro();
                
                f.setId(rs.getInt("IDCao"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getInt("Idade"));
                f.setRaca(rs.getString("Raca"));
                f.setSexo(rs.getString("Sexo"));
                f.setCor(rs.getString("Cor"));
                f.setPorte(rs.getString("Porte"));
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


    public void alterarCao(Cachorro obj){
        try { 
            String sql = "UPDATE Cachorro SET Nome = ?,Idade = ?,Raca = ?,"
                    + "Sexo = ?,Cor = ?,Porte = ?,Castrado = ?,Vermifugado = ?,Status = ? WHERE IDCao = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            
            stmt.setString(1, obj.getNome().toUpperCase().trim());
            stmt.setInt(2, obj.getIdade());
            stmt.setString(3, obj.getRaca());
            stmt.setString(4, obj.getSexo());
            stmt.setString(5, obj.getCor());
            stmt.setString(6, obj.getPorte());
            stmt.setString(7, obj.getCastrado());
            stmt.setString(8, obj.getVermifugado());
            stmt.setString(9, obj.getStatus());
            stmt.setInt(10, obj.getId());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
        
    public void removeCao(Cachorro obj){
        try { 
            String sql = "DELETE FROM Cachorro WHERE IDCao = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
         
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    } 
}  

