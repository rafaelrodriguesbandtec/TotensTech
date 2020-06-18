/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Slack;
  

import java.util.logging.Level;
import java.util.logging.Logger;
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;
  
  public class SlackUtilidades {
     
    private SlackApi api = new SlackApi("https://hooks.slack.com/services/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");

      SlackUtilidades() {
          
      }
    
      
      
      void sendMessage(String message){
        try {
            api.call(new SlackMessage("TotensTech avisa: "+message));
        } catch (Exception e) {
            Logger.getAnonymousLogger().log(
                    Level.SEVERE,
                    "Erro ao enviar mensagem para Slack: {}",
                    e);
        }
    }}
  