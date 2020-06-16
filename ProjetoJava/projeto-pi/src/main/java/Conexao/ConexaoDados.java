package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConexaoDados {
    
    private static final String DRIVE = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://svrtotenstech.database.windows.net:1433";
    private static final String USER = "localadmin@svrtotenstech";
    private static final String PASS = "#Gfgrupo5b";
    
    //private static final String DRIVE = "com.mysql.cj.jdbc.Driver";
    //private static final String URL = "jdbc:mysql://localhost:3306/totenstech?useTimezone=true&serverTimezone=UTC";
    //private static final String USER = "root";
    //private static final String PASS = "Leonardo@123";
    
    
    public static Connection getConnection(){
    
        try {
            
            Class.forName(DRIVE);
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            
            throw new RuntimeException("Erro de conexão ", ex);
            
        }
   }
    
    //Tratativa para encerramento de conexao 
    public static void closeConnection(Connection con){
        
        try {
            if(con != null){
                con.close();
            }
    } catch (SQLException ex) {
            throw new RuntimeException("Ocorreu um erro ", ex);
        }
    
    }
    
    //Tratativa para encerramento do preparedStatement
     public static void closeConnection(Connection con, PreparedStatement stmt){
        
         closeConnection(con);
         
        try {
            if(stmt != null){
                stmt.close();
            }
    } catch (SQLException ex) {
        throw new RuntimeException("Ocorreu um erro", ex);
    }
    
    }
    
     //Tratativa para encerramento do ResultSet
     public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
         closeConnection(con, stmt);
         
        try {
            if(rs != null){
                rs.close();
            }
    } catch (SQLException ex) {
        throw new RuntimeException("Ocorreu um erro ", ex);
    }
    
    }
    
}