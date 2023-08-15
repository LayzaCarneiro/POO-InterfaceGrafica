package telas;

import entidades.Admin;
import entidades.Cliente;
import entidades.Login;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import model.dao.AdminDAO;
import model.dao.ClienteDAO;
import model.dao.LoginDAO;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class LoginTela extends javax.swing.JFrame {
    public LoginTela() {
        initComponents();
//        LocalDate myObj = LocalDate.now();
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//
//        String formattedDate = myObj.format(myFormatObj);
//        lblHora.setText("Dia: " + formattedDate);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        painelGradiente = new keeptoo.KGradientPanel();
        painelLogin = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        pwdSenha = new javax.swing.JPasswordField();
        lblNaoPossuiConta = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        btnEntrar = new com.k33ptoo.components.KButton();
        lblLogoPerfil = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado On-line");
        setUndecorated(true);
        setResizable(false);

        painelGradiente.setkEndColor(new java.awt.Color(255, 71, 0));
        painelGradiente.setkGradientFocus(400);
        painelGradiente.setkStartColor(new java.awt.Color(255, 189, 91));

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));
        painelLogin.setPreferredSize(new java.awt.Dimension(310, 432));

        lblNome.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 34, 5));
        lblNome.setText("Nome");

        lblSobrenome.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        lblSobrenome.setForeground(new java.awt.Color(255, 34, 5));
        lblSobrenome.setText("Senha");

        lblLogin.setFont(new java.awt.Font("Yu Gothic UI", 1, 22)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 34, 5));
        lblLogin.setText("Login");

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
        pwdSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdSenhaKeyPressed(evt);
            }
        });

        lblNaoPossuiConta.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        lblNaoPossuiConta.setForeground(new java.awt.Color(102, 102, 102));
        lblNaoPossuiConta.setText("Não possui uma conta?");

        lblCadastrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(255, 34, 5));
        lblCadastrar.setText("Cadastrar");
        lblCadastrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblCadastrarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblCadastrarFocusLost(evt);
            }
        });
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseEntered(evt);
            }
        });

        btnEntrar.setText("Entre");
        btnEntrar.setToolTipText("");
        btnEntrar.setActionCommand("Fazer login");
        btnEntrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnEntrar.setkBackGroundColor(new java.awt.Color(0, 0, 255));
        btnEntrar.setkEndColor(new java.awt.Color(153, 153, 153));
        btnEntrar.setkFillButton(false);
        btnEntrar.setkForeGround(new java.awt.Color(255, 35, 5));
        btnEntrar.setkHoverColor(new java.awt.Color(0, 0, 255));
        btnEntrar.setkHoverEndColor(new java.awt.Color(255, 35, 5));
        btnEntrar.setkHoverForeGround(new java.awt.Color(255, 35, 5));
        btnEntrar.setkHoverStartColor(new java.awt.Color(255, 35, 5));
        btnEntrar.setkIndicatorColor(new java.awt.Color(0, 0, 255));
        btnEntrar.setkPressedColor(new java.awt.Color(153, 153, 153));
        btnEntrar.setkSelectedColor(new java.awt.Color(0, 0, 255));
        btnEntrar.setkStartColor(new java.awt.Color(153, 153, 153));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblLogoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_perfil.png"))); // NOI18N

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(lblLogoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblSobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(pwdSenha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblNaoPossuiConta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCadastrar)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addGap(134, 134, 134))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblLogin)
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(lblLogoPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lblNome)))
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSobrenome)
                .addGap(0, 0, 0)
                .addComponent(pwdSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaoPossuiConta)
                    .addComponent(lblCadastrar))
                .addGap(44, 44, 44))
        );

        lblMarca.setFont(new java.awt.Font("Eras Demi ITC", 0, 48)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(255, 255, 255));
        lblMarca.setText("Supermercado");

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_poo.png"))); // NOI18N

        lblFrase.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblFrase.setForeground(new java.awt.Color(255, 255, 255));
        lblFrase.setText("Compras fáceis e confiáveis!");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelGradienteLayout = new javax.swing.GroupLayout(painelGradiente);
        painelGradiente.setLayout(painelGradienteLayout);
        painelGradienteLayout.setHorizontalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGradienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(0, 115, Short.MAX_VALUE)
                        .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(lblFrase))
                        .addGap(79, 79, 79))
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)))
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        painelGradienteLayout.setVerticalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFrase)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelGradiente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelGradiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void lblCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseEntered

        // TODO add your handling code here:        lblCadastrar.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
    }//GEN-LAST:event_lblCadastrarMouseEntered

    private void lblCadastrarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCadastrarFocusGained
        // TODO add your handling code here:
        Border blackline = BorderFactory.createLineBorder(Color.black);
        lblCadastrar.setBorder(blackline);

    }//GEN-LAST:event_lblCadastrarFocusGained

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        AdminDAO admDAO = new AdminDAO();
        ClienteDAO dao = new ClienteDAO();
        LoginDAO ldao = new LoginDAO();
        Login l = new Login();
        
        
        if(admDAO.checkAdm(txtNome.getText(), new String(pwdSenha.getPassword()))){
            l.setNome(txtNome.getText());
            l.setSenha(new String(pwdSenha.getPassword()));
            
            for(Admin a: admDAO.read()){
                if(l.getNome().equals(a.getNome())){
                    l.setCPF(a.getCPF());
                }
            }
            
            ldao.create(l);
            
            new Produtos().setVisible(true);
            this.dispose();
        } else if(dao.checkLogin(txtNome.getText(), new String(pwdSenha.getPassword()))) {
            l.setNome(txtNome.getText());
            l.setSenha(new String(pwdSenha.getPassword()));
            
            for(Cliente c: dao.read()){
                if(l.getNome().equals(c.getNome())){
                    l.setCPF(c.getCPF());
                }
            }
            
            ldao.create(l);
            
            new ComprasTela().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Dados inválidos.");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        // TODO add your handling code here:
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void lblCadastrarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblCadastrarFocusLost
        // TODO add your handling code here:
        Border blackline = BorderFactory.createLineBorder(Color.black);
        lblCadastrar.setBorder(blackline);
    }//GEN-LAST:event_lblCadastrarFocusLost

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pwdSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdSenhaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            AdminDAO admDAO = new AdminDAO();
            ClienteDAO dao = new ClienteDAO();
            LoginDAO ldao = new LoginDAO();
            Login l = new Login();


            if(admDAO.checkAdm(txtNome.getText(), new String(pwdSenha.getPassword()))){
                l.setNome(txtNome.getText());
                l.setSenha(new String(pwdSenha.getPassword()));
                
                for(Admin a: admDAO.read()){
                    if(l.getNome().equals(a.getNome())){
                        l.setCPF(a.getCPF());
                    }
                }
                
                ldao.create(l);
                
                new Produtos().setVisible(true);
                this.dispose();
            } else if(dao.checkLogin(txtNome.getText(), new String(pwdSenha.getPassword()))) {
                l.setNome(txtNome.getText());
                l.setSenha(new String(pwdSenha.getPassword()));
                
                for(Cliente c: dao.read()){
                    if(l.getNome().equals(c.getNome())){
                        l.setCPF(c.getCPF());
                    }
                }
                
                ldao.create(l);

                new ComprasTela().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Dados inválidos.");
            }
        }
    }//GEN-LAST:event_pwdSenhaKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogoPerfil;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNaoPossuiConta;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSobrenome;
    private keeptoo.KGradientPanel painelGradiente;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPasswordField pwdSenha;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
