/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slack;

import Model.InformacaoTotem;
import Conexao.Logs;
import java.util.Timer;
import java.util.TimerTask;
  
  public class SlackMain {
      
     
      
      public static void registrarSlack(Logs log) {
          
          SlackUtilidades s = new SlackUtilidades();
          
          InformacaoTotem c = new InformacaoTotem();
          
          
          Double cpu= c.getCpu();
          Double ram = c.getMemoria();
          Double disco = c.getPorcentagemUsadaDisco();
          
          if (cpu == 0.0) {
              s.sendMessage("");
          }
          
          
          
          
          if (cpu >= 70.0 && cpu < 90) {
              
                s.sendMessage(":heavy_exclamation_mark: O cpu da maquina "+ c.getModeloTotem() +" está com o uso bem alto, "+cpu.intValue()+"%, :heavy_exclamation_mark: ");
          }else if (cpu >= 90) {
                s.sendMessage(":fire: :fire: ATENÇÃO, uso muito alto da sua cpu, modelo: "+ c.getModeloTotem() +"  está, "+cpu.intValue()+"%, :fire: :fire: ");
          }
           
          
          if (ram >= 70.00 && ram < 90) {
               s.sendMessage(":heavy_exclamation_mark: A Ram da maquina "+ c.getModeloTotem() +" está com o uso bem alto, "+ram.intValue()+"%, :heavy_exclamation_mark: ");
          }else if (ram >= 90) {
               s.sendMessage(":fire: :fire:  ATENÇÃO, uso muito alto da sua RAM modelo: "+ c.getModeloTotem() +"  está, "+ram.intValue()+"%, :fire: :fire: ");
              
          }
          
           if (disco >= 70.00 && disco <90) {
               s.sendMessage(":heavy_exclamation_mark: O disco da maquina "+ c.getModeloTotem() +" está com o uso bem alto, "+disco.intValue()+"%, :heavy_exclamation_mark: ");
           }else if (disco >= 90) {
               s.sendMessage(":fire: :fire:  ATENÇÃO, uso muito alto do seu Disco modelo: "+ c.getModeloTotem() +"  está, "+disco.intValue()+"%, :fire: :fire: ");
            
          }
     
          //s.sendMessage("cpu atual da cpu do "+ c.getModeloTotem() +" está em "+cpu.intValue()+"%, :sunglasses: ");
         // s.sendMessage("cpu atual da ram do "+ c.getModeloTotem() +" está em "+ram.intValue()+"%, :sunglasses: ");
         // s.sendMessage("cpu atual da disco do "+ c.getModeloTotem() +" está em "+disco.intValue()+"%, :sunglasses: ");
      }
  }
