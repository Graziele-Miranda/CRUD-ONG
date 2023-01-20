/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;


import Classes.Agendamento;

import Classes.Adotante;
import Classes.Cachorro;
import DAO.AdotanteDAO;
import DAO.AgendamentoDAO;
import DAO.CaoDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author limag
 */
public class AgendarEntrevista extends javax.swing.JFrame {
//int acao;
//int status;

Agendamento objpes = new Agendamento();
//endamentoDAO dao = new AgendamentoDAO();
//dao.pesquisaTela(objpes);
AgendamentoDAO dao = new AgendamentoDAO();


    public AgendarEntrevista() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome7 = new javax.swing.JLabel();
        lblNome8 = new javax.swing.JLabel();
        lblNome9 = new javax.swing.JLabel();
        lblNome10 = new javax.swing.JLabel();
        data = new javax.swing.JFormattedTextField();
        hora = new javax.swing.JFormattedTextField();
        comboadot = new javax.swing.JComboBox();
        combocao = new javax.swing.JComboBox();
        lblNome12 = new javax.swing.JLabel();
        ida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btCad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendar Entrevista");
        setResizable(isUndecorated());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome7.setForeground(new java.awt.Color(73, 81, 129));
        lblNome7.setText("ID");
        getContentPane().add(lblNome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        lblNome8.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome8.setForeground(new java.awt.Color(73, 81, 129));
        lblNome8.setText("Hora");
        getContentPane().add(lblNome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        lblNome9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome9.setForeground(new java.awt.Color(73, 81, 129));
        lblNome9.setText("Adotante");
        getContentPane().add(lblNome9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        lblNome10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome10.setForeground(new java.awt.Color(73, 81, 129));
        lblNome10.setText("Data");
        getContentPane().add(lblNome10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        try {
            data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data.setMinimumSize(new java.awt.Dimension(64, 25));
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 220, -1));

        try {
            hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hora.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        hora.setMinimumSize(new java.awt.Dimension(64, 25));
        getContentPane().add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 220, -1));

        comboadot.setEditable(true);
        comboadot.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comboadot.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                comboadotAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        comboadot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboadotActionPerformed(evt);
            }
        });
        getContentPane().add(comboadot, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 220, -1));

        combocao.setEditable(true);
        combocao.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combocao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combocaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        combocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocaoActionPerformed(evt);
            }
        });
        getContentPane().add(combocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 220, -1));

        lblNome12.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome12.setForeground(new java.awt.Color(73, 81, 129));
        lblNome12.setText("Cachorro");
        getContentPane().add(lblNome12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        ida.setEditable(false);
        ida.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                idaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(ida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 220, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 70, 80));

        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 90, 70));

        btCad.setContentAreaFilled(false);
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        getContentPane().add(btCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 220, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/agendarent.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       /* Agendamento ag = new Agendamento();
        AgendamentoDAO dao = new AgendamentoDAO();
        List <Agendamento> lista = dao.CarregaCombo();
        
        
        //combo.addItem("Id cães");
            for(Agendamento v :lista){
                combo.addItem(v);
            
    // *///TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void comboadotAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_comboadotAncestorAdded
 
  AdotanteDAO dao = new AdotanteDAO();       
  List <Adotante> lista = dao.ConsAdotante();
 //comboadot.removeAll();
 comboadot.addItem("Selecione");
 for(Adotante v :lista){
     
     comboadot.addItem(v.getNome());
            }  // TODO add your handling code here:
    }//GEN-LAST:event_comboadotAncestorAdded

    private void combocaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_combocaoAncestorAdded
//Cachorro c = new Cachorro();
 CaoDAO dao = new CaoDAO();       
 List <Cachorro> lista = dao.ConsCao();
 //combocao.removeAll();
 combocao.addItem("Selecione");
 for(Cachorro  v  :lista){
     
     combocao.addItem(v.getNome());
 }


    }//GEN-LAST:event_combocaoAncestorAdded

    private void combocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocaoActionPerformed
        if(combocao.getSelectedIndex()>=1){
            int posLin = combocao.getSelectedIndex();
            String valLinCombo = combocao.getSelectedItem().toString();
        }        

// TODO add your handling code here:
    }//GEN-LAST:event_combocaoActionPerformed

    private void comboadotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboadotActionPerformed
   if(comboadot.getSelectedIndex()>=1){
            int posLin = comboadot.getSelectedIndex();
            String valLinCombo = comboadot.getSelectedItem().toString();
        }
    }//GEN-LAST:event_comboadotActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        sair();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void idaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_idaAncestorAdded

     
    // ida.addItem(v.getIdentrevista());        // TODO add your handling code here:
    }//GEN-LAST:event_idaAncestorAdded

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
cadastrar();    }//GEN-LAST:event_btCadActionPerformed
 public void cadastrar(){
         Agendamento ag = new Agendamento();
    //  AgendamentoDAO dao = new AgendamentoDAO();
  
           // if(acao == 1){
            ag.setNomecao((String) combocao.getSelectedItem());
            ag.setNomeadotante((String) comboadot.getSelectedItem());
            ag.setData(data.getText());
            ag.setHora(hora.getText());
            //cod = IEDAO.cadAgenda(objpes);
            //ida.setText(String.valueOf(cod));
                
           AgendamentoDAO dao = new AgendamentoDAO();
           dao.cadAgenda(ag);
        
          JOptionPane.showMessageDialog(null, "Entrevista agendada com sucesso!", "Cadastro OK", 1);
         // salvar();
          limpar();         
            
           // if(acao == 2){  
 }
    
    public void limpar(){
        data.setText("");
         hora.setText("");
  
        combocao.setSelectedItem("Selecione");
        comboadot.setSelectedItem("Selecione");
    }
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair da página de Agendamento?",
                    "Saida",
                    JOptionPane.YES_NO_OPTION
                );
        if(resp == 0){
            dispose();
            new MenuPrincipal().setVisible(true);
        }
        
 

      
  }  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgendarEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarEntrevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarEntrevista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCad;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox comboadot;
    public javax.swing.JComboBox combocao;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JFormattedTextField hora;
    private javax.swing.JTextField ida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNome10;
    private javax.swing.JLabel lblNome12;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JLabel lblNome9;
    // End of variables declaration//GEN-END:variables
 public void alterar(Integer id){
        try {
            AgendamentoDAO dao = new AgendamentoDAO();
            List<Agendamento> listCao = dao.ConsAgendaId(id);
            
            for(Agendamento f : listCao){
                ida.setText(String.valueOf(f.getIdentrevista()));

            
              
              combocao.setSelectedItem(String.valueOf(f.getNomecao()));
              //combogato.setSelectedItem(String.valueOf(f.getNomegato()));
              comboadot.setSelectedItem(String.valueOf(f.getNomeadotante()));
              data.setText(f.getData());
              hora.setText(f.getHora());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }



}