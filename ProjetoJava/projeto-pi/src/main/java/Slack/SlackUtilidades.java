/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Slack;
  

import Conexao.Logs;
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;
  
  public class SlackUtilidades {
     
    private SlackApi api = new SlackApi("https://hooks.slack.com/services/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");
                                        
    
      void sendMessage(String message){
           Logs log = new Logs();
          
        try {
            api.call(new SlackMessage("TotensTech avisa: "+message));
            
        }catch (Exception Err){
            
            log.gravarLog(Err.toString() , "Erro ao enviar mensagem para Slack:");
            
        }
        
    }}
  