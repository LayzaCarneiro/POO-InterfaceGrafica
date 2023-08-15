package telas;

import entidades.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.*;

public class Produtos extends javax.swing.JFrame {
    public Produtos() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
        tabelaProdutos.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }
    
    public void readTable(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        CategoriaDAO cdao = new CategoriaDAO();
        
        for(Produto p: pdao.read()){
            modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getQuantidade(),
                    p.getPreço(),
                    p.getDesconto(),
                    p.getCategoria()
                    });
        }
        
        for(Categoria c: cdao.read()){
            cbxCategoria.addItem(c);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblPreço = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtPreço = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        lblListaDeProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        cbxCategoria = new javax.swing.JComboBox();
        lblDesconto = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        lblSair = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblRelatórios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrar Produtos");
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setBackground(new java.awt.Color(242, 249, 248));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 189, 91));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 71, 0));
        kGradientPanel1.setkTransparentControls(false);
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(926, 578));

        jPanel1.setBackground(new java.awt.Color(255, 253, 248));

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 34, 5));
        lblTitulo.setText("                     Administrar Produtos");
        lblTitulo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 71, 0)));

        lblNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 71, 0));
        lblNome.setText("Nome:");

        lblCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 71, 0));
        lblCategoria.setText("Categoria:");

        lblQuantidade.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(255, 71, 0));
        lblQuantidade.setText("Quantidade:");

        lblPreço.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPreço.setForeground(new java.awt.Color(255, 71, 0));
        lblPreço.setText("Preço:");

        btnAdicionar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 71, 0));
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
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

        btnDeletar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 71, 0));
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
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

        lblListaDeProdutos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 22)); // NOI18N
        lblListaDeProdutos.setForeground(new java.awt.Color(255, 71, 0));
        lblListaDeProdutos.setText("Lista de produtos");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Quantidade", "Preço (R$)", "Desconto (%)", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseReleased(evt);
            }
        });
        tabelaProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaProdutosKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaProdutos);

        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        lblDesconto.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblDesconto.setForeground(new java.awt.Color(255, 71, 0));
        lblDesconto.setText("Desconto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblListaDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(273, 273, 273))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnAdicionar)
                        .addGap(43, 43, 43)
                        .addComponent(btnAtualizar)
                        .addGap(51, 51, 51)
                        .addComponent(btnDeletar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNome)
                                .addComponent(lblCategoria)
                                .addComponent(lblQuantidade))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(115, 115, 115)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblPreço)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblDesconto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnLimpar)
                                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(lblPreço)
                    .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade)
                    .addComponent(lblDesconto)
                    .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnLimpar)
                    .addComponent(btnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblListaDeProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        lblSair.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        lblProdutos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setText("Produtos");
        lblProdutos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
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

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        lblRelatórios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblRelatórios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatórios.setText("Relatórios");
        lblRelatórios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatóriosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProdutos)
                    .addComponent(lblCategorias)
                    .addComponent(lblPerfil)
                    .addComponent(lblSair)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRelatórios))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProdutos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCategorias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRelatórios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSair)))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        kGradientPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        if(txtNome.getText().isEmpty() || txtPreço.getText().isEmpty() || cbxCategoria.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Dados incompletos.");
        }
        else{
            p.setNome(txtNome.getText());
            p.setPreço(Double.parseDouble(txtPreço.getText()));
            p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            p.setCategoria(cbxCategoria.getSelectedItem().toString());
            if(txtDesconto.getText().isEmpty() || txtDesconto.getText().equals("0")){
                p.setDesconto(0);
            } else{
                p.setDesconto(Integer.parseInt(txtDesconto.getText()));
            }

            dao.create(p);
        
            txtNome.setText("");
            txtPreço.setText("");
            txtQuantidade.setText("");
            txtDesconto.setText("");
        }
        
        cbxCategoria.removeAllItems();
        
        readTable();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtNome.setText("");
        txtPreço.setText("");
        txtQuantidade.setText("");
        txtDesconto.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if(tabelaProdutos.getSelectedRow() != -1){
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
   
            p.setId((int)tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0));

            dao.delete(p);

            txtNome.setText("");
            txtPreço.setText("");
            txtQuantidade.setText("");
            txtDesconto.setText("");

            readTable();
            
        } else 
            JOptionPane.showMessageDialog(rootPane, "Linha não selecionada");
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if(tabelaProdutos.getSelectedRow() != -1){
            
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            p.setNome(txtNome.getText());
            p.setPreço(Double.parseDouble(txtPreço.getText()));
            p.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
            p.setId((int)tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0));
            p.setCategoria(cbxCategoria.getSelectedItem().toString());
            if(txtDesconto.getText().isEmpty() || txtDesconto.getText().equals("0")){
                p.setDesconto(0);
            } else{
                p.setDesconto(Integer.parseInt(txtDesconto.getText()));
            }

            dao.update(p);

            txtNome.setText("");
            txtPreço.setText("");
            txtQuantidade.setText("");
            txtDesconto.setText("");

            readTable();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void tabelaProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseReleased
        // TODO add your handling code here:
        if(tabelaProdutos.getSelectedRow() != -1){
            txtNome.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
            txtQuantidade.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
            txtPreço.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString()); 
            txtDesconto.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());
            cbxCategoria.setSelectedItem(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 5).toString());
            
        } 
    }//GEN-LAST:event_tabelaProdutosMouseReleased

    private void tabelaProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaProdutosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaProdutosKeyReleased

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void lblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProdutosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProdutosMouseClicked

    private void lblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCategoriasMouseClicked
        // TODO add your handling code here:
        new Categorias().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCategoriasMouseClicked

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
        new AdminPerfil().setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox cbxCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblDesconto;
    private javax.swing.JLabel lblListaDeProdutos;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPreço;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRelatórios;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreço;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
