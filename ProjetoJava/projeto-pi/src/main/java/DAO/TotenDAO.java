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

    public void cadastrarTotem(InformacaoTotem t, String fk){
        
        Connection con = ConexaoDados.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO Totens(Fabricante,Modelo,Memoria,"
                    + "CpuToten,EspacoEmDisco,SerialNumber,fkEmpresa)"
                    + "VALUES(?,?,?,?,?,?,?)");
            
            stmt.setString(1,t.getMarcaTotem());
            
            stmt.setString(2,t.getModeloTotem());
            
            stmt.setString(3,t.memoriaTotalS());
            
            stmt.setString(4,t.getNomeCpu());
            
            stmt.setString(5,t.getDiscoEspacoTotalString());
            
            stmt.setString(6,t.getSerialToten());
            
            stmt.setString(7,fk);
            
            stmt.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            
        }finally{
            ConexaoDados.closeConnection(con, stmt);
            JOptionPane.showMessageDialog(null, "Vimos que você entrou em um totem novo, já cadastramos ele automaticamente!");
            
        }
    }
    
    Totens toten = new Totens();
    
    public void alterarStatus(String status, String fkEmpresa, String serialNumber){
    
        Connection con = ConexaoDados.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Totens SET Estado = ? WHERE fkEmpresa = ? and SerialNumber = ?");
            stmt.setString(1, status);
            stmt.setString(2, fkEmpresa);
            stmt.setString(3, serialNumber);
            
            stmt.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            
        }
    
    }
    
}
