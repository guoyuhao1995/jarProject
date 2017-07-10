package com.dryork.main;

import java.util.Date;


public class YkChat extends DBRecord {
    
    private Long id;

    
    private Integer chatType;

    
    private Long uid1;

    
    private Integer uid1Type;

    
    private Long uid2;

    
    private Integer uid2Type;

    
    private Date createDate;

    
    private Integer allowReply;
    
    private Long fromDid;
    
    

    
    public Long getFromDid() {
		return fromDid;
	}


	public void setFromDid(Long fromDid) {
		this.fromDid = fromDid;
	}


	public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public Integer getChatType() {
        return chatType;
    }

    
    public void setChatType(Integer chatType) {
        this.chatType = chatType;
    }

    
    public Long getUid1() {
        return uid1;
    }

    
    public void setUid1(Long uid1) {
        this.uid1 = uid1;
    }

    
    public Integer getUid1Type() {
        return uid1Type;
    }

    
    public void setUid1Type(Integer uid1Type) {
        this.uid1Type = uid1Type;
    }

    
    public Long getUid2() {
        return uid2;
    }

    
    public void setUid2(Long uid2) {
        this.uid2 = uid2;
    }

    
    public Integer getUid2Type() {
        return uid2Type;
    }

    
    public void setUid2Type(Integer uid2Type) {
        this.uid2Type = uid2Type;
    }

    
    public Date getCreateDate() {
        return createDate;
    }

    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    public Integer getAllowReply() {
        return allowReply;
    }

    
    public void setAllowReply(Integer allowReply) {
        this.allowReply = allowReply;
    }
}