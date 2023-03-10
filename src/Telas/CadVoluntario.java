/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import Classes.Voluntario;
import DAO.VoluntarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author limag
 */
public class CadVoluntario extends javax.swing.JFrame {

    /**
     * Creates new form CadVoluntario
     */
    public CadVoluntario() {
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
        nome = new javax.swing.JTextField();
        idade = new javax.swing.JFormattedTextField();
        lblIdade3 = new javax.swing.JLabel();
        lblNome10 = new javax.swing.JLabel();
        combosexo = new javax.swing.JComboBox<>();
        cpf1 = new javax.swing.JFormattedTextField();
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
        tel = new javax.swing.JFormattedTextField();
        btCad = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Volunt??rio");
        setResizable(isUndecorated());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(148, 151, 167));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setToolTipText("Dados Pessoais");
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblNome2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(250, 236, 235));
        lblNome2.setText("Nome");

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(250, 236, 235));
        lblNome.setText("CPF");

        nome.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(84, 88, 113));
        nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        try {
            idade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        idade.setMinimumSize(new java.awt.Dimension(64, 25));

        lblIdade3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblIdade3.setForeground(new java.awt.Color(250, 236, 235));
        lblIdade3.setText("Data Nascimento");

        lblNome10.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome10.setForeground(new java.awt.Color(250, 236, 235));
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

        try {
            cpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf1.setMinimumSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblIdade3)
                        .addGap(18, 18, 18)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(lblNome10)
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combosexo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdade3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combosexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 670, 120));

        jPanel2.setBackground(new java.awt.Color(148, 151, 167));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endere??o", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setToolTipText("");

        lblNome3.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(250, 236, 235));
        lblNome3.setText("N?? ");

        bairro.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        bairro.setForeground(new java.awt.Color(84, 88, 113));
        bairro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        num.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        num.setForeground(new java.awt.Color(84, 88, 113));
        num.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome4.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome4.setForeground(new java.awt.Color(250, 236, 235));
        lblNome4.setText("Rua");

        lblNome5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome5.setForeground(new java.awt.Color(250, 236, 235));
        lblNome5.setText("Bairro");

        rua.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rua.setForeground(new java.awt.Color(84, 88, 113));
        rua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome6.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome6.setForeground(new java.awt.Color(250, 236, 235));
        lblNome6.setText("Cidade");

        cidade.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cidade.setForeground(new java.awt.Color(84, 88, 113));
        cidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome7.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome7.setForeground(new java.awt.Color(250, 236, 235));
        lblNome7.setText("UF");

        comboUf.setBackground(new java.awt.Color(250, 236, 235));
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
                        .addComponent(cidade, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                    .addComponent(rua))
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
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 670, 110));

        jPanel3.setBackground(new java.awt.Color(148, 151, 167));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        lblNome8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblNome8.setForeground(new java.awt.Color(250, 236, 235));
        lblNome8.setText("Telefone");

        email.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(84, 88, 113));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(73, 81, 129), 1, true));

        lblNome9.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        lblNome9.setForeground(new java.awt.Color(250, 236, 235));
        lblNome9.setText("Email");

        try {
            tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

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
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 670, 120));

        btCad.setContentAreaFilled(false);
        btCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadActionPerformed(evt);
            }
        });
        getContentPane().add(btCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, 190, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/voltar rosa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 70, 60));

        btVoltar.setContentAreaFilled(false);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 80, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadVol.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUfActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
sair();        // TODO add your handling code here:
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadActionPerformed
    cadastrarVoluntario();        // TODO add your handling code here:
    }//GEN-LAST:event_btCadActionPerformed

    private void combosexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combosexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combosexoActionPerformed
    public void selectCombo(){
        if(comboUf.getSelectedIndex()>=1){
            int posLin = comboUf.getSelectedIndex();
            String valLinCombo = comboUf.getSelectedItem().toString();
        }
        
    }
            public void selectComboSexo(){
        if(combosexo.getSelectedIndex()>=1){
            int posLin = combosexo.getSelectedIndex();
            String valLinCombo = combosexo.getSelectedItem().toString();
        }}
    public void cadastrarVoluntario () {
        
      
        Voluntario a= new Voluntario ();  
        //try {
        a.setNome(nome.getText());
        a.setCpf(cpf1.getText());
        
        a.setIdade(idade.getText());
        a.setSexo((String) combosexo.getSelectedItem());
        a.setRua(rua.getText());
        a.setNum(Integer.parseInt(num.getText()));
        a.setBairro(bairro.getText());
        a.setCidade(cidade.getText());
        a.setUf((String) comboUf.getSelectedItem());
        a.setEmail(email.getText());
        a.setTelefone(tel.getText());
        
        VoluntarioDAO dao = new VoluntarioDAO();
        dao.cadVoluntario(a);
        
         
         if(a!=null){
            JOptionPane.showMessageDialog(null, "Volunt??rio cadastrado com sucesso!", "Cadastro OK", 1);
            limpar();
         }
        else{
             
            JOptionPane.showMessageDialog(null, "J?? existe um volunt??rio com este CPF!", "Erro de cpf", 0);
            cpf1.setText("");
            cpf1.requestFocus();
         }
        } 
        /*catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "O CPF deve ser um inteiro!", "ERRO de ID", 0);
            cpf.setText("");
            cpf.requestFocus();
        } */

     public void limpar(){
        nome.setText("");
        combosexo.setSelectedItem("Selecione");
        cpf1.setText("");
        idade.setText("");
        rua.setText("");
        num.setText("");
        bairro.setText("");
        cidade.setText("");
        comboUf.setSelectedItem("Selecione");
        email.setText("");
        tel.setText("");
        
        
        nome.requestFocus();
    }
    
     public void sair(){
        int resp = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja sair da p??gina de Cadastro de Volunt??rio?",
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
            java.util.logging.Logger.getLogger(CadVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadVoluntario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadVoluntario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton btCad;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cidade;
    private javax.swing.JComboBox<String> comboUf;
    private javax.swing.JComboBox<String> combosexo;
    private javax.swing.JFormattedTextField cpf1;
    private javax.swing.JTextField email;
    private javax.swing.JFormattedTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblIdade3;
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
    private javax.swing.JFormattedTextField tel;
    // End of variables declaration//GEN-END:variables
}
