package com.wushuangtech.gamelive.websocket.data;

/**
 * @author Muyangmin
 * @since 1.0.0
 */
public class WsRequest {
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    //Empty
    private String messageType;
}
