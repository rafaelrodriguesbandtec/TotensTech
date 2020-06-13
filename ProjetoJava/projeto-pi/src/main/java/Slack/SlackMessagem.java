/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slack;
import lombok.*;
import java.io.Serializable;


@Builder(builderClassName = "Builder")
/**
 *
 * @author kelvi_000
 */
public class SlackMessagem implements Serializable {
 
    private String username;
    private String text;
    private String icon_emoji;
    private String channel;
  }
