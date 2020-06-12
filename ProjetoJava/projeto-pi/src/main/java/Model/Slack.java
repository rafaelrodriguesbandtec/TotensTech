/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Rafael
 */
import net.gpedro.integrations.slack.SlackApi;
import net.gpedro.integrations.slack.SlackMessage;

import java.util.logging.Level;
import java.util.logging.Logger;

class Slack {
    private SlackApi apiSlack = new SlackApi("");
    Slack() {
    }
    
    void sendMessage(String message){
        try {
            apiSlack.call(new SlackMessage(message));
        } catch (Exception e) {
            Logger.getAnonymousLogger().log(
                    Level.SEVERE,
                    "Erro ao enviar mensagem",
                    e);
        }
    }
}
