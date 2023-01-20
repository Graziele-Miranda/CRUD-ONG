
package Telas;

import Classes.Cachorro;
import DAO.CaoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadCao extends javax.swing.JFrame {
      
    CadCao() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        grupoCastrado = new javax.swing.ButtonGroup();
        grupoVermifugado = new javax.swing.ButtonGroup();
        lblId = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblPorte = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblIdade2 = new javax.swing.JLabel();
        radioInativo = new javax.swing.JRadioButton();
        radioNaoVer = new javax.swing.JRadioButton();
        lblSexo1 = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        comboSexo = new javax.swing.JComboBox<>();
        lblVermifugado = new javax.swing.JLabel();
        lblCor2 = new javax.swing.JLabel();
        radioAtivo = new javax.swing.JRadioButton();
        radioSimVer = new javax.swing.JRadioButton();
        lblCastrado1 = new javax.swing.JLabel();
        radioSimCas = new javax.swing.JRadioButton();
        radioNaoCas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btCadCao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btSair = new javax.swing.JButton();
        comboPorte = new javax.swing.JComboBox<>();
        lblPorte1 = new javax.swing.JLabel();
        lblimag = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Cão");
        setMinimumSize(new java.awt.Dimension(950, 550));
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(73, 81, 129));
        lblId.setText("ID:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, -1, 30));

        txtIdade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(84, 88, 113));
        txtIdade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 60, 30));

        lblRaca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblRaca.setForeground(new java.awt.Color(73, 81, 129));
        lblRaca.setText("Raça");
        getContentPane().add(lblRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, 30));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(84, 88, 113));
        txtId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(84, 88, 113));
        txtId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 60, 30));

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(73, 81, 129));
        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, 30));

        txtCor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCor.setForeground(new java.awt.Color(84, 88, 113));
        txtCor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 80, 30));

        lblPorte.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPorte.setForeground(new java.awt.Color(73, 81, 129));
        lblPorte.setText("Status");
        getContentPane().add(lblPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, 30));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(84, 88, 113));
        txtNome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 160, 30));

        lblIdade2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblIdade2.setForeground(new java.awt.Color(73, 81, 129));
        lblIdade2.setText("Idade");
        getContentPane().add(lblIdade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, 30));

        grupoSexo.add(radioInativo);
        radioInativo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioInativo.setForeground(new java.awt.Color(73, 81, 129));
        radioInativo.setText("Inativo");
        getContentPane().add(radioInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, 30));

        grupoVermifugado.add(radioNaoVer);
        radioNaoVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioNaoVer.setForeground(new java.awt.Color(73, 81, 129));
        radioNaoVer.setText("Não");
        getContentPane().add(radioNaoVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, 30));

        lblSexo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSexo1.setForeground(new java.awt.Color(73, 81, 129));
        lblSexo1.setText("Sexo");
        getContentPane().add(lblSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 30));

        txtRaca.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRaca.setForeground(new java.awt.Color(84, 88, 113));
        txtRaca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(txtRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 130, 30));

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
        getContentPane().add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 120, 30));

        lblVermifugado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblVermifugado.setForeground(new java.awt.Color(73, 81, 129));
        lblVermifugado.setText("Vermifugado");
        getContentPane().add(lblVermifugado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 120, 30));

        lblCor2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCor2.setForeground(new java.awt.Color(73, 81, 129));
        lblCor2.setText("Cor");
        getContentPane().add(lblCor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, 30));

        grupoSexo.add(radioAtivo);
        radioAtivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioAtivo.setForeground(new java.awt.Color(73, 81, 129));
        radioAtivo.setText("Ativo");
        getContentPane().add(radioAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, 30));

        grupoVermifugado.add(radioSimVer);
        radioSimVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioSimVer.setForeground(new java.awt.Color(73, 81, 129));
        radioSimVer.setText("Sim");
        getContentPane().add(radioSimVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, 30));

        lblCastrado1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCastrado1.setForeground(new java.awt.Color(73, 81, 129));
        lblCastrado1.setText("Castrado");
        getContentPane().add(lblCastrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, -1, 30));

        grupoCastrado.add(radioSimCas);
        radioSimCas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioSimCas.setForeground(new java.awt.Color(73, 81, 129));
        radioSimCas.setText("Sim");
        getContentPane().add(radioSimCas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, 30));

        grupoCastrado.add(radioNaoCas);
        radioNaoCas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioNaoCas.setForeground(new java.awt.Color(73, 81, 129));
        radioNaoCas.setText("Não");
        radioNaoCas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNaoCasActionPerformed(evt);
            }
        });
        getContentPane().add(radioNaoCas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, 30));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 81, 129));
        jLabel1.setText("___________________________________________________");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, -1, -1));

        btCadCao.setContentAreaFilled(false);
        btCadCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCadCaoMouseClicked(evt);
            }
        });
        btCadCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCaoActionPerformed(evt);
            }
        });
        getContentPane().add(btCadCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 60, 60));

        btSair.setContentAreaFilled(false);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 70, 60, 60));

        comboPorte.setBackground(new java.awt.Color(59, 58, 71));
        comboPorte.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        comboPorte.setForeground(new java.awt.Color(255, 239, 224));
        comboPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Miniatura", "Pequeno", "Médio", "Grande", "Gigante" }));
        comboPorte.setToolTipText("");
        comboPorte.setBorder(null);
        comboPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPorteActionPerformed(evt);
            }
        });
        getContentPane().add(comboPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 120, 30));

        lblPorte1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPorte1.setForeground(new java.awt.Color(73, 81, 129));
        lblPorte1.setText("Porte");
        getContentPane().add(lblPorte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, 30));

        lblimag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadcao.png"))); // NOI18N
        lblimag.setMaximumSize(new java.awt.Dimension(950, 540));
        getContentPane().add(lblimag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioNaoCasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNaoCasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNaoCasActionPerformed

    private void btCadCaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadCaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadCaoMouseClicked

    private void btCadCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCaoActionPerformed
cadastrarCao();        // TODO add your handling code here:
    }//GEN-LAST:event_btCadCaoActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
    selectCombo();        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void comboPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPorteActionPerformed
