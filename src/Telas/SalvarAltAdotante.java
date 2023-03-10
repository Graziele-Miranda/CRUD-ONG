/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import DAO.AdotanteDAO;
import Classes.Adotante;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.JFormattedTextField;

/**
 *
 * @author limag
 */
public class SalvarAltAdotante extends javax.swing.JFrame {

    /**
     * Creates new form SalvarAltAdotante
     */
    public SalvarAltAdotante() {
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

        jPanel1 = new javax.swing.JPanel();
        lblNome2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        cpfad = new javax.swing.JFormattedTextField();
        nome = new javax.swing.JTextField();
        lblIdade2 = new javax.swing.JLabel();
        idade = new javax.swing.JFormattedTextField();
        lblNome10 = new javax.swing.JLabel();
        combosexo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblNome3 = new javax.swing.JLabel();
        bairro = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        lblNome4 = new javax.swing.JLabel();
        lblNome5 = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        lblNome6 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        lblNome7 = new javax.swing.JLabel();
        comboUf = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblNome8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lblNome9 = new javax.swing.JLabel();
        telefone = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 720));
        setPreferredSize(new java.awt.Dimension(750, 720));
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(248, 250, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        jPanel1.setToolTipText("Dados Pessoais");
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblNome2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(73, 81, 129));
        lblNome2.setText("Nome");

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(73, 81, 129));
        lblNome.setText("CPF");

        cpfad.setEditable(false);
        try {
            cpfad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfad.setMinimumSize(new java.awt.Dimension(64, 25));

        nome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(84, 88, 113));
        nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblIdade2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblIdade2.setForeground(new java.awt.Color(73, 81, 129));
        lblIdade2.setText("Data Nascimento");

        try {
            idade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idade.setMinimumSize(new java.awt.Dimension(64, 25));

        lblNome10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome10.setForeground(new java.awt.Color(73, 81, 129));
        lblNome10.setText("Sexo");

        combosexo.setBackground(new java.awt.Color(73, 81, 129));
        combosexo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        combosexo.setForeground(new java.awt.Color(255, 255, 255));
        combosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Feminino", "Masculino" }));
        combosexo.setMinimumSize(new java.awt.Dimension(72, 25));
        combosexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combosexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome2)
                        .addGap(375, 375, 375)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIdade2)
                        .addGap(29, 29, 29)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNome10)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combosexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpfad, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(234, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIdade2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 680, 120));

        jPanel2.setBackground(new java.awt.Color(248, 250, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endere??o", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N
        jPanel2.setToolTipText("");

        lblNome3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(73, 81, 129));
        lblNome3.setText("N?? ");

        bairro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        bairro.setForeground(new java.awt.Color(84, 88, 113));
        bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        num.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        num.setForeground(new java.awt.Color(84, 88, 113));
        num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome4.setForeground(new java.awt.Color(73, 81, 129));
        lblNome4.setText("Rua");

        lblNome5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome5.setForeground(new java.awt.Color(73, 81, 129));
        lblNome5.setText("Bairro");

        rua.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rua.setForeground(new java.awt.Color(84, 88, 113));
        rua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome6.setForeground(new java.awt.Color(73, 81, 129));
        lblNome6.setText("Cidade");

        cidade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cidade.setForeground(new java.awt.Color(84, 88, 113));
        cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome7.setForeground(new java.awt.Color(73, 81, 129));
        lblNome7.setText("UF");

        comboUf.setBackground(new java.awt.Color(73, 81, 129));
        comboUf.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        comboUf.setForeground(new java.awt.Color(255, 255, 255));
        comboUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES ", "GO", "MA", "MT ", "MS", "MG", "PA", "PB ", "PE ", "PI ", "PR", "RJ ", "RN", "RS", "RO", "RR", "SC" }));
        comboUf.setSelectedIndex(-1);
        comboUf.setMinimumSize(new java.awt.Dimension(72, 25));
        comboUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome4)
                    .addComponent(lblNome5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cidade))
                    .addComponent(rua, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome3)
                    .addComponent(lblNome7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboUf, 0, 99, Short.MAX_VALUE)
                    .addComponent(num))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNome7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 680, 110));

        jPanel3.setBackground(new java.awt.Color(248, 250, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        lblNome8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblNome8.setForeground(new java.awt.Color(73, 81, 129));
        lblNome8.setText("Telefone");

        email.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(84, 88, 113));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome9.setForeground(new java.awt.Color(73, 81, 129));
        lblNome9.setText("Email");

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome9)
                    .addComponent(lblNome8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 680, 110));

        btSalvar.setContentAreaFilled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/altadotela.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUfActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
          
        AlterarAdotante alt = new AlterarAdotante();
        Adotante a= new Adotante ();
        //try {
        a.setNome(nome.getText());
        a.setCpf(cpfad.getText());
        
        a.setIdade(idade.getText());
        a.setSexo((String) combosexo.getSelectedItem());
        a.setRua(rua.getText());
        a.setNum(Integer.parseInt(num.getText()));
        a.setBairro(bairro.getText());
        a.setCidade(cidade.getText());
        a.setUf((String) comboUf.getSelectedItem());
        a.setEmail(email.getText());
        a.setTelefone(telefone.getText());
        
        AdotanteDAO dao = new AdotanteDAO();
        dao.alterarAdotante(a);

        JOptionPane.showMessageDialog(null, "Adotante alterado com sucesso.");
        
        alt.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btSalvarActionPerformed

    private void combosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combosexoActionPerformed
      public void selectCombo(){
        if(comboUf.getSelectedIndex()>=1){
            int posLin = comboUf.getSelectedIndex();
            String valLinCombo = comboUf.getSelectedItem().toString();
        }
    }
    public void alterar(String cpf){
        try {
            AdotanteDAO dao = new AdotanteDAO();
            List<Adotante> listAdot = dao.ConsAdotanteCpf(cpf);
            
            for(Adotante f : listAdot){
                
                cpfad.setText(f.getCpf());
                
                nome.setText(f.getNome());
                idade.setText(String.valueOf(f.getIdade()));
                combosexo.setSelectedItem(String.valueOf(f.getUf()));
                rua.setText(f.getRua());
                num.setText(String.valueOf(f.getNum()));
                bairro.setText(f.getBairro());
                cidade.setText(f.getCidade());
                comboUf.setSelectedItem(String.valueOf(f.getUf()));
                email.setText(f.getEmail());
                telefone.setText(f.getTelefone());
                
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
            java.util.logging.Logger.getLogger(SalvarAltAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalvarAltAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalvarAltAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalvarAltAdotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalvarAltAdotante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cidade;
    private javax.swing.JComboBox<String> comboUf;
    private javax.swing.JComboBox<String> combosexo;
    private javax.swing.JFormattedTextField cpfad;
    private javax.swing.JTextField email;
    private javax.swing.JFormattedTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIdade2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome10;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JLabel lblNome9;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rua;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}
