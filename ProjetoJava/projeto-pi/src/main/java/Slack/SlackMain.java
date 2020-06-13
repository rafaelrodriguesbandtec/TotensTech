/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slack;

  
  public class SlackMain {
    public static void main(String[] args) {
      SlackMessagem slackMessage = SlackMessagem.builder()
        .channel("#avisos")
        .username("TotensTech")
        .text("Teste meu lindo")
        .icon_emoji(":twice:")
        .build();
      SlackUtilidades.sendMessage(slackMessage);
    }
  }
