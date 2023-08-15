package telas;

import entidades.Carrinho;
import entidades.Cliente;
import entidades.Compras;
import entidades.Login;
import entidades.Produto;
import java.awt.print.PrinterException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.dao.CarrinhoDAO;
import model.dao.ClienteDAO;
import model.dao.ComprasDAO;
import model.dao.LoginDAO;
import model.dao.ProdutoDAO;

public class Finalização extends javax.swing.JFrame {

    public Finalização() {
        initComponents();
        
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            lblUser.setText(l.getNome());
        }
        
        ProdutoDAO pdao = new ProdutoDAO();
        CarrinhoDAO dao = new CarrinhoDAO();
        
        txtRecibo.setText("    -----------------------------------------------------------------------------------------\n" +
"                                                               SUPERMERCADO \n" +
"    -----------------------------------------------------------------------------------------\n" +
"      QTD    |       PRODUTO       |         PREÇO (unidade)      |     DESCONTO      |     TOTAL\n" +
"    -----------------------------------------------------------------------------------------");
        
        for(Carrinho c: dao.read()){
            for(Produto p: pdao.read()){
                if(p.getNome().equals(c.getNome())){
                    if(p.getDesconto() > 0){
                        String preço = String.format("%.2f", (p.getPreço() - (p.getPreço()*p.getDesconto()/100)));
                        txtRecibo.append("\n       " + c.getQuantidade() + "               " + c.getNome() + "             R$ " + p.getPreço() + "                   R$ " +  preço  + "                       R$" + c.getValorFinal() );
                
                    } else{
                        txtRecibo.append("\n       " + c.getQuantidade() + "               " + c.getNome() + "             R$ " + p.getPreço() + "                   R$ 0,00     "  +  "                   R$" + c.getValorFinal() );

                    }
                }
            }
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGradiente = new keeptoo.KGradientPanel();
        lblSair = new javax.swing.JLabel();
        painelCategorias = new javax.swing.JPanel();
        lblObrigado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRecibo = new javax.swing.JTextArea();
        cbxPagamento = new javax.swing.JComboBox();
        lblFormaDePagamento = new javax.swing.JLabel();
        lblParcelas = new javax.swing.JLabel();
        cbxParcelas = new javax.swing.JComboBox();
        btnRecibo = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblRelatório = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        painelGradiente.setkEndColor(new java.awt.Color(255, 71, 0));
        painelGradiente.setkGradientFocus(400);
        painelGradiente.setkStartColor(new java.awt.Color(255, 189, 91));
        painelGradiente.setPreferredSize(new java.awt.Dimension(926, 578));
        painelGradiente.setVerifyInputWhenFocusTarget(false);

        lblSair.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        painelCategorias.setBackground(new java.awt.Color(255, 255, 255));

        lblObrigado.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblObrigado.setForeground(new java.awt.Color(255, 34, 5));
        lblObrigado.setText(", obrigado pela preferência!");

        txtRecibo.setEditable(false);
        txtRecibo.setColumns(20);
        txtRecibo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        txtRecibo.setRows(5);
        jScrollPane1.setViewportView(txtRecibo);

        cbxPagamento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        cbxPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Débito", "Crédito" }));
        cbxPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPagamentoItemStateChanged(evt);
            }
        });

        lblFormaDePagamento.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblFormaDePagamento.setForeground(new java.awt.Color(255, 34, 5));
        lblFormaDePagamento.setText("Forma de pagamento:");

        lblParcelas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblParcelas.setForeground(new java.awt.Color(255, 34, 5));
        lblParcelas.setText("Parcelas:");

        cbxParcelas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        cbxParcelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1x" }));
        cbxParcelas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxParcelasItemStateChanged(evt);
            }
        });

        btnRecibo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnRecibo.setForeground(new java.awt.Color(255, 34, 5));
        btnRecibo.setText("Finalizar compra");
        btnRecibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReciboMouseClicked(evt);
            }
        });
        btnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciboActionPerformed(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 34, 5));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("Olá");

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblParcelas)
                    .addComponent(lblFormaDePagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxPagamento, 0, 191, Short.MAX_VALUE)
                    .addComponent(cbxParcelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblObrigado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCategoriasLayout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        painelCategoriasLayout.setVerticalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblObrigado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFormaDePagamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParcelas))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoMINI_poo (2).png"))); // NOI18N

        lblPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(255, 255, 255));
        lblPerfil.setText("Perfil");
        lblPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerfilMouseClicked(evt);
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
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addComponent(lblPerfil)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelGradienteLayout.createSequentialGroup()
                        .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSair)
                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRelatório))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        painelGradienteLayout.setVerticalGroup(
            painelGradienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGradienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPerfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRelatório)
                .addGap(369, 369, 369)
                .addComponent(lblSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGradienteLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        LoginDAO ldao = new LoginDAO();
        for(Login l: ldao.read()){
            ldao.delete(l);
        }
        
        new LoginTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void cbxPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPagamentoItemStateChanged
        // TODO add your handling code here:
        CarrinhoDAO dao = new CarrinhoDAO();
        double valorFinal = 0;
        cbxParcelas.removeAllItems();
        
        for(Carrinho c: dao.read()){
            valorFinal += c.getValorFinal();
        }
        
        cbxParcelas.addItem("1x");
        if(((String) cbxPagamento.getSelectedItem()).equals("Crédito")){
            if(valorFinal >= 90){
                cbxParcelas.addItem("2x");
                cbxParcelas.addItem("3x");
            }
            else if(valorFinal >= 50){
                cbxParcelas.addItem("2x");
            }
        }
    }//GEN-LAST:event_cbxPagamentoItemStateChanged

    private void cbxParcelasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxParcelasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxParcelasItemStateChanged

    private void btnReciboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReciboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReciboMouseClicked

    private void btnReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciboActionPerformed
        // TODO add your handling code here
        Compras com = new Compras();
        ComprasDAO comdao = new ComprasDAO();
        ClienteDAO cdao = new ClienteDAO();
        
        CarrinhoDAO dao = new CarrinhoDAO();
        double valorFinal = 0;
        for(Carrinho c: dao.read()){
            valorFinal += c.getValorFinal();
        }
        
        com.setNome(lblUser.getText());
        try{
            for(Cliente c: cdao.read()){
                if(lblUser.getText().equals(c.getNome())){
                    com.setCPF(c.getCPF());
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        
        com.setValor(valorFinal);
        
        LocalDate myObj = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = myObj.format(myFormatObj);
        
        com.setDia(formattedDate);
        comdao.create(com);
        
        double valorParcelado = valorFinal;
        
        if(cbxParcelas.getSelectedItem().toString().equals("2x")){
            valorParcelado = valorFinal / 2;
        } else if (cbxParcelas.getSelectedItem().toString().equals("3x")) {
            valorParcelado = valorFinal / 3;
        }
        
        txtRecibo.append("\n\n\n\n\n   -----------------------------------------------------------------------------------------" + "\n                                                TOTAL A SER PAGO:  R$ " + valorFinal + "\n   -----------------------------------------------------------------------------------------\n" + "   " + cbxPagamento.getSelectedItem().toString().toUpperCase() +  "                                                                                                  " + cbxParcelas.getSelectedItem().toString() + "  R$ " + valorParcelado);
        txtRecibo.append("\n\n\n                                                          OBRIGADO,  FELIZ ANO NOVO! ");
    
        try {
            Thread.sleep(1000);
            txtRecibo.print();
        } catch (InterruptedException | PrinterException ex) {
            Logger.getLogger(Finalização.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        for(Carrinho c: dao.read()){
            dao.deleteWithoutMessage(c);
        }
        
        
    }//GEN-LAST:event_btnReciboActionPerformed

    private void lblPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerfilMouseClicked
        // TODO add your handling code here:
        new ClientePerfil().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPerfilMouseClicked

    private void lblRelatórioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRelatórioMouseClicked
        // TODO add your handling code here:
        new RelatórioClienteTela().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRelatórioMouseClicked

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
            java.util.logging.Logger.getLogger(Finalização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finalização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finalização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finalização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finalização().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecibo;
    private javax.swing.JComboBox cbxPagamento;
    private javax.swing.JComboBox cbxParcelas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFormaDePagamento;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblObrigado;
    private javax.swing.JLabel lblParcelas;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblRelatório;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel painelCategorias;
    private keeptoo.KGradientPanel painelGradiente;
    private javax.swing.JTextArea txtRecibo;
    // End of variables declaration//GEN-END:variables
}
