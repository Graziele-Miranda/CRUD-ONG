/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Classes.Agendamento;
import Classes.Cachorro;
import Classes.Gato;
import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


 
public class AgendamentoDAO {
       private Connection conecta;
       
        public AgendamentoDAO(){
        this.conecta = new ConnectionFactory().conecta();
        }  
        //int registros;
        public void cadAgenda(Agendamento obj) {//throws SQLException{
        
        try { 
            String sql = "INSERT INTO Entrevista(nomecao,nomeadot,data_ent"
                    + ",Hora) VALUES (?,?,?,?)";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, obj.getId());
 
            //stmt.setInt(1, obj.getId());
            stmt.setString(1, obj.getNomecao());
            //stmt.setString(2, obj.getNomegato().trim());
            stmt.setString(2, obj.getNomeadotante());
            stmt.setString(3, obj.getData());
            stmt.setString(4, obj.getHora());
    
           stmt.execute();
            //registros = stmt.executeUpdate();
           stmt.close();
        //int codigo = 0;
        } catch (SQLException erro){
           throw new RuntimeException(erro);
        }
       
        }      
    public  List<Agendamento> ConsAgenda(){
        try {
            List<Agendamento> list = new ArrayList<Agendamento>();
            
            String sql = 
            
                "select * from entrevista";
   
            PreparedStatement stmt = conecta.prepareStatement(sql);
            //stmt.setInt(1, ConsId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Agendamento f = new Agendamento();
                
                f.setIdentrevista(rs.getInt("identrevista"));
                f.setNomecao(rs.getString("nomecao"));
                //f.setNomegato(rs.getString("nomegato"));
                f.setNomeadotante(rs.getString("nomeadot"));
                f.setData(rs.getString("data_ent"));
                f.setHora(rs.getString("Hora"));

                
                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //ConsultarId
    public List<Agendamento> ConsAgendaId(Integer consId){
        try {
            List<Agendamento> list = new ArrayList<Agendamento>();
            
            String sql = "SELECT * FROM Entrevista WHERE identrevista = ?"; 
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, consId);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                Agendamento f = new Agendamento();
                
               f.setIdentrevista(rs.getInt("identrevista"));
                f.setNomecao(rs.getString("nomecao"));
                //f.setNomegato(rs.getString("nomegato"));
                f.setNomeadotante(rs.getString("nomeadot"));
                f.setData(rs.getString("data_ent"));
                f.setHora(rs.getString("Hora"));
                
                list.add(f);
            }

            return list;
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
  


    public void alterarAgenda(Agendamento obj){
        //int registro;
        try { 
            String sql = "UPDATE Entrevista SET nomecao = ?,nomeadot = ?,"
                    + "data_ent = ?,hora = ? WHERE IDentrevista = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            
            
            
            stmt.setString(1, obj.getNomecao());
            //stmt.setString(2, obj.getNomegato());
            stmt.setString(2, obj.getNomeadotante());
            stmt.setString(3, obj.getData());
            stmt.setString(4, obj.getHora());
            stmt.setInt(5, obj.getIdentrevista());
            
            //registro = stmt.executeUpdate();
            //if(registro == 1){
              //  return true;
            //}else{
               // return false;
            //}
            
            stmt.execute();
            
           stmt.close();
            
        } catch (SQLException erro){
            throw new RuntimeException(erro);
        }
          
    }
        
    public boolean removeAgendamento(Integer id) throws SQLException{
       int registros;
            
            String sql = "DELETE FROM Entrevista WHERE identrevista = ?";
            
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, id);
         
           // stmt.execute();
            registros = stmt.executeUpdate();
           //stmt.close();

        if(registros == 1){
            return true;
        }
        else{
            return false;}
    }
    public boolean pesquisaTela(Agendamento obj) throws SQLException{
        //int cod = obj.getId();
        
            String sql = "SELECT * FROM Entrevista WHERE identrevista = ?";
            PreparedStatement stmt = conecta.prepareStatement(sql);
            stmt.setInt(1, obj.getIdentrevista());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                Agendamento f = new Agendamento();
                
                f.setIdentrevista(rs.getInt("identrevista"));
                f.setNomecao(rs.getString("nomecao"));
               // f.setNomegato(rs.getString("nomegato"));
                f.setNomeadotante(rs.getString("nomeadot"));
                f.setData(rs.getString("data_ent"));
                f.setHora(rs.getString("Hora"));
            }
            return true;
}
}

 


    