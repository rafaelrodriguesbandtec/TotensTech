/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import com.pengrad.telegrambot.TelegramBot;


/**
 *
 * @author Rafael
 */
class Telegram {
    private final TelegramBot api;

    public Telegram(TelegramBot api) {
        this.api = new TelegramBot("BOT-TOKEN");
      
    }  
    
}

