
package model.dao;

import connection.ConnectionFactory;
import entidades.RelatórioCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RelatórioClienteDAO {
        public void create(RelatórioCliente rc) {

            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            try {
                stmt = con.prepareStatement("INSERT INTO relatorioCliente (cliente, valorTotal) VALUES (?, ?)");
                stmt.setString(1, rc.getCliente());
                stmt.setDouble(2, rc.getValorTotal());

                stmt.executeUpdate();

            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Erro" + e); 
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
        }


        public ArrayList<RelatórioCliente> read(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            ArrayList<RelatórioCliente> relatorioCliente = new ArrayList<RelatórioCliente>();

            try {
                stmt = con.prepareStatement("SELECT * FROM relatorioCliente ORDER BY valorTotal DESC");
                rs = stmt.executeQuery();

                while(rs.next()){
                    RelatórioCliente rc = new RelatórioCliente();
                    rc.setCliente(rs.getString("cliente"));
                    rc.setValorTotal(rs.getDouble("valorTotal"));
                    relatorioCliente.add(rc);
                }

            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Erro  " + e); 
            } finally {
                ConnectionFactory.closeConnection(con, stmt, rs);
            }

            return relatorioCliente;
        }
        
        public void delete(RelatórioCliente rc) {
       
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("DELETE FROM relatorioCliente WHERE cliente = ?");
                stmt.setString(1, rc.getCliente());

                stmt.executeUpdate();

            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Erro " + e); 
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }
    }
    }
