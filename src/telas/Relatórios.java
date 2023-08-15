package telas;

import entidades.Cliente;
import entidades.Compras;
import entidades.Login;
import entidades.Produto;
import entidades.RelatórioCliente;
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.CategoriaDAO;
import model.dao.ClienteDAO;
import model.dao.ComprasDAO;
import model.dao.LoginDAO;
import model.dao.ProdutoDAO;
import model.dao.RelatórioClienteDAO;

public class Relatórios extends javax.swing.JFrame {


    public Relatórios() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutosEmFalta.getModel();
        tabelaProdutosEmFalta.setRowSorter(new TableRowSorter(modelo));
        readTableEstoque();
        
        DefaultTableModel modeloClientes = (DefaultTableModel) tabelaClientes.getModel();
        readTableClientes();
    }
    public void readTableEstoque(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutosEmFalta.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        CategoriaDAO cdao = new CategoriaDAO();
        
        
        for(Produto p: pdao.read()){
                if(p.getQuantidade() <= 0){
                    if(p.getDesconto() > 0){
                        modelo.addRow(new Object[]{
                                p.getNome(),
                                p.getQuantidade(),
                                (p.getPreço() - (p.getPreço() * p.getDesconto() / 100)) + "  (" + p.getDesconto() + "% de desconto)",
                                p.getDesconto(),
                                p.getCategoria()
                                });
                    }
                    else{
                        modelo.addRow(new Object[]{
                                p.getNome(),
                                p.getQuantidade(),
                                p.getPreço(),
                                p.getDesconto(),
                                p.getCategoria()
                                });
                    }
                    
                }
        }
        
    }
    
    public void readTableClientes(){
        DefaultTableModel modeloClientes = (DefaultTableModel) tabelaClientes.getModel();
        modeloClientes.setNumRows(0);
        ClienteDAO cdao = new ClienteDAO();
        ComprasDAO comdao = new ComprasDAO();
        RelatórioClienteDAO rcdao = new RelatórioClienteDAO();
        double valorTotal = 0;
        
        for(RelatórioCliente rc: rcdao.read()){
            rcdao.delete(rc);
        }
        
        try {
            for(Cliente c: cdao.read()){
                valorTotal = 0;
                for(Compras com: comdao.read()){
                    if(c.getNome().equals(com.getNome())){
                        valorTotal += com.getValor();
                    }
                }
                c.setValorTotal(valorTotal);                
                
                RelatórioCliente rc = new RelatórioCliente();
                rc.setCliente(c.getNome());
                rc.setValorTotal(valorTotal);
                rcdao.create(rc);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        for(RelatórioCliente rc: rcdao.read()){
            modeloClientes.addRow(new Object[]{
                    rc.getCliente(),
                    rc.getValorTotal()
                    });
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGradiente = new keeptoo.KGradientPanel();
        painelLogin = new javax.swing.JPanel();
        lblRankingClientes = new javax.swing.JLabel();
        btnRelatórioProdutos = new javax.swing.JButton();
        lblProdutosEmFalta = new javax.swing.JLabel();
        btnRelatórioClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutosEmFalta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        lblProdutos = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblRelatórios = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelGradiente.setkEndColor(new java.awt.Color(255, 189, 91));
        painelGradiente.setkGradientFocus(400);
        painelGradiente.setkStartColor(new java.awt.Color(255, 71, 0));
        painelGradiente.setPreferredSize(new java.awt.Dimension(926, 578));
        painelGradiente.setVerifyInputWhenFocusTarget(false);

        painelLogin.setBackground(new java.awt.Color(255, 255, 255));

        lblRankingClientes.setFont(new java.awt.Font("Yu Gothic UI", 1, 32)); // NOI18N
        lblRankingClientes.setForeground(new java.awt.Color(255, 71, 0));
        lblRankingClientes.setText("Ranking de Clientes");
        lblRankingClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 71, 0)));

        btnRelatórioProdutos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnRelatórioProdutos.setForeground(new java.awt.Color(255, 71, 0));
        btnRelatórioProdutos.setText("Obter Relatório");
        btnRelatórioProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatórioProdutosActionPerformed(evt);
            }
        });

        lblProdutosEmFalta.setFont(new java.awt.Font("Yu Gothic UI", 1, 32)); // NOI18N
        lblProdutosEmFalta.setForeground(new java.awt.Color(255, 71, 0));
        lblProdutosEmFalta.setText("Produtos em falta");
        lblProdutosEmFalta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 71, 0)));

        btnRelatórioClientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnRelatórioClientes.setForeground(new java.awt.Color(255, 71, 0));
        btnRelatórioClientes.setText("Obter Relatório");
        btnRelatórioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatórioClientesActionPerformed(evt);
            }
        });

        tabelaProdutosEmFalta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Quantidade", "Preço (R$)", "Desconto (%)", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutosEmFalta);

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cliente", "Valor total (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaClientes);

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addComponent(lblRankingClientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRelatórioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLoginLayout.createSequentialGroup()
                            .addComponent(lblProdutosEmFalta)
                            .addGap(35, 35, 35)
                            .addComponent(btnRelatórioProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProdutosEmFalta)
                    .addComponent(btnRelatórioProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRankingClientes)
                    .addComponent(btnRelatórioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

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

        lblPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        lblRelatórios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblRelatórios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatórios.setText("Relatórios");
        lblRelatórios.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lblRelatórios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatóriosMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sair");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelGradienteLayout = new javax.swing.GroupLayout(painelGradiente);
        painelGradiente.setLayout(painelGradienteLayout);
        painelGradienteLayout.setHorizontalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblProdutos)
                    .addComponent(lblCategorias)
                    .addComponent(lblPerfil)
                    .addComponent(lblRelatórios)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        painelGradienteLayout.setVerticalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGradienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCategorias)
                        .addGap(12, 12, 12)
                        .addComponent(lblPerfil)
                        .addGap(12, 12, 12)
                        .addComponent(lblRelatórios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelGradiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGradiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelGradiente.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatórioProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatórioProdutosActionPerformed
        // TODO add your handling code here:
        try {
            tabelaProdutosEmFalta.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Relatórios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRelatórioProdutosActionPerformed

    private void btnRelatórioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatórioClientesActionPerformed
        // TODO add your handling code here:
        try {
            tabelaClientes.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Relatórios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRelatórioClientesActionPerformed

    private void lblRelatóriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatóriosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRelatóriosMouseClicked

    private void lblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseClicked
        // TODO add your handling code here:
        new Categorias().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCategoriasMouseClicked
                                 

    private void lblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutosMouseClicked
        // TODO add your handling code here:
        new Produtos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdutosMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            ldao.delete(l);
        }
        
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
        new AdminPerfil().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPerfilMouseClicked

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
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatórios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatórioClientes;
    private javax.swing.JButton btnRelatórioProdutos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblProdutosEmFalta;
    private javax.swing.JLabel lblRankingClientes;
    private javax.swing.JLabel lblRelatórios;
    private keeptoo.KGradientPanel painelGradiente;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTable tabelaProdutosEmFalta;
    // End of variables declaration//GEN-END:variables
}
