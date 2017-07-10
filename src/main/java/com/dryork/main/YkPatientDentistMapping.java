package com.dryork.main;

import java.util.Date;

public class YkPatientDentistMapping extends DBRecord {

	private Long id;

	private Long dentistId;

	private Long userId;

	private String backName;

	private Date createDate;

	private Integer tmpqrcode;

	private String remark;

	private Long assisId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDentistId() {
		return dentistId;
	}

	public void setDentistId(Long dentistId) {
		this.dentistId = dentistId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getBackName() {
		return backName;
	}

	public void setBackName(String backName) {
		this.backName = backName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getTmpqrcode() {
		return tmpqrcode;
	}

	public void setTmpqrcode(Integer tmpqrcode) {
		this.tmpqrcode = tmpqrcode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getAssisId() {
		return assisId;
	}

	public void setAssisId(Long assisId) {
		this.assisId = assisId;
	}
}