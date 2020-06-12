package DAO;

import Conexao.ConexaoDados;
import Model.InformacaoTotem;
import Model.Totens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TotenDAO {

    public void create(InformacaoTotem t){
        
        Connection con = ConexaoDados.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO toten(sistemaOperacional)VALUES(?)");
            stmt.setString(1,t.getSistemaOperacional());
            
            stmt.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            
        }finally{
            ConexaoDados.closeConnection(con, stmt);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        }
    }
    
}
