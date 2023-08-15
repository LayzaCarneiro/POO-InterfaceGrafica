package telas;

import entidades.*;
import java.text.SimpleDateFormat;
import model.dao.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.Calendar;
import java.util.Date;


public class ComprasTela extends javax.swing.JFrame {
    public ComprasTela() {
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
        LoginDAO ldao = new LoginDAO();
       
        for(Login l: ldao.read()){
            lblUser.setText(l.getNome());
        }
        
        
        cbxCategorias.addItem("Procurar");
        for(Categoria c: cdao.read()){
            cbxCategorias.addItem(c);
        }
        
//        for(Produto p: pdao.read()){
//                if(p.getQuantidade() > 0){
//                    if(p.getDesconto() > 0){
//                        modelo.addRow(new Object[]{
//                                p.getNome(),
//                                (p.getPreço() - (p.getPreço() * p.getDesconto() / 100)) + "  (" + p.getDesconto() + "% de desconto)",
//                                p.getCategoria(),
//                                p.getDesconto()
//                                });
//                    }
//                    else{
//                        modelo.addRow(new Object[]{
//                                p.getNome(),
//                                p.getPreço(),
//                                p.getCategoria(),
//                                p.getDesconto()
//                                });
//                    }
//                    
//                }
//        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGradiente = new keeptoo.KGradientPanel();
        lblCompras = new javax.swing.JLabel();
        lblCarrinho = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        painelCategorias = new javax.swing.JPanel();
        txtPreço = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        lblCategoria = new javax.swing.JLabel();
        cbxCategorias = new javax.swing.JComboBox();
        lblNome = new javax.swing.JLabel();
        lblPreço = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cbxQuantidade = new javax.swing.JComboBox();
        lblQuantidade1 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        btnAdicionarCarrinho = new com.k33ptoo.components.KButton();
        lblSair = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        btnFinalizarC = new com.k33ptoo.components.KButton();
        lblUser = new javax.swing.JLabel();
        lblRelatórios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelGradiente.setkEndColor(new java.awt.Color(255, 71, 0));
        painelGradiente.setkGradientFocus(400);
        painelGradiente.setkStartColor(new java.awt.Color(255, 189, 91));
        painelGradiente.setPreferredSize(new java.awt.Dimension(926, 578));
        painelGradiente.setVerifyInputWhenFocusTarget(false);

        lblCompras.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCompras.setForeground(new java.awt.Color(255, 255, 255));
        lblCompras.setText("Compras");
        lblCompras.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        lblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComprasMouseClicked(evt);
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

        lblPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
            }
        });

        painelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        txtPreço.setEditable(false);
        txtPreço.setBackground(new java.awt.Color(255, 255, 255));

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Preço (R$)", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setSelectionBackground(new java.awt.Color(255, 121, 45));
        tabelaProdutos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tabelaProdutos.setShowGrid(true);
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        lblCategoria.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(255, 34, 5));
        lblCategoria.setText("Categoria:");

        cbxCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoriasItemStateChanged(evt);
            }
        });
        cbxCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriasActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 34, 5));
        lblNome.setText("Nome:");

        lblPreço.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPreço.setForeground(new java.awt.Color(255, 34, 5));
        lblPreço.setText("Preço:");

        lblQuantidade.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(255, 34, 5));
        lblQuantidade.setText("Quantidade:");

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(255, 255, 255));

        cbxQuantidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxQuantidadeItemStateChanged(evt);
            }
        });
        cbxQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxQuantidadeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxQuantidadeMouseReleased(evt);
            }
        });

        lblQuantidade1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblQuantidade1.setForeground(new java.awt.Color(255, 34, 5));
        lblQuantidade1.setText("Valor total:");

        txtValorTotal.setEditable(false);
        txtValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 71, 0)));
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        btnAdicionarCarrinho.setText("Adicionar ao carrinho");
        btnAdicionarCarrinho.setToolTipText("");
        btnAdicionarCarrinho.setActionCommand("Fazer login");
        btnAdicionarCarrinho.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnAdicionarCarrinho.setkBackGroundColor(new java.awt.Color(0, 0, 255));
        btnAdicionarCarrinho.setkEndColor(new java.awt.Color(153, 153, 153));
        btnAdicionarCarrinho.setkFillButton(false);
        btnAdicionarCarrinho.setkForeGround(new java.awt.Color(255, 35, 5));
        btnAdicionarCarrinho.setkHoverColor(new java.awt.Color(0, 0, 255));
        btnAdicionarCarrinho.setkHoverEndColor(new java.awt.Color(255, 35, 5));
        btnAdicionarCarrinho.setkHoverForeGround(new java.awt.Color(255, 35, 5));
        btnAdicionarCarrinho.setkHoverStartColor(new java.awt.Color(255, 35, 5));
        btnAdicionarCarrinho.setkIndicatorColor(new java.awt.Color(0, 0, 255));
        btnAdicionarCarrinho.setkPressedColor(new java.awt.Color(153, 153, 153));
        btnAdicionarCarrinho.setkSelectedColor(new java.awt.Color(0, 0, 255));
        btnAdicionarCarrinho.setkStartColor(new java.awt.Color(153, 153, 153));
        btnAdicionarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCategoriasLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelCategoriasLayout.createSequentialGroup()
                            .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblQuantidade)
                                .addComponent(lblNome)
                                .addComponent(lblQuantidade1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelCategoriasLayout.createSequentialGroup()
                                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painelCategoriasLayout.createSequentialGroup()
                                    .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbxQuantidade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPreço)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCategoriasLayout.createSequentialGroup()
                            .addComponent(lblCategoria)
                            .addGap(18, 18, 18)
                            .addComponent(cbxCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        painelCategoriasLayout.setVerticalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbxCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidade)
                    .addComponent(cbxQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade1))
                .addGap(70, 70, 70))
        );

        lblSair.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        btnFinalizarC.setText("Finalizar compra");
        btnFinalizarC.setToolTipText("");
        btnFinalizarC.setActionCommand("Fazer login");
        btnFinalizarC.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        btnFinalizarC.setkBackGroundColor(new java.awt.Color(0, 0, 255));
        btnFinalizarC.setkEndColor(new java.awt.Color(255, 255, 255));
        btnFinalizarC.setkForeGround(new java.awt.Color(255, 35, 5));
        btnFinalizarC.setkHoverColor(new java.awt.Color(0, 0, 255));
        btnFinalizarC.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnFinalizarC.setkHoverForeGround(new java.awt.Color(153, 153, 153));
        btnFinalizarC.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnFinalizarC.setkIndicatorColor(new java.awt.Color(0, 0, 255));
        btnFinalizarC.setkPressedColor(new java.awt.Color(153, 153, 153));
        btnFinalizarC.setkSelectedColor(new java.awt.Color(0, 0, 255));
        btnFinalizarC.setkStartColor(new java.awt.Color(255, 255, 255));
        btnFinalizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Olá");

        lblRelatórios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblRelatórios.setForeground(new java.awt.Color(255, 255, 255));
        lblRelatórios.setText("Relatório");
        lblRelatórios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRelatóriosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelGradienteLayout = new javax.swing.GroupLayout(painelGradiente);
        painelGradiente.setLayout(painelGradienteLayout);
        painelGradienteLayout.setHorizontalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCompras, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblPerfil)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCarrinho)
                    .addComponent(lblSair)
                    .addComponent(lblRelatórios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFinalizarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        painelGradienteLayout.setVerticalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblUser)
                        .addGap(18, 18, 18)
                        .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE))
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRelatórios)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
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

    private void lblComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComprasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblComprasMouseClicked

    private void lblCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCarrinhoMouseClicked
        // TODO add your handling code here:
        new CarrinhoTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCarrinhoMouseClicked

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
        new ClientePerfil().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void tabelaProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseReleased
        // TODO add your handling code here:
        ProdutoDAO pdao = new ProdutoDAO();
        
        if(tabelaProdutos.getSelectedRow() != -1){
            txtNome.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0).toString());
            for(Produto p: pdao.read()){
                if(p.getNome().equals(txtNome.getText())){
                    double valorComDesc = (p.getPreço() - (p.getPreço() * p.getDesconto() / 100));
                    String preço = String.format("%.2f", valorComDesc);
                    txtPreço.setText("R$ " + preço);
                    txtValorTotal.setText("R$ " + preço);
                }
            }
             
        } 
       
        for(Produto p: pdao.read()){
            if(p.getNome().equals(txtNome.getText())){
                cbxQuantidade.removeAllItems();
                for(int i = 0; i < p.getQuantidade(); i++){
                    cbxQuantidade.addItem(i + 1);
                }
            }
        }
    }//GEN-LAST:event_tabelaProdutosMouseReleased

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            ldao.delete(l);
        }
        
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void cbxCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoriasItemStateChanged
        // TODO add your handling code here:
        ProdutoDAO pdao = new ProdutoDAO();
        
        DefaultTableModel modelo = (DefaultTableModel) tabelaProdutos.getModel();
        modelo.setNumRows(0);
        
        
            for(Produto p: pdao.read()){
                if(cbxCategorias.getSelectedItem().toString().equals(p.getCategoria())){
                    if(p.getQuantidade() > 0){
                        if(p.getDesconto() > 0){
                            double valorComDesc = (p.getPreço() - (p.getPreço() * p.getDesconto() / 100));
                            String preço = String.format("%.2f", valorComDesc);
                            modelo.addRow(new Object[]{
                                    p.getNome(),
                                    preço + "  (" + p.getDesconto() + "% de desconto)",
                                    p.getCategoria(),
                                    p.getDesconto()
                                    });
                        } else{
                            modelo.addRow(new Object[]{
                                    p.getNome(),
                                    p.getPreço(),
                                    p.getCategoria(),
                                    p.getDesconto()
                                    });
                        }  
                    }
                } else if (cbxCategorias.getSelectedItem().toString().equals("Procurar")){
                    if(p.getQuantidade() > 0){
                        if(p.getDesconto() > 0){
                            double valorComDesc = (p.getPreço() - (p.getPreço() * p.getDesconto() / 100));
                            String preço = String.format("%.2f", valorComDesc);
                            modelo.addRow(new Object[]{
                                    p.getNome(),
                                    preço + "  (" + p.getDesconto() + "% de desconto)",
                                    p.getCategoria(),
                                    p.getDesconto()
                                    });
                        } else{
                            modelo.addRow(new Object[]{
                                    p.getNome(),
                                    p.getPreço(),
                                    p.getCategoria(),
                                    p.getDesconto()
                                    });
                        }  
                    }
                }
            } 
    }//GEN-LAST:event_cbxCategoriasItemStateChanged

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void cbxQuantidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxQuantidadeItemStateChanged
        // TODO add your handling code here:7
        ProdutoDAO pdao = new ProdutoDAO();
        
        try {
            for(Produto p: pdao.read()){
                if(p.getNome().equals(txtNome.getText())){
                    double valorNum = ((int) cbxQuantidade.getSelectedItem()) * (p.getPreço() - (p.getPreço() * p.getDesconto() / 100));
                    String valor = String.format("%.2f", valorNum);
                    txtValorTotal.setText("R$ " + valor);
                }

            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbxQuantidadeItemStateChanged

    private void cbxQuantidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxQuantidadeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxQuantidadeMouseReleased

    private void cbxQuantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxQuantidadeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxQuantidadeMouseClicked

    private void btnAdicionarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCarrinhoActionPerformed
        // TODO add your handling code here:
        ProdutoDAO pdao = new ProdutoDAO();
        try {
            for(Produto p: pdao.read()){
                if(p.getNome().equals(txtNome.getText())){ 
                   p.setQuantidade(p.getQuantidade() - ((int) cbxQuantidade.getSelectedItem()));
                   pdao.updateWithoutMessage(p);
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        
        Carrinho c = new Carrinho();
        CarrinhoDAO dao = new CarrinhoDAO();
        
        c.setNome(txtNome.getText());
        c.setQuantidade((int) cbxQuantidade.getSelectedItem());
        
        for(Produto p: pdao.read()){
            if(p.getNome().equals(txtNome.getText())){
                double valorComDesc = (p.getPreço() - (p.getPreço() * p.getDesconto() / 100));
                String preço = String.format("%.2f", valorComDesc);
                c.setPreço((p.getPreço() - (p.getPreço() * p.getDesconto() / 100)));
            }
        }
        
        dao.create(c);
        
        txtNome.setText("");
        txtPreço.setText("");
        txtValorTotal.setText(" ");
        readTable();
    }//GEN-LAST:event_btnAdicionarCarrinhoActionPerformed

    private void btnFinalizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCActionPerformed
        // TODO add your handling code here:
        new CarrinhoTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFinalizarCActionPerformed

    private void cbxCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriasActionPerformed

    private void lblRelatóriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatóriosMouseClicked
        // TODO add your handling code here:
        new RelatórioClienteTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRelatóriosMouseClicked


    
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
            java.util.logging.Logger.getLogger(ComprasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComprasTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnAdicionarCarrinho;
    private com.k33ptoo.components.KButton btnFinalizarC;
    private javax.swing.JComboBox cbxCategorias;
    private javax.swing.JComboBox cbxQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCarrinho;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblPreço;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblQuantidade1;
    private javax.swing.JLabel lblRelatórios;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel painelCategorias;
    private keeptoo.KGradientPanel painelGradiente;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreço;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
