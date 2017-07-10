package com.dryork.main;

import java.util.Date;

public class YkUserext extends DBRecord {
	private static final long serialVersionUID = 5620113622844932435L;

	private Long id;
    
    private Long parentId;

    private Integer isGroup;
    
    private Long wxuid;

    
    private String cookie;

    
    private String ykuserName;

    
    private String userSex;

    
    private Date birthday;

    
    private String mobile;

    
    private Date createDate;

    
    private Date lastappointDate;

    
    private String remark;

    
    private Integer level;

    
    private Long defautDid;
    
    private Long pubId;
    
    private Integer patFrom;
    
    private Integer age;
    
	/**
	 * 接收批量导入患者的姓名
	 */
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPatFrom() {
		return patFrom;
	}

	public void setPatFrom(Integer patFrom) {
		this.patFrom = patFrom;
	}

	public Long getPubId() {
        return pubId;
    }

    public void setPubId(Long pubId) {
        this.pubId = pubId;
    }


	public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    
    public Long getWxuid() {
        return wxuid;
    }

    
    public void setWxuid(Long wxuid) {
        this.wxuid = wxuid;
    }

    
    public String getCookie() {
        return cookie;
    }

    
    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    
    public String getYkuserName() {
        return ykuserName;
    }

    
    public void setYkuserName(String ykuserName) {
        this.ykuserName = ykuserName;
    }

    
    public String getUserSex() {
        return userSex;
    }

    
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    
    public Date getBirthday() {
        return birthday;
    }

    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    public String getMobile() {
        return mobile;
    }

    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    public Date getCreateDate() {
        return createDate;
    }

    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    public Date getLastappointDate() {
        return lastappointDate;
    }

    
    public void setLastappointDate(Date lastappointDate) {
        this.lastappointDate = lastappointDate;
    }

    
    public String getRemark() {
        return remark;
    }

    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    
    public Integer getLevel() {
        return level;
    }

    
    public void setLevel(Integer level) {
        this.level = level;
    }

    
    public Long getDefautDid() {
        return defautDid;
    }

    public void setDefautDid(Long defautDid) {
        this.defautDid = defautDid;
    }

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getIsGroup() {
		return isGroup;
	}
	
	public void setIsGroup(Integer isGroup) {
		this.isGroup = isGroup;
	}
	
	
}