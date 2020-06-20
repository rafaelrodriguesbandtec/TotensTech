package DAO;

import Conexao.ConexaoDados;
import Model.InformacaoTotem;
import Model.Totens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class LeituraDAO {
    
    public void lerDados(InformacaoTotem t, Integer fk){
        
        Connection con = ConexaoDados.getConnection();
        PreparedStatement stmt = null;
        
                Date data = new Date();
                SimpleDateFormat formatar = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                String dataFormatada = formatar.format(data);
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO Leitura"
                    + "(DataHora,LeituraMemoria,LeituraDisco,LeituraCpu,TemperaturaCpu,fkToten)"
                    + "VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1,dataFormatada);
            
            stmt.setDouble(2,t.getMemoria());
            
            stmt.setDouble(3,t.getPorcentagemDisponivelDisco());
            
            stmt.setDouble(4,t.getCpu());
            
            stmt.setInt(5,t.getTemperatura());
            
            stmt.setInt(6,fk);
           
            stmt.executeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
            
        }
    }
    
}
   

