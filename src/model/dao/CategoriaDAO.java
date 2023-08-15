package model.dao;

import connection.ConnectionFactory;
import entidades.Categoria;
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
public class CategoriaDAO {
    
    public void create(Categoria c) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO categorias (nome) VALUES (?)");
            stmt.setString(1, c.getNome());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Categoria criada com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao criar categoria " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Categoria> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM categorias");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Categoria c = new Categoria();
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                
                categorias.add(c);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return categorias;
    }
    
    public void update(Categoria c) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE categorias SET nome = ? WHERE id = ?");
            stmt.setString(1, c.getNome());
            stmt.setInt(2, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Categoria c) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM categorias WHERE id = ?");
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
