/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConnectionBD;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.SQLException;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author sKY_FALL
 */
public class TelaLogin extends javax.swing.JFrame {
    ConnectionBD conexao = new ConnectionBD();
    /**
     * Creates new form Login
     */
    public TelaLogin() {
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

        jPanelbg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanelLogin = new javax.swing.JPanel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        buttonAcessar = new java.awt.Button();
        jLabelForgotPass = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelLoader = new javax.swing.JPanel();
        img_loader = new javax.swing.JLabel();
        jLabel_logginin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanelbg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldUsuario.setText("Username");
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
        });

        jPasswordFieldSenha.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldSenha.setText("password");
        jPasswordFieldSenha.setBorder(null);
        jPasswordFieldSenha.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPasswordFieldSenhaHierarchyChanged(evt);
            }
        });
        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 153, 153));

        jSeparator2.setForeground(new java.awt.Color(255, 153, 153));

        jLabelUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Contacts_22px_1.png"))); // NOI18N
        jLabelUsername.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Unlock_22px_1.png"))); // NOI18N
        jLabelPassword.setFocusable(false);
        jLabelPassword.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        buttonAcessar.setBackground(new java.awt.Color(255, 153, 153));
        buttonAcessar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonAcessar.setForeground(new java.awt.Color(255, 255, 255));
        buttonAcessar.setLabel("Login");
        buttonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAcessarActionPerformed(evt);
            }
        });

        jLabelForgotPass.setForeground(new java.awt.Color(102, 102, 102));
        jLabelForgotPass.setText("Esqueceu a senha?");

        jLabelTitle.setFont(new java.awt.Font("Segoe UI Semilight", 0, 26)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitle.setText("Login");

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoginLayout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelForgotPass)
                        .addGap(146, 146, 146)
                        .addComponent(buttonAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsuario)
                            .addComponent(jSeparator1))))
                .addGap(189, 189, 189))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(98, 98, 98)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jLabelForgotPass)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        buttonAcessar.getAccessibleContext().setAccessibleName("Sair");

        jPanel1.add(jPanelLogin, "card2");

        jPanelLoader.setBackground(new java.awt.Color(255, 255, 255));

        img_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lg.double-ring-spinner.gif"))); // NOI18N

        jLabel_logginin.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_logginin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_logginin.setForeground(new java.awt.Color(255, 153, 153));
        jLabel_logginin.setText("Loggin in...");

        javax.swing.GroupLayout jPanelLoaderLayout = new javax.swing.GroupLayout(jPanelLoader);
        jPanelLoader.setLayout(jPanelLoaderLayout);
        jPanelLoaderLayout.setHorizontalGroup(
            jPanelLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoaderLayout.createSequentialGroup()
                .addGroup(jPanelLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoaderLayout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel_logginin))
                    .addGroup(jPanelLoaderLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(img_loader, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        jPanelLoaderLayout.setVerticalGroup(
            jPanelLoaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoaderLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(img_loader, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_logginin)
                .addGap(171, 171, 171))
        );

        jPanel1.add(jPanelLoader, "card3");

        javax.swing.GroupLayout jPanelbgLayout = new javax.swing.GroupLayout(jPanelbg);
        jPanelbg.setLayout(jPanelbgLayout);
        jPanelbgLayout.setHorizontalGroup(
            jPanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelbgLayout.setVerticalGroup(
            jPanelbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(722, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained
        jTextFieldUsuario.setText("");
    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    private void buttonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAcessarActionPerformed
        conexao.getConexao();
        try {
            
            conexao.executaSql("select *from usuarios where user_nome='"+jTextFieldUsuario.getText()+"'");
            conexao.rs.first();
            
            
            if(conexao.rs.getString("user_senha").equals(jPasswordFieldSenha.getText())){
                
              jPanelLoader.show();
              jPanelLogin.hide();    
        
        new java.util.Timer().schedule(new TimerTask() {
           @Override
           public void run() {
             
            TelaPrincipal view = new TelaPrincipal(jTextFieldUsuario.getText());
            view.setExtendedState(MAXIMIZED_BOTH);
            view.show();
       
    
       dispose();
           }
       },1000*4);
        
            }else{
                JOptionPane.showMessageDialog(rootPane, "Senha invalida!");
            }
            
        } catch (SQLException ex) {
                
                JOptionPane.showMessageDialog(rootPane," Usuario não encontrado!","",JOptionPane.ERROR_MESSAGE);
        } finally{
                conexao.closeConnection();
    }  
           

    
    }//GEN-LAST:event_buttonAcessarActionPerformed

    private void jPasswordFieldSenhaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaHierarchyChanged
        jPasswordFieldSenha.setText("");
    }//GEN-LAST:event_jPasswordFieldSenhaHierarchyChanged

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonAcessar;
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabelForgotPass;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabel_logginin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLoader;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelbg;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
