package telas;

import entidades.Categoria;
import entidades.Login;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.CategoriaDAO;
import model.dao.LoginDAO;

/**
 *
 * @author dudum
 */
public class Categorias extends javax.swing.JFrame {

    /**
     * Creates new form Categorias
     */
    public Categorias() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaCategorias.getModel();
        tabelaCategorias.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }
    
    public void readTable(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaCategorias.getModel();
        modelo.setNumRows(0);
        CategoriaDAO cdao = new CategoriaDAO();
        
        for(Categoria c: cdao.read()){
            modelo.addRow(new Object[]{
                    c.getId(),
                    c.getNome()
                    });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        painelCategorias = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCategorias = new javax.swing.JTable();
        lblListaDeCategorias = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblRelatórios = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Adicionar");

        jButton2.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 153, 51));
        jButton2.setText("Adicionar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(20, 20, 0, 0));
        setName("frameCategorias"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 189, 91));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 71, 0));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(926, 578));

        painelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 34, 5));
        lblTitulo.setText("                Administrar Categorias");
        lblTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 71, 0)));

        txtNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N

        lblNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 71, 0));
        lblNome.setText("Nome:");

        btnAdicionar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 71, 0));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 71, 0));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 71, 0));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 71, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tabelaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nº Categoria", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCategorias.setShowGrid(true);
        tabelaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaCategoriasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCategorias);

        lblListaDeCategorias.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        lblListaDeCategorias.setForeground(new java.awt.Color(255, 71, 0));
        lblListaDeCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblListaDeCategorias.setText("Lista de Categorias");
        lblListaDeCategorias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 71, 0)));

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCategoriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblListaDeCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(26, 26, 26))
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(55, 55, 55)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        painelCategoriasLayout.setVerticalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(52, 52, 52)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(lblListaDeCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        lblCategorias.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");
        lblCategorias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCategoriasMouseClicked(evt);
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

        lblRelatórios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblRelatórios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatórios.setText("Relatórios");
        lblRelatórios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatóriosMouseClicked(evt);
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

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSair)
                    .addComponent(lblProdutos)
                    .addComponent(lblCategorias)
                    .addComponent(lblPerfil)
                    .addComponent(lblRelatórios)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSair)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        if(txtNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Dados incompletos. A categoria deve possuir um nome.");
        } else{
            Categoria c = new Categoria();
            CategoriaDAO dao = new CategoriaDAO();
            c.setNome(txtNome.getText());

            dao.create(c);

            txtNome.setText("");
        }
       
        readTable();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if(tabelaCategorias.getSelectedRow() != -1){
            Categoria c = new Categoria();
            CategoriaDAO dao = new CategoriaDAO();
   
            c.setId((int)tabelaCategorias.getValueAt(tabelaCategorias.getSelectedRow(), 0));

            dao.delete(c);

            txtNome.setText("");

            readTable();
            
        } else 
            JOptionPane.showMessageDialog(rootPane, "Linha não selecionada");
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if(tabelaCategorias.getSelectedRow() != -1){
            Categoria c = new Categoria();
            CategoriaDAO dao = new CategoriaDAO();
            c.setNome(txtNome.getText());
            c.setId((int)tabelaCategorias.getValueAt(tabelaCategorias.getSelectedRow(), 0));

            dao.update(c);

            txtNome.setText("");

            readTable();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tabelaCategoriasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCategoriasMouseReleased
        // TODO add your handling code here:
        if(tabelaCategorias.getSelectedRow() != -1){
            txtNome.setText(tabelaCategorias.getValueAt(tabelaCategorias.getSelectedRow(), 1).toString());
        } 
    }//GEN-LAST:event_tabelaCategoriasMouseReleased

    private void lblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCategoriasMouseClicked

    private void lblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutosMouseClicked
        // TODO add your handling code here:
        new Produtos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblProdutosMouseClicked

    private void lblRelatóriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatóriosMouseClicked
        // TODO add your handling code here:
        new Relatórios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRelatóriosMouseClicked

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
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Categorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblListaDeCategorias;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatórios;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelCategorias;
    private javax.swing.JTable tabelaCategorias;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