selectComboPorte();        // TODO add your handling code here:
    }//GEN-LAST:event_comboPorteActionPerformed
    public void selectCombo(){
        if(comboSexo.getSelectedIndex()>=1){
            int posLin = comboSexo.getSelectedIndex();
            String valLinCombo = comboSexo.getSelectedItem().toString();
        }
    }
        public void selectComboPorte(){
        if(comboPorte.getSelectedIndex()>=1){
            int posLin = comboPorte.getSelectedIndex();
            String valLinCombo = comboPorte.getSelectedItem().toString();
        }
    }
    
    public void cadastrarCao () {
        
      
        Cachorro cachorro= new Cachorro ();  
        txtNome.requestFocus();
        cachorro.setNome(txtNome.getText());
//        cachorro.setId(Integer.parseInt(txtId.getText()));
        cachorro.setIdade(Integer.parseInt(txtIdade.getText()));
        cachorro.setRaca(txtRaca.getText());
        cachorro.setSexo((String) comboSexo.getSelectedItem());
              if (radioAtivo.isSelected()){
            cachorro.setStatus("Ativo");
        }else if(radioInativo.isSelected()){
            cachorro.setStatus("Inativo");
        }
 
        cachorro.setCor(txtCor.getText());
        
        cachorro.setPorte((String) comboPorte.getSelectedItem());
        if(radioSimCas.isSelected()){
            cachorro.setCastrado("Sim");
        }else if (radioNaoCas.isSelected()){
            cachorro.setCastrado("Nao");
        }
        if(radioSimVer.isSelected()){
            cachorro.setVermifugado("Sim");
        }else if (radioNaoVer.isSelected()){
            cachorro.setVermifugado("Nao");
        }

         
        CaoDAO dao = new CaoDAO();
        dao.cadCao(cachorro);
        
         
         
            JOptionPane.showMessageDialog(null, "Cachorro cadastrado com sucesso!", "Cadastro OK", 1);
            limpar();
        }
//limpar 
    public void limpar(){
        txtNome.setText("");
         txtId.setText("");
        txtIdade.setText("");
        txtRaca.setText("");
        grupoSexo.clearSelection();
        txtCor.setText("");
        comboSexo.setSelectedItem("Selecione");
        comboPorte.setSelectedItem("Selecione");
        grupoCastrado.clearSelection();
        grupoVermifugado.clearSelection();
        txtNome.requestFocus();
    }
    
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair da página de Cadastro de Cães?",
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
            java.util.logging.Logger.getLogger(CadCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadCao;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> comboPorte;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.ButtonGroup grupoCastrado;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.ButtonGroup grupoVermifugado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCastrado1;
    private javax.swing.JLabel lblCor2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPorte;
    private javax.swing.JLabel lblPorte1;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblVermifugado;
    private javax.swing.JLabel lblimag;
    private javax.swing.JRadioButton radioAtivo;
    private javax.swing.JRadioButton radioInativo;
    private javax.swing.JRadioButton radioNaoCas;
    private javax.swing.JRadioButton radioNaoVer;
    private javax.swing.JRadioButton radioSimCas;
    private javax.swing.JRadioButton radioSimVer;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
