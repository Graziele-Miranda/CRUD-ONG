/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import Classes.Voluntario;
import Telas.SalvarAltVoluntario;
/**
 *
 * @author limag
 */
public class AlterarVoluntario extends javax.swing.JFrame {

    /**
     * Creates new form AlterarVoluntario
     */
    public AlterarVoluntario() {
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
        jLabel2 = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        cpfvol = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Voluntário");
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(73, 81, 129));
        lblNome.setText("CPF");
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 101, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar 32px.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 60, 40));

        btConsultar.setContentAreaFilled(false);
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 130, 30));

        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, 40));

        try {
            cpfvol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfvol.setMinimumSize(new java.awt.Dimension(64, 25));
        cpfvol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfvolActionPerformed(evt);
            }
        });
        getContentPane().add(cpfvol, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/altvol.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed

        try {
            String cpf = cpfvol.getText();

            SalvarAltVoluntario save = new SalvarAltVoluntario();

            save.alterar(cpf);

            save.setVisible(true);

        } catch (Exception e) {

        }
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        MenuPrincipal m = new MenuPrincipal();
        m.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void cpfvolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfvolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfvolActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarVoluntario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JFormattedTextField cpfvol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
