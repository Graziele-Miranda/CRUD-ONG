/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Cachorro;
import javax.swing.JOptionPane;
import DAO.CaoDAO;
import java.util.List;


/**
 *
 * @author limag
 */
public class SalvarAltCao extends javax.swing.JFrame {

    /**
     * Creates new form SalvarAltCao
     */
    public SalvarAltCao() {
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

        GrupoSexo = new javax.swing.ButtonGroup();
        GrupoCastrado = new javax.swing.ButtonGroup();
        GrupoVermifugado = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblIdade2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        lblRaca = new javax.swing.JLabel();
        txtRaca = new javax.swing.JTextField();
        lblSexo1 = new javax.swing.JLabel();
        lblCor2 = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblPorte = new javax.swing.JLabel();
        comboPorte = new javax.swing.JComboBox<>();
        lblCastrado1 = new javax.swing.JLabel();
        lblVermifugado = new javax.swing.JLabel();
        radioSimCas = new javax.swing.JRadioButton();
        radioNaoCas = new javax.swing.JRadioButton();
        radioSimVer = new javax.swing.JRadioButton();
        radioNaoVer = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btSalvarAlt = new javax.swing.JButton();
        comboSexo = new javax.swing.JComboBox<>();
        lblPorte1 = new javax.swing.JLabel();
        radioAtivo = new javax.swing.JRadioButton();
        radioInativo = new javax.swing.JRadioButton();
        imagemalterar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salvar");
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(73, 81, 129));
        lblNome.setText("Nome");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, -1, 30));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNome.setForeground(new java.awt.Color(84, 88, 113));
        txtNome.setBorder(null);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 130, 30));

        lblId.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(73, 81, 129));
        lblId.setText("ID:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, 30));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(148, 151, 167));
        txtId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(84, 88, 113));
        txtId.setBorder(null);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 60, 30));

        lblIdade2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblIdade2.setForeground(new java.awt.Color(73, 81, 129));
        lblIdade2.setText("Idade");
        getContentPane().add(lblIdade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, 30));

        txtIdade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(84, 88, 113));
        txtIdade.setBorder(null);
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 60, 30));

        lblRaca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblRaca.setForeground(new java.awt.Color(73, 81, 129));
        lblRaca.setText("Ra??a");
        getContentPane().add(lblRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, 30));

        txtRaca.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtRaca.setForeground(new java.awt.Color(84, 88, 113));
        txtRaca.setBorder(null);
        getContentPane().add(txtRaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 130, 30));

        lblSexo1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSexo1.setForeground(new java.awt.Color(73, 81, 129));
        lblSexo1.setText("Sexo");
        getContentPane().add(lblSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, 30));

        lblCor2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCor2.setForeground(new java.awt.Color(73, 81, 129));
        lblCor2.setText("Cor");
        getContentPane().add(lblCor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, 30));

        txtCor.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCor.setForeground(new java.awt.Color(84, 88, 113));
        txtCor.setBorder(null);
        getContentPane().add(txtCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 80, 30));

        lblPorte.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPorte.setForeground(new java.awt.Color(73, 81, 129));
        lblPorte.setText("Porte");
        getContentPane().add(lblPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, 30));

        comboPorte.setBackground(new java.awt.Color(59, 58, 71));
        comboPorte.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        comboPorte.setForeground(new java.awt.Color(255, 239, 224));
        comboPorte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Miniatura", "Pequeno", "M??dio", "Grande", "Gigante" }));
        comboPorte.setToolTipText("");
        comboPorte.setBorder(null);
        comboPorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPorteActionPerformed(evt);
            }
        });
        getContentPane().add(comboPorte, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 120, 30));

        lblCastrado1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCastrado1.setForeground(new java.awt.Color(73, 81, 129));
        lblCastrado1.setText("Castrado");
        getContentPane().add(lblCastrado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 30));

        lblVermifugado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblVermifugado.setForeground(new java.awt.Color(73, 81, 129));
        lblVermifugado.setText("Vermifugado");
        getContentPane().add(lblVermifugado, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 120, 30));

        GrupoCastrado.add(radioSimCas);
        radioSimCas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioSimCas.setForeground(new java.awt.Color(73, 81, 129));
        radioSimCas.setText("Sim");
        getContentPane().add(radioSimCas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 30));

        GrupoCastrado.add(radioNaoCas);
        radioNaoCas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioNaoCas.setForeground(new java.awt.Color(73, 81, 129));
        radioNaoCas.setText("N??o");
        radioNaoCas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNaoCasActionPerformed(evt);
            }
        });
        getContentPane().add(radioNaoCas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, 30));

        GrupoVermifugado.add(radioSimVer);
        radioSimVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioSimVer.setForeground(new java.awt.Color(73, 81, 129));
        radioSimVer.setText("Sim");
        getContentPane().add(radioSimVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, 30));

        GrupoVermifugado.add(radioNaoVer);
        radioNaoVer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioNaoVer.setForeground(new java.awt.Color(73, 81, 129));
        radioNaoVer.setText("N??o");
        getContentPane().add(radioNaoVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, 30));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 81, 129));
        jLabel1.setText("___________________________________________________");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        btSalvarAlt.setContentAreaFilled(false);
        btSalvarAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAltActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarAlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 230, 50));

        comboSexo.setBackground(new java.awt.Color(59, 58, 71));
        comboSexo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        comboSexo.setForeground(new java.awt.Color(255, 239, 224));
        comboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Macho", "F??mea" }));
        comboSexo.setToolTipText("");
        comboSexo.setBorder(null);
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        getContentPane().add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 120, 30));

        lblPorte1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPorte1.setForeground(new java.awt.Color(73, 81, 129));
        lblPorte1.setText("Status");
        getContentPane().add(lblPorte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, 30));

        buttonGroup1.add(radioAtivo);
        radioAtivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioAtivo.setForeground(new java.awt.Color(73, 81, 129));
        radioAtivo.setText("Ativo");
        getContentPane().add(radioAtivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, 30));

        buttonGroup1.add(radioInativo);
        radioInativo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        radioInativo.setForeground(new java.awt.Color(73, 81, 129));
        radioInativo.setText("Inativo");
        getContentPane().add(radioInativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, -1, 30));

        imagemalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/altcao.png"))); // NOI18N
        imagemalterar.setMaximumSize(new java.awt.Dimension(950, 540));
        getContentPane().add(imagemalterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboPorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPorteActionPerformed
        selectComboPorte();        // TODO add your handling code here:
    }//GEN-LAST:event_comboPorteActionPerformed

    private void radioNaoCasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNaoCasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNaoCasActionPerformed

    private void btSalvarAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarAltActionPerformed
        AlterarCao alt = new AlterarCao();
        
        Cachorro cachorro = new Cachorro();
        

        cachorro.setId(Integer.parseInt(txtId.getText()));
        cachorro.setNome(txtNome.getText());
        
        cachorro.setIdade(Integer.parseInt(txtIdade.getText()));
        cachorro.setRaca(txtRaca.getText());
        cachorro.setSexo((String) comboSexo.getSelectedItem());
         if(radioAtivo.isSelected()){
            cachorro.setVermifugado("Ativo");
        }else if (radioInativo.isSelected()){
            cachorro.setVermifugado("Inativo");
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
        dao.alterarCao(cachorro);

        JOptionPane.showMessageDialog(null, "Dados alterados com sucesso.", "Altera????o Conclu??da",1);
        
        alt.setVisible(true);
        this.dispose();    
// TODO add your handling code here:
    }//GEN-LAST:event_btSalvarAltActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        selectCombo();        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed
    public void selectComboPorte(){
        if(comboPorte.getSelectedIndex()>=1){
            int posLin = comboPorte.getSelectedIndex();
            String valLinCombo = comboPorte.getSelectedItem().toString();
        }
    }
        public void selectCombo(){
        if(comboSexo.getSelectedIndex()>=1){
            int posLin = comboSexo.getSelectedIndex();
            String valLinCombo = comboSexo.getSelectedItem().toString();
        }
    }
    
    public void alterar(Integer id){
        try {
            CaoDAO dao = new CaoDAO();
            List<Cachorro> listCao = dao.ConsCaoId(id);
            
            for(Cachorro f : listCao){
                txtId.setText(String.valueOf(f.getId()));
                txtNome.setText(f.getNome());
                txtIdade.setText(String.valueOf(f.getIdade()));
                txtRaca.setText(f.getRaca());
                comboSexo.setSelectedItem(String.valueOf(f.getSexo()));
               if (radioAtivo.isSelected()){
            f.setStatus("Ativo");
        }else if(radioInativo.isSelected()){
            f.setStatus("Inativo");
        }
                txtCor.setText(f.getCor());

            
               //f.setPorte((String) comboPorte.getSelectedItem());
              comboPorte.setSelectedItem(String.valueOf(f.getPorte()));
         
         if(radioSimCas.isSelected()){
            f.setCastrado("Sim");     
        }else if (radioNaoCas.isSelected()){
            f.setCastrado("Nao");
        }
        if(radioSimVer.isSelected()){
            f.setVermifugado("Sim");
        }else if (radioNaoVer.isSelected()){
            f.setVermifugado("Nao");
        }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            java.util.logging.Logger.getLogger(SalvarAltCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalvarAltCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalvarAltCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalvarAltCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalvarAltCao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoCastrado;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.ButtonGroup GrupoVermifugado;
    private javax.swing.JButton btSalvarAlt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboPorte;
    private javax.swing.JComboBox<String> comboSexo;
    private javax.swing.JLabel imagemalterar;
    private javax.swing.JLabel jLabel1;
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
