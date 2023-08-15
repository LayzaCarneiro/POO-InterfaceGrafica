package model.dao;

import connection.ConnectionFactory;
import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    public boolean checkLogin(String nome, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
             
        
        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE nome = ? and senha = ?");
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
    
    public void create(Cliente c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO clientes (nome, senha, cpf, idade) VALUES (?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getCPF());
            stmt.setInt( 4, c.getIdade());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao criar conta " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Cliente> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM clientes");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setSenha(rs.getString("senha"));
                c.setCPF(rs.getString("cpf"));
                c.setIdade(rs.getInt("idade"));
                clientes.add(c);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
    }
    
    
    public void update(Cliente c) {
       
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE clientes SET nome = ?, senha = ?, cpf = ?, idade = ? WHERE id = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSenha());
            stmt.setString(3, c.getCPF());
            stmt.setInt(4, c.getIdade());
            stmt.setInt(5, c.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
