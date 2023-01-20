/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Agendamento {

    public int getIdentrevista() {
        return identrevista;
    }

    public void setIdentrevista(int identrevista) {
        this.identrevista = identrevista;
    }
    private int identrevista;
    //private String cpf;
    private String data;
    private String nomecao;
    //private String nomegato;
    private String nomeadotante;





    public String getNomecao() {
        return nomecao;
    }

    public void setNomecao(String nomecao) {
        this.nomecao = nomecao;
    }
   // public String getNomegato() {
    //    return nomegato;
    //}

    //public void setNomegato(String nomegato) {
    //    this.nomegato = nomegato;
    //}

    public String getNomeadotante() {
        return nomeadotante;
    }

    public void setNomeadotante(String nomeadotante) {
        this.nomeadotante = nomeadotante;
    }
    
    




    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    //private int idgato;
    private String hora;

    @Override
    public String toString() {
        return "" +identrevista + '}';
    }
    

}
    

    

 

    


