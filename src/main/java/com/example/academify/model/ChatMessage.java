package com.example.academify.model;

import com.example.academify.common.MessageType;

public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public ChatMessage() {
    }

    public ChatMessage(MessageType type, String content, String sender) {
        this.type = type;
        this.content = content;
        this.sender = sender;
    }

    public static ChatMessageBuilder builder() {
        return new ChatMessageBuilder();
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public static class ChatMessageBuilder {
        private MessageType type;
        private String content;
        private String sender;

        public ChatMessageBuilder type(MessageType type) {
            this.type = type;
            return this;
        }

        public ChatMessageBuilder content(String content) {
            this.content = content;
            return this;
        }

        public ChatMessageBuilder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(type, content, sender);
        }
    }
}