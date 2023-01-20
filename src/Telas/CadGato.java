
package Telas;

import javax.swing.JOptionPane;
import Classes.Gato;
import DAO.GatoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author limag
 */
public class CadGato extends javax.swing.JFrame {

    /**
     * Creates new form CadGato
     */
    public CadGato() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        grupoSexGato = new javax.swing.ButtonGroup();
        grupoCastradoGato = new javax.swing.ButtonGroup();
        grupoVermGato = new javax.swing.ButtonGroup();
        status = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        txtNomeg = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblIdade2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        lblSexo1 = new javax.swing.JLabel();
        lblCor2 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblCastrado1 = new javax.swing.JLabel();
        lblVermifugado = new javax.swing.JLabel();
        radioSimCas = new javax.swing.JRadioButton();
        radioNaoCas = new javax.swing.JRadioButton();
        radioSimVer = new javax.swing.JRadioButton();
        radioNaoVer = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        comboSexo = new javax.swing.JComboBox<>();
        lblPorte = new javax.swing.JLabel();
        radioAtivo = new javax.swing.JRadioButton();
        radioInativo = new javax.swing.JRadioButton();
        lblImagem = new javax.swing.JLabel();

        lblId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(73, 81, 129));
        lblId.setText("ID:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Gatos");
        setMinimumSize(new java.awt.Dimension(945, 545));
        setPreferredSize(new java.awt.Dimension(960, 570));
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(250, 236, 235));
        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, 30));

        txtNomeg.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNomeg.setForeground(new java.awt.Color(84, 88, 113));
        txtNomeg.setBorder(null);
        getContentPane().add(txtNomeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 160, 30));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(250, 236, 235));
        txtId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(84, 88, 113));
        txtId.setBorder(null);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 60, 30));

        lblIdade2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblIdade2.setForeground(new java.awt.Color(250, 236, 235));
        lblIdade2.setText("Idade");
        getContentPane().add(lblIdade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 30));

        txtIdade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(84, 88, 113));
        txtIdade.setBorder(null);
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 60, 30));

        lblRaca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblRaca.setForeground(new java.awt.Color(250, 236, 235));
        lblRaca.setText("Raça");
        getContentPane().add(lblRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, 30));

        txtRaca.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRaca.setForeground(new java.awt.Color(84, 88, 113));
        txtRaca.setBorder(null);
        getContentPane().add(txtRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 130, 30));

        lblSexo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSexo1.setForeground(new java.awt.Color(250, 236, 235));
        lblSexo1.setText("Sexo");
        getContentPane().add(lblSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, 30));

        lblCor2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCor2.setForeground(new java.awt.Color(250, 236, 235));
        lblCor2.setText("Cor");
        getContentPane().add(lblCor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, 30));

        txtCor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCor.setForeground(new java.awt.Color(84, 88, 113));
        txtCor.setBorder(null);
        getContentPane().add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 260, 30));

        lblCastrado1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCastrado1.setForeground(new java.awt.Color(250, 236, 235));
        lblCastrado1.setText("Castrado");
        getContentPane().add(lblCastrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 30));

        lblVermifugado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblVermifugado.setForeground(new java.awt.Color(250, 236, 235));
        lblVermifugado.setText("Vermifugado");
        getContentPane().add(lblVermifugado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 120, 30));

        grupoCastradoGato.add(radioSimCas);
        radioSimCas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioSimCas.setForeground(new java.awt.Color(250, 236, 235));
        radioSimCas.setText("Sim");
        getContentPane().add(radioSimCas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, 30));

        grupoCastradoGato.add(radioNaoCas);
        radioNaoCas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioNaoCas.setForeground(new java.awt.Color(250, 236, 235));
        radioNaoCas.setText("Não");
        radioNaoCas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNaoCasActionPerformed(evt);
            }
        });
        getContentPane().add(radioNaoCas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, 30));

        grupoVermGato.add(radioSimVer);
        radioSimVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioSimVer.setForeground(new java.awt.Color(250, 236, 235));
        radioSimVer.setText("Sim");
        getContentPane().add(radioSimVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, 30));

        grupoVermGato.add(radioNaoVer);
        radioNaoVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioNaoVer.setForeground(new java.awt.Color(250, 236, 235));
        radioNaoVer.setText("Não");
        getContentPane().add(radioNaoVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, -1, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 236, 235));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, 40));

        btSalvar.setContentAreaFilled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 220, 50));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 255));
        jLabel2.setText("___________________________________________________");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 350, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar rosa.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 80, 60));

        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, 60));

        comboSexo.setBackground(new java.awt.Color(59, 58, 71));
        comboSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        comboSexo.setForeground(new java.awt.Color(255, 239, 224));
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Macho", "Fêmea" }));
        comboSexo.setToolTipText("");
        comboSexo.setBorder(null);
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        getContentPane().add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 120, 30));

        lblPorte.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPorte.setForeground(new java.awt.Color(250, 236, 235));
        lblPorte.setText("Status");
        getContentPane().add(lblPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, 30));

        status.add(radioAtivo);
        radioAtivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioAtivo.setForeground(new java.awt.Color(250, 236, 235));
        radioAtivo.setText("Ativo");
        getContentPane().add(radioAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, 30));

        status.add(radioInativo);
        radioInativo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioInativo.setForeground(new java.awt.Color(250, 236, 235));
        radioInativo.setText("Inativo");
        getContentPane().add(radioInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, 30));

        lblImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tela menu gato.png"))); // NOI18N
        getContentPane().add(lblImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 960, 574));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioNaoCasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNaoCasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNaoCasActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        cadastrarGato();
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
sair();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        selectCombo();        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed
    public void selectCombo(){
        if(comboSexo.getSelectedIndex()>=1){
            int posLin = comboSexo.getSelectedIndex();
            String valLinCombo = comboSexo.getSelectedItem().toString();
        }
    }
    public void cadastrarGato(){
    Gato g = new Gato ();  
        txtNomeg.requestFocus();
        g.setNome(txtNomeg.getText());
        //g.setId(Integer.parseInt(txtId.getText()));
        g.setIdade(Integer.parseInt(txtIdade.getText()));
        g.setSexo((String) comboSexo.getSelectedItem());
        g.setRaca(txtRaca.getText());
                if (radioAtivo.isSelected()){
            g.setStatus("Ativo");
        }else if(radioInativo.isSelected()){
            g.setStatus("Inativo");
        }
        g.setCor(txtCor.getText());
        //cachorro.setPorte((String) comboPorte.getSelectedItem());
        if(radioSimCas.isSelected()){
            g.setCastrado("Sim");
        }else if (radioNaoCas.isSelected()){
            g.setCastrado("Nao");
        }
        if(radioSimVer.isSelected()){
            g.setVermifugado("Sim");
        }else if (radioNaoVer.isSelected()){
            g.setVermifugado("Nao");
        }
         
        GatoDAO dao = new GatoDAO();
        dao.cadGato(g);
        
         
         
            JOptionPane.showMessageDialog(null, "Gato cadastrado com sucesso!", "Cadastro OK", 1);
            limpar();
         
        
        
}
        public void limpar(){
        txtNomeg.setText("");
        txtId.setText("");
        txtIdade.setText("");
        txtRaca.setText("");
        grupoSexGato.clearSelection();
        txtCor.setText("");
        comboSexo.setSelectedItem("Selecione");
        grupoCastradoGato.clearSelection();
        grupoVermGato.clearSelection();
        txtNomeg.requestFocus();
    }
    
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair da página de Cadastro de Gatos?",
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
            java.util.logging.Logger.getLogger(CadGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadGato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadGato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.ButtonGroup grupoCastradoGato;
    private javax.swing.ButtonGroup grupoSexGato;
    private javax.swing.ButtonGroup grupoVermGato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCastrado1;
    private javax.swing.JLabel lblCor2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade2;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPorte;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblVermifugado;
    private javax.swing.JRadioButton radioAtivo;
    private javax.swing.JRadioButton radioInativo;
    private javax.swing.JRadioButton radioNaoCas;
    private javax.swing.JRadioButton radioNaoVer;
    private javax.swing.JRadioButton radioSimCas;
    private javax.swing.JRadioButton radioSimVer;
    private javax.swing.ButtonGroup status;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomeg;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
