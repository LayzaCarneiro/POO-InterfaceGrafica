package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/supermercado";
    private static final String USER = "root";
    private static final String PASS = "password";
    
    public static Connection getConnection() {
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException("Erro na conexão.", e);
        } 
    }
    
    public static void closeConnection(Connection con){
        try {
            if(con != null){
            con.close();
            }
        } catch(SQLException e){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        
        closeConnection(con);
        
        try {
            if(stmt != null){
                stmt.close();
            }
        } catch(SQLException e){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
        
        try {
            if(rs != null){
                rs.close();
            }
        } catch(SQLException e){
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}
