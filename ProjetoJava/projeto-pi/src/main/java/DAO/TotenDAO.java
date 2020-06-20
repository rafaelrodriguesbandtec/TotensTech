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
    
    public void carregarTotem(){
    
        Connection con = ConexaoDados.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("SELECT * FROM  ");
            
            
            stmt.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            
        }finally{
            ConexaoDados.closeConnection(con, stmt);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        }
    
        
        InformacaoTotem t = new InformacaoTotem();
        toten.setModelo(t.getModeloTotem());
        toten.setFabricante(t.getMarcaTotem());
        toten.setCpuTotem(t.getNomeCpu());
        toten.setEspacoEmDisco(t.getDiscoEspacoTotalString());
        toten.setMemoria(t.memoriaTotalS());
        toten.setSerialNumber(t.getSerialToten());
        
        
    
    }
    
}
