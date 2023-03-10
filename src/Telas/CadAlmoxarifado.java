/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import DAO.AlmxDAO;
import javax.swing.JOptionPane;
import Classes.Almoxarifado;
import java.util.List;

/**
 *
 * @author limag
 */
public class CadAlmoxarifado extends javax.swing.JFrame {

    /**
     * Creates new form Almoxarifado
     */
    public CadAlmoxarifado() {
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

        lblNome = new javax.swing.JLabel();
        qtd = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        lblSexo1 = new javax.swing.JLabel();
        combocat = new javax.swing.JComboBox<>();
        lblSexo2 = new javax.swing.JLabel();
        lblSexo3 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        btSalvarItem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produto");
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(73, 81, 129));
        lblNome.setText("Id");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, 50));

        qtd.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        qtd.setForeground(new java.awt.Color(84, 88, 113));
        qtd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(qtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 50, 30));

        id.setEditable(false);
        id.setBackground(new java.awt.Color(84, 88, 113));
        id.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(84, 88, 113));
        id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 60, 30));

        lblSexo1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblSexo1.setForeground(new java.awt.Color(73, 81, 129));
        lblSexo1.setText("Qtd");
        getContentPane().add(lblSexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, 30));

        combocat.setBackground(new java.awt.Color(59, 58, 71));
        combocat.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        combocat.setForeground(new java.awt.Color(255, 239, 224));
        combocat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Alimento", "Higiene", "Limpeza", "Medicamento" }));
        combocat.setToolTipText("");
        combocat.setBorder(null);
        combocat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocatActionPerformed(evt);
            }
        });
        getContentPane().add(combocat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 150, 30));

        lblSexo2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblSexo2.setForeground(new java.awt.Color(73, 81, 129));
        lblSexo2.setText("Nome");
        getContentPane().add(lblSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        lblSexo3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblSexo3.setForeground(new java.awt.Color(73, 81, 129));
        lblSexo3.setText("Categoria");
        getContentPane().add(lblSexo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 30));

        nome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(84, 88, 113));
        nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, 30));

        btSalvarItem.setContentAreaFilled(false);
        btSalvarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarItemActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar 32px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 60, 50));

        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 90, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caditem.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 505, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void combocatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocatActionPerformed
        selectCombo();        // TODO add your handling code here:
    }//GEN-LAST:event_combocatActionPerformed

    private void btSalvarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarItemActionPerformed
cadastrarProd();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btSalvarItemActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
sair();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed
public void selectCombo(){
        if(combocat.getSelectedIndex()>=1){
            int posLin = combocat.getSelectedIndex();
            String valLinCombo = combocat.getSelectedItem().toString();
        }
    }
        public void selectComboPorte(){
        if(combocat.getSelectedIndex()>=1){
            int posLin = combocat.getSelectedIndex();
            String valLinCombo = combocat.getSelectedItem().toString();
        }
    }
    
    public void cadastrarProd () {
        
      
        Almoxarifado a= new Almoxarifado ();  
        
        a.setNome(nome.getText());
//        cachorro.setId(Integer.parseInt(txtId.getText()));
        a.setCat((String) combocat.getSelectedItem());
        a.setQuant(Integer.parseInt(qtd.getText()));

     
        
         
        AlmxDAO dao = new AlmxDAO();
        dao.cadProd(a);
        
         
         
            JOptionPane.showMessageDialog(null, "Item cadastrado com sucesso!", "Cadastro OK", 1);
            limpar();
        }
//limpar 
    public void limpar(){
        nome.setText("");
         id.setText("");
        qtd.setText("");

        combocat.setSelectedItem("Selecione");

        nome.requestFocus();
    }
    
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair da p??gina de Cadastro de Itens?",
                    "Saida",
                    JOptionPane.YES_NO_OPTION
                );
        if(resp == 0){
            dispose();
            new MenuPrincipal().setVisible(true);
        }
 }
     public void remover(){
             try {
            Integer idc = Integer.parseInt(id.getText());
            AlmxDAO dao = new AlmxDAO();
            //Almoxarifado a = new Almoxarifado(); 
            List<Almoxarifado> listFunc = dao.ConsProdId(idc);
            
            for(Almoxarifado a: listFunc){
                nome.setText(a.getNome());
                combocat.setSelectedItem(String.valueOf(a.getCat()));
                qtd.setText(String.valueOf(a.getQuant()));
            }
            
            dao.removeProduto(id);
           
            JOptionPane.showMessageDialog(null, "Item removido com sucesso");
            
        } catch (Exception e) {
           // throw new RuntimeException(e);
           JOptionPane.showMessageDialog(null, "Item n??o encontrado");
        }}

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
            java.util.logging.Logger.getLogger(Almoxarifado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almoxarifado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almoxarifado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almoxarifado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadAlmoxarifado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvarItem;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> combocat;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo1;
    private javax.swing.JLabel lblSexo2;
    private javax.swing.JLabel lblSexo3;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField qtd;
    // End of variables declaration//GEN-END:variables
}
