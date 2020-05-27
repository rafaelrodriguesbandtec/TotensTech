package Conexao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Italo
 */
public class Logs {
    private ArrayList <String> registro = new ArrayList();
    public void gravarLog(String error, String sistema){
        
        //Data atual do computador
        DateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat nomearArquivo = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        
        try {
        //Criando o arquivo de log
        File acesso = new File("C:\\Users\\Italo\\desktop\\"+nomearArquivo.format(date)+"_TotensTech_Logs.txt");
        FileWriter arquivo = new FileWriter(acesso);
        
        acesso.setReadable(true);
        acesso.setWritable(true);
               
       
        
        registro.add(String.format("%s  ||  %s  ||  %s \n", dataAtual.format(date), sistema, error));
        
        for(String contador : registro){
            System.out.println(contador);
            arquivo.append(contador);
        }
        
        arquivo.flush();
        arquivo.close();
        
        } catch (IOException e) {
            System.out.println("Erro desconhecido, entre em contato com a central de atendimento. \nCodigo do erro: "+ e);
        }
        
    }
}
