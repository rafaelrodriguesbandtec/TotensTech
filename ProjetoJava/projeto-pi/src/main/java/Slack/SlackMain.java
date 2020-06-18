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
      
     
      
      public static void main(String[] args) {
        Logs log = new Logs();
          
          SlackUtilidades s=new SlackUtilidades();
          
          InformacaoTotem c = new InformacaoTotem();
          
          
          Double cpu= c.getCpu();
          Double ram = c.getMemoria();
          Double disco = c.getPorcentagemUsadaDisco();
          
          if (cpu == 0.0) {
              s.sendMessage("");
          }
          
          
          
          
          if (cpu >= 80.0) {
                s.sendMessage(":heavy_exclamation_mark: Seu cpu está com o uso bem alto, "+cpu.intValue()+"%, :heavy_exclamation_mark: ");
          } if (cpu >= 90) {
                s.sendMessage(":fire: :fire: ATENÇÃO, uso muito alto da sua cpu mano, "+cpu.intValue()+"%, :fire: :fire: ");
          }
           
          
          if (ram >= 80.00) {
               s.sendMessage(":heavy_exclamation_mark: Sua RAM está com o uso bem alto, "+ram.intValue()+"%, :heavy_exclamation_mark: ");
          } if (ram >= 90) {
               s.sendMessage(":fire: :fire:  ATENÇÃO, uso muito alto da sua RAM mano, "+ram.intValue()+"%, :fire: :fire: ");
              
          }
          
           if (disco >= 80.00) {
               s.sendMessage(":heavy_exclamation_mark: Sua RAM está com o uso bem alto, "+disco.intValue()+"%, :heavy_exclamation_mark: ");
           } if (disco >= 90) {
               s.sendMessage(":fire: :fire:  ATENÇÃO, uso muito alto da sua RAM mano, "+disco.intValue()+"%, :fire: :fire: ");
            
          }
     
          //s.sendMessage("cpu atual da cpu do "+ c.getModeloTotem() +" está em "+cpu.intValue()+"%, :sunglasses: ");
         // s.sendMessage("cpu atual da ram do "+ c.getModeloTotem() +" está em "+ram.intValue()+"%, :sunglasses: ");
         // s.sendMessage("cpu atual da disco do "+ c.getModeloTotem() +" está em "+disco.intValue()+"%, :sunglasses: ");
      }
  }
