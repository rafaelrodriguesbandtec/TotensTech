package Controller;
import DAO.LeituraDAO;
import DAO.TotenDAO;
import Model.Empresa;
import Model.InformacaoTotem;
import Model.Totens;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Italo
 */
public class Leitura{
   public static void main(String[] args){
   
        InformacaoTotem totem = new InformacaoTotem();
        TotenDAO dao =  new TotenDAO();
        LeituraDAO leiDAO = new LeituraDAO();
        
        while(true){
            
            dao.cadastrarTotem(totem);
        
        }
   
   }
   
}
