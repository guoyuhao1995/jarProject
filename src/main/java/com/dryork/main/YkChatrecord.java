package com.dryork.main;

import java.util.Date;

public class YkChatrecord extends DBRecord {
    
    private Long id;

    
    private Long chatId;

    
    private Date createTime;

    
    private Integer msgType;

    
    private String content;

    
    private Integer senderType;

    
    private Long senderId;

    
    private Integer status;

    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public Long getChatId() {
        return chatId;
    }

    
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    
    public Date getCreateTime() {
        return createTime;
    }

    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    
    public Integer getMsgType() {
        return msgType;
    }

    
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    
    public String getContent() {
        return content;
    }

    
    public void setContent(String content) {
        this.content = content;
    }

    
    public Integer getSenderType() {
        return senderType;
    }

    
    public void setSenderType(Integer senderType) {
        this.senderType = senderType;
    }

    
    public Long getSenderId() {
        return senderId;
    }

    
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    
    public Integer getStatus() {
        return status;
    }

    
    public void setStatus(Integer status) {
        this.status = status;
    }
}