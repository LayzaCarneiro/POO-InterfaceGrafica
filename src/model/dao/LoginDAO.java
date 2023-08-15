package model.dao;

import connection.ConnectionFactory;
import entidades.Login;
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
public class LoginDAO {
    public void create(Login l) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO login (nome, senha, cpf) VALUES (?, ?, ?)");
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getSenha());
            stmt.setString(3, l.getCPF());
            
            stmt.executeUpdate();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao logar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Login> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Login> login = new ArrayList<Login>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM login");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Login l = new Login();
                
                l.setNome(rs.getString("nome"));
                l.setSenha(rs.getString("senha"));
                l.setCPF(rs.getString("cpf"));
                login.add(l);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return login;
    }
    
    public void update(Login l) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET nome = ?, senha = ? WHERE cpf = ?");
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getSenha());
             stmt.setString(3, l.getCPF());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
     public void delete(Login l) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM login WHERE nome = ?");
            stmt.setString(1, l.getNome());
            
            stmt.executeUpdate();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
