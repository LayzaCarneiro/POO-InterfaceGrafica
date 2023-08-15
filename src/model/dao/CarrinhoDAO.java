package model.dao;

import connection.ConnectionFactory;
import entidades.Carrinho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Layza
 */
public class CarrinhoDAO {
    public void create(Carrinho c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO carrinho (nome, preço, quantidade, valorFinal) VALUES (?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setDouble(2, c.getPreço());
            stmt.setInt( 3, c.getQuantidade());
            stmt.setDouble(4, c.getValorFinal());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho.");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao adicionars produto" + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Carrinho> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Carrinho> produtos = new ArrayList<Carrinho>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM carrinho");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Carrinho c = new Carrinho();
                
                c.setNome(rs.getString("nome"));
                c.setQuantidade(rs.getInt("quantidade"));
                c.setPreço(rs.getDouble("preço"));
                c.setValorFinal(rs.getDouble("valorFinal"));
                produtos.add(c);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
        
    }
    
    public void delete(Carrinho c) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM carrinho WHERE nome = ?");
            stmt.setString(1, c.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteWithoutMessage(Carrinho c) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM carrinho WHERE nome = ?");
            stmt.setString(1, c.getNome());
            
            stmt.executeUpdate();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro" + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
