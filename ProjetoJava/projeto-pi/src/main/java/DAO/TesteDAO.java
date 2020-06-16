
package DAO;

import Conexao.ConexaoDados;
import Model.InformacaoTotem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TesteDAO {

    
    public static void main(String[] args){
    
     TotenDAO dao =  new TotenDAO();
        LeituraDAO l = new LeituraDAO();
        InformacaoTotem t=new InformacaoTotem();
        
        l.lerDados(t);
    }
    
}
