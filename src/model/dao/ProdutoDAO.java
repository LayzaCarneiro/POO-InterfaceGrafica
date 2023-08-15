package model.dao;

import connection.ConnectionFactory;
import entidades.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProdutoDAO {
    public void create(Produto p) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO produtos (nome, quantidade, preço, desconto, categoria) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreço());
            stmt.setInt(4, p.getDesconto());
            stmt.setString(5, p.getCategoria());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto" + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public ArrayList<Produto> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreço(rs.getDouble("preço"));
                p.setDesconto(rs.getInt("desconto"));
                p.setCategoria(rs.getString("categoria"));
                produtos.add(p);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
    public void update(Produto p) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET nome = ?, quantidade = ?, preço = ?, desconto = ?, categoria = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreço());
            stmt.setInt(4, p.getDesconto());
            stmt.setString(5, p.getCategoria());
            stmt.setInt(6, p.getId());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void updateWithoutMessage(Produto p) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET nome = ?, quantidade = ?, preço = ?, desconto = ?, categoria = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setInt(2, p.getQuantidade());
            stmt.setDouble(3, p.getPreço());
            stmt.setInt(4, p.getDesconto());
            stmt.setString(5, p.getCategoria());
            stmt.setInt(6, p.getId());
            
            
            stmt.executeUpdate();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar na tabela produtos" + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Produto p) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE id = ?");
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteWithoutMessage(Produto p) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE id = ?");
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir na tabela Produtos " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
