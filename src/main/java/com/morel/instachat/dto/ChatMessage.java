/**
 */
package com.morel.instachat.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    
    private String from;
    private String text;
    private String recipient;
    private String time;


    
    public ChatMessage(String from, String text, String recipient) {

        this.from = from;
        this.text = text;
        this.recipient = recipient;  
    }
}
