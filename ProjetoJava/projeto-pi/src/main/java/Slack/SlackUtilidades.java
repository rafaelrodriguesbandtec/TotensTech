/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package Slack;
  
import Slack.SlackMessagem;
  import com.fasterxml.jackson.databind.ObjectMapper;
  import org.apache.http.client.methods.HttpPost;
  import org.apache.http.entity.StringEntity;
  import org.apache.http.impl.client.CloseableHttpClient;
  import org.apache.http.impl.client.HttpClients;
  
  import java.io.IOException;
  
  public class SlackUtilidades {
      private static String slackWebhookUrl = "https://hooks.slack.com/services/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";
  
      public static void sendMessage(SlackMessagem message) {
          CloseableHttpClient client = HttpClients.createDefault();
          HttpPost httpPost = new HttpPost(slackWebhookUrl);
  
          try {
              ObjectMapper objectMapper = new ObjectMapper();
              String json = objectMapper.writeValueAsString(message);
  
              StringEntity entity = new StringEntity(json);
              httpPost.setEntity(entity);
              httpPost.setHeader("Accept", "application/json");
              httpPost.setHeader("Content-type", "application/json");
  
              client.execute(httpPost);
              client.close();
          } catch (IOException e) {
             e.printStackTrace();
          }
      }
  }