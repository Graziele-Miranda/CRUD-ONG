/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import JDBC.ConnectionFactory;
import Classes.Adotante;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdotanteDAO {
    private Connection conecta;
    
    public AdotanteDAO(){
        this.conecta = new ConnectionFactory().conecta();
    }
    
    //Cadastrar Funcionario
    public void cadAdotante(Adotante obj){
        try { 
            String sql = "INSERT INTO Adotante(cpf,nome,dt_nasc,sexo,rua,num,bairro,cidade,uf"
                    + ",telefone, email) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj.getCpf());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getIdade());
            stmt.setString(4, obj.getSexo());
            stmt.setString(5, obj.getRua());
            stmt.setInt(6, obj.getNum());
            stmt.setString(7, obj.getBairro());
            stmt.setString(8, obj.getCidade());
            stmt.setString(9, obj.getUf());
            stmt.setString(10, obj.getTelefone());
            stmt.setString(11, obj.getEmail());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
    public List<Adotante> ConsAdotante(){
        try {
            List<Adotante> list = new ArrayList<Adotante>();
            
            String sql = "SELECT * FROM Adotante"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, ConsId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Adotante f = new Adotante();
                
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getString("dt_nasc"));
                f.setRua(rs.getString("Rua"));
                f.setSexo(rs.getString("sexo"));
                f.setNum(rs.getInt("Num"));
                f.setBairro(rs.getString("Bairro"));
                f.setCidade(rs.getString("Cidade"));
                f.setUf(rs.getString("Uf"));
                f.setTelefone(rs.getString("Telefone"));
                f.setEmail(rs.getString("Email"));
                
                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Adotante> ConsAdotanteCpf(String consCPF){
        try {
            List<Adotante> list = new ArrayList<Adotante>();
            
            String sql = "SELECT * FROM Adotante WHERE cpf = ?"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, consCPF);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Adotante f = new Adotante();
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("Nome"));
                f.setIdade(rs.getString("dt_nasc"));
                f.setRua(rs.getString("sexo"));
                ;
                f.setRua(rs.getString("Rua"));
                f.setNum(rs.getInt("Num"));
                f.setBairro(rs.getString("Bairro"));
                f.setCidade(rs.getString("Cidade"));
                f.setUf(rs.getString("Uf"));
                f.setTelefone(rs.getString("Telefone"));
                f.setEmail(rs.getString("Email"));
                
                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarAdotante(Adotante obj){
        try { 
            String sql = "UPDATE Adotante SET nome = ?,dt_nasc = ?,sexo = ? ,rua = ?,"
                    + "num = ?,bairro = ?, cidade = ?,uf = ?,telefone = ?, email = ? WHERE cpf = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            
            
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getIdade());
            stmt.setString(3, obj.getSexo());
            stmt.setString(4, obj.getRua());
            stmt.setInt(5, obj.getNum());
            stmt.setString(6, obj.getBairro());
            stmt.setString(7, obj.getCidade());
            stmt.setString(8, obj.getUf());
            stmt.setString(9, obj.getTelefone());
            stmt.setString(10, obj.getEmail());
            stmt.setString(11, obj.getCpf());
            
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    }
        
    public void removeAdotante(String obj){
        try { 
            String sql = "DELETE FROM Adotante WHERE cpf = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setString(1, obj);
         
            stmt.execute();
            
            stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
    } 
}