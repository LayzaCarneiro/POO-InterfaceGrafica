package telas;

import entidades.Cliente;
import entidades.Compras;
import entidades.Login;
import javax.swing.JOptionPane;
import model.dao.ClienteDAO;
import model.dao.LoginDAO;

public class ClientePerfil extends javax.swing.JFrame {
    public ClientePerfil() {
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
        lblPerfilCliente = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        btnAtualizar = new com.k33ptoo.components.KButton();
        lblLogoPerfil = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblCarrinho = new javax.swing.JLabel();
        lblRelatório = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelGradiente.setkEndColor(new java.awt.Color(255, 71, 0));
        painelGradiente.setkGradientFocus(400);
        painelGradiente.setkStartColor(new java.awt.Color(255, 189, 91));
        painelGradiente.setPreferredSize(new java.awt.Dimension(926, 578));
        painelGradiente.setVerifyInputWhenFocusTarget(false);

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblNome.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 34, 5));
        lblNome.setText("Nome");

        lblSenha.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 34, 5));
        lblSenha.setText("Senha");

        lblPerfilCliente.setFont(new java.awt.Font("Yu Gothic UI", 1, 32)); // NOI18N
        lblPerfilCliente.setForeground(new java.awt.Color(255, 71, 0));
        lblPerfilCliente.setText("Perfil ");

        txtNome.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 33, 5)));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        pwdSenha.setFont(new java.awt.Font("Yu Gothic UI", 0, 8)); // NOI18N
        pwdSenha.setToolTipText("");
        pwdSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 33, 5)));
        pwdSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdSenhaActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Alterar dados");
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

        lblLogoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_perfil.png"))); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(lblPerfilCliente)
                .addGap(167, 167, 167))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pwdSenha)
                    .addComponent(lblSenha)
                    .addComponent(txtNome)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblLogoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lblPerfilCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenha)
                .addGap(0, 0, 0)
                .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        lblCompras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCompras.setForeground(new java.awt.Color(255, 255, 255));
        lblCompras.setText("Compras");
        lblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprasMouseClicked(evt);
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

        lblPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        lblCarrinho.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCarrinho.setForeground(new java.awt.Color(255, 255, 255));
        lblCarrinho.setText("Carrinho");
        lblCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCarrinhoMouseClicked(evt);
            }
        });

        lblRelatório.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblRelatório.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatório.setText("Relatório");
        lblRelatório.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatórioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelGradienteLayout = new javax.swing.GroupLayout(painelGradiente);
        painelGradiente.setLayout(painelGradienteLayout);
        painelGradienteLayout.setHorizontalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompras)
                    .addComponent(lblPerfil)
                    .addComponent(lblCarrinho)
                    .addComponent(lblSair)
                    .addComponent(lblRelatório))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
        );
        painelGradienteLayout.setVerticalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGradienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRelatório)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
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
            .addComponent(painelGradiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            ClienteDAO dao = new ClienteDAO();
            LoginDAO ldao = new LoginDAO();
            
            for(Cliente c: dao.read()){
                for(Login l: ldao.read()){
                    if(l.getNome().equals(c.getNome())){
                        c.setNome(txtNome.getText());
                        c.setSenha(new String (pwdSenha.getPassword()));
                        c.setCPF(c.getCPF());
                        c.setIdade(c.getIdade());

                        dao.update(c);
                        
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

    private void lblComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMouseClicked
        // TODO add your handling code here:
        new ComprasTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblComprasMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            ldao.delete(l);
        }
        
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void lblCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarrinhoMouseClicked
        // TODO add your handling code here:
        new CarrinhoTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCarrinhoMouseClicked

    private void lblRelatórioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatórioMouseClicked
        // TODO add your handling code here:
        new RelatórioClienteTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRelatórioMouseClicked

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
            java.util.logging.Logger.getLogger(ClientePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientePerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientePerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAtualizar;
    private javax.swing.JLabel lblCarrinho;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoPerfil;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPerfilCliente;
    private javax.swing.JLabel lblRelatório;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSenha;
    private keeptoo.KGradientPanel painelGradiente;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
