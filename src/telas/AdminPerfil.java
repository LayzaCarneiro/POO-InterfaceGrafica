package telas;

import entidades.Admin;
import entidades.Login;
import javax.swing.JOptionPane;
import model.dao.AdminDAO;
import model.dao.ClienteDAO;
import model.dao.LoginDAO;

public class AdminPerfil extends javax.swing.JFrame {
    public AdminPerfil() {
        initComponents();
        
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            txtNome.setText(l.getNome());
            pwdSenha.setText(l.getSenha());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGradiente = new keeptoo.KGradientPanel();
        painelLogin = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblPerfilAdm = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        btnAtualizar = new com.k33ptoo.components.KButton();
        lblLogoLogin = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblRelatórios = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelGradiente.setkEndColor(new java.awt.Color(255, 189, 91));
        painelGradiente.setkGradientFocus(400);
        painelGradiente.setkStartColor(new java.awt.Color(255, 71, 0));
        painelGradiente.setPreferredSize(new java.awt.Dimension(926, 578));
        painelGradiente.setVerifyInputWhenFocusTarget(false);

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 34, 5));
        lblNome.setText("Nome");

        lblSenha.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 34, 5));
        lblSenha.setText("Senha");

        lblPerfilAdm.setFont(new java.awt.Font("Yu Gothic UI", 1, 32)); // NOI18N
        lblPerfilAdm.setForeground(new java.awt.Color(255, 71, 0));
        lblPerfilAdm.setText("Perfil (Admin)");

        txtNome.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 33, 5)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        pwdSenha.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        pwdSenha.setToolTipText("");
        pwdSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 33, 5)));
        pwdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdSenhaActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.setToolTipText("");
        btnAtualizar.setActionCommand("Fazer login");
        btnAtualizar.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnAtualizar.setkBackGroundColor(new java.awt.Color(0, 0, 255));
        btnAtualizar.setkEndColor(new java.awt.Color(153, 153, 153));
        btnAtualizar.setkFillButton(false);
        btnAtualizar.setkForeGround(new java.awt.Color(255, 35, 5));
        btnAtualizar.setkHoverColor(new java.awt.Color(0, 0, 255));
        btnAtualizar.setkHoverEndColor(new java.awt.Color(255, 35, 5));
        btnAtualizar.setkHoverForeGround(new java.awt.Color(255, 35, 5));
        btnAtualizar.setkHoverStartColor(new java.awt.Color(255, 35, 5));
        btnAtualizar.setkIndicatorColor(new java.awt.Color(0, 0, 255));
        btnAtualizar.setkPressedColor(new java.awt.Color(153, 153, 153));
        btnAtualizar.setkSelectedColor(new java.awt.Color(0, 0, 255));
        btnAtualizar.setkStartColor(new java.awt.Color(153, 153, 153));
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblLogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_perfil.png"))); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblPerfilAdm))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLogoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lblPerfilAdm)
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                        .addComponent(lblLogoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        lblPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        lblSair.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        lblRelatórios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblRelatórios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatórios.setText("Relatórios");
        lblRelatórios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatóriosMouseClicked(evt);
            }
        });

        lblProdutos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setText("Produtos");
        lblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProdutosMouseClicked(evt);
            }
        });

        lblCategorias.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");
        lblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoriasMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        javax.swing.GroupLayout painelGradienteLayout = new javax.swing.GroupLayout(painelGradiente);
        painelGradiente.setLayout(painelGradienteLayout);
        painelGradienteLayout.setHorizontalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutos)
                    .addComponent(lblCategorias)
                    .addComponent(lblPerfil)
                    .addComponent(lblRelatórios)
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblSair))
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );
        painelGradienteLayout.setVerticalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCategorias)
                        .addGap(12, 12, 12)
                        .addComponent(lblPerfil)
                        .addGap(12, 12, 12)
                        .addComponent(lblRelatórios)
                        .addGap(305, 305, 305)
                        .addComponent(lblSair))
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelGradiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGradiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void pwdSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdSenhaActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        try{
            AdminDAO dao = new AdminDAO();
            LoginDAO ldao = new LoginDAO();
            
            for(Admin a: dao.read()){
                for(Login l: ldao.read()){
                    if(l.getNome().equals(a.getNome())){
                        a.setNome(txtNome.getText());
                        a.setSenha(new String(pwdSenha.getPassword()));

                        dao.update(a);
                        
                        JOptionPane.showMessageDialog(rootPane, "Faça o login novamente.");
                    
                    }
                }
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Erro ao atualizar dados.");
        }
        
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            ldao.delete(l);
        }
        
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            ldao.delete(l);
        }
        
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblRelatóriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatóriosMouseClicked
        // TODO add your handling code here:
        new Relatórios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRelatóriosMouseClicked

    private void lblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutosMouseClicked
        // TODO add your handling code here:
        new Produtos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdutosMouseClicked

    private void lblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseClicked
        // TODO add your handling code here:
        new Categorias().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCategoriasMouseClicked

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
            java.util.logging.Logger.getLogger(AdminPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAtualizar;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPerfilAdm;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatórios;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSenha;
    private keeptoo.KGradientPanel painelGradiente;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
