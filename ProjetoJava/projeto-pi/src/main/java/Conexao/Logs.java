package Conexao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Italo
 */
public class Logs {
    
    public void gravarLog(String error, String sistema){
        
        try {
        //Criando o arquivo de log
        File acesso = new File("C:\\Users\\Italo\\desktop\\TotensTech_Logs.txt");            
        FileWriter arquivo = new FileWriter(acesso);

        acesso.setReadable(true);
        acesso.setWritable(true);
               
        //Data atual do computador
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        
        String registro = String.format("%s  ||  %s  ||  %s", dateFormat.format(date), sistema, error);
        
        arquivo.append(registro);
        
        arquivo.flush();
        arquivo.close();
        
        } catch (IOException e) {
            System.out.println("Erro desconhecido, entre em contato com a central de atendimento. "+ e);
        }
        
    }
}
