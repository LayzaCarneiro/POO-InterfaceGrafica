package model.dao;


import connection.ConnectionFactory;
import entidades.Admin;
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
public class AdminDAO {
     public boolean checkAdm(String nome, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
             
        try {
            stmt = con.prepareStatement("SELECT * FROM administradores WHERE nome = ? and senha = ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao entrar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
     public void create(Admin a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO administradores (nome, senha, cpf) VALUES (?, ?, ?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getSenha());
            stmt.setString(3, a.getCPF());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao criar conta " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
     public ArrayList<Admin> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Admin> admins = new ArrayList<Admin>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM administradores");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Admin a = new Admin();
                
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setSenha(rs.getString("senha"));
                a.setCPF(rs.getString("cpf"));
                admins.add(a);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return admins;
    }
     
     public void update(Admin a) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE administradores SET nome = ?, senha = ? WHERE id = ?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getSenha());
            stmt.setInt(3, a.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
