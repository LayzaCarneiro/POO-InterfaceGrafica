package model.dao;

import connection.ConnectionFactory;
import entidades.Compras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ComprasDAO {
    public void create(Compras c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO compras (nome, cpf, dia, valor) VALUES (?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCPF());
            stmt.setString(3, c.getDia());
            stmt.setDouble(4, c.getValor());
            
            stmt.executeUpdate();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<Compras> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<Compras> compras = new ArrayList<Compras>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM compras");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Compras com = new Compras();
                
                com.setNome(rs.getString("nome"));
                com.setCPF(rs.getString("cpf"));
                com.setDia(rs.getString("dia"));
                com.setValor(rs.getDouble("valor"));
                
                compras.add(com);
            }
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro  " + e); 
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return compras;
    }
}
