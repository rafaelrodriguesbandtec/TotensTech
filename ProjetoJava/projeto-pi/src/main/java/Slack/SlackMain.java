/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slack;

import Model.InformacaoTotem;

  
  public class SlackMain {
      public static void main(String[] args) {
          SlackUtilidades s=new SlackUtilidades();
          InformacaoTotem t= new InformacaoTotem();
          Double cpu= t.getCpu();
          s.sendMessage("cpu com uso elevado"+cpu.intValue()+"%");
      }
  }
