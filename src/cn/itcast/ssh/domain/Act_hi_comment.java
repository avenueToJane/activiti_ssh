package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_hi_comment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_               ;
	private String TYPE_             ;
	private Date TIME_             ;
	private String USER_ID_          ;
	private String TASK_ID_          ;
	private String PROC_INST_ID_     ;
	private String ACTION_           ;
	private String MESSAGE_          ;
	private Blob FULL_MSG_         ;
	
	public String getID_() {
		return ID_;
	}

	public void setID_(String iD_) {
		ID_ = iD_;
	}

	public String getTYPE_() {
		return TYPE_;
	}

	public void setTYPE_(String tYPE_) {
		TYPE_ = tYPE_;
	}

	public Date getTIME_() {
		return TIME_;
	}

	public void setTIME_(Date tIME_) {
		TIME_ = tIME_;
	}

	public String getUSER_ID_() {
		return USER_ID_;
	}

	public void setUSER_ID_(String uSER_ID_) {
		USER_ID_ = uSER_ID_;
	}

	public String getTASK_ID_() {
		return TASK_ID_;
	}

	public void setTASK_ID_(String tASK_ID_) {
		TASK_ID_ = tASK_ID_;
	}

	public String getPROC_INST_ID_() {
		return PROC_INST_ID_;
	}

	public void setPROC_INST_ID_(String pROC_INST_ID_) {
		PROC_INST_ID_ = pROC_INST_ID_;
	}

	public String getACTION_() {
		return ACTION_;
	}

	public void setACTION_(String aCTION_) {
		ACTION_ = aCTION_;
	}

	public String getMESSAGE_() {
		return MESSAGE_;
	}

	public void setMESSAGE_(String mESSAGE_) {
		MESSAGE_ = mESSAGE_;
	}

	public Blob getFULL_MSG_() {
		return FULL_MSG_;
	}

	public void setFULL_MSG_(Blob fULL_MSG_) {
		FULL_MSG_ = fULL_MSG_;
	}

	@Override
	public String toString() {
		return "Act_hi_comment [ID_=" + ID_ + ", TYPE_=" + TYPE_ + ", TIME_=" + TIME_ + ", USER_ID_=" + USER_ID_
				+ ", TASK_ID_=" + TASK_ID_ + ", PROC_INST_ID_=" + PROC_INST_ID_ + ", ACTION_=" + ACTION_ + ", MESSAGE_="
				+ MESSAGE_ + ", FULL_MSG_=" + FULL_MSG_ + "]";
	}
	

}
