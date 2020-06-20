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
    private static final String HOSTNAME =  "svrtotenstech.database.windows.net";
    private static final String DBNAME =  "bdTotensTech";
    private static final String USER = "localadmin";
    private static final String PASS = "#Gfgrupo5b";
    private static final String URL = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30", HOSTNAME, DBNAME, USER, PASS);
    
    
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