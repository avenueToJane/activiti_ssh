package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_hi_attachment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_              ;
	private Integer REV_             ;
	private String USER_ID_         ;
	private String NAME_            ;
	private String DESCRIPTION_     ;
	private String TYPE_            ;
	private String TASK_ID_         ;
	private String PROC_INST_ID_    ;
	private String URL_             ;
	private String CONTENT_ID_      ;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public Integer getREV_() {
		return REV_;
	}
	public void setREV_(Integer rEV_) {
		REV_ = rEV_;
	}
	public String getUSER_ID_() {
		return USER_ID_;
	}
	public void setUSER_ID_(String uSER_ID_) {
		USER_ID_ = uSER_ID_;
	}
	public String getNAME_() {
		return NAME_;
	}
	public void setNAME_(String nAME_) {
		NAME_ = nAME_;
	}
	public String getDESCRIPTION_() {
		return DESCRIPTION_;
	}
	public void setDESCRIPTION_(String dESCRIPTION_) {
		DESCRIPTION_ = dESCRIPTION_;
	}
	public String getTYPE_() {
		return TYPE_;
	}
	public void setTYPE_(String tYPE_) {
		TYPE_ = tYPE_;
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
	public String getURL_() {
		return URL_;
	}
	public void setURL_(String uRL_) {
		URL_ = uRL_;
	}
	public String getCONTENT_ID_() {
		return CONTENT_ID_;
	}
	public void setCONTENT_ID_(String cONTENT_ID_) {
		CONTENT_ID_ = cONTENT_ID_;
	}
	@Override
	public String toString() {
		return "Act_hi_attachment [ID_=" + ID_ + ", REV_=" + REV_ + ", USER_ID_=" + USER_ID_ + ", NAME_=" + NAME_
				+ ", DESCRIPTION_=" + DESCRIPTION_ + ", TYPE_=" + TYPE_ + ", TASK_ID_=" + TASK_ID_ + ", PROC_INST_ID_="
				+ PROC_INST_ID_ + ", URL_=" + URL_ + ", CONTENT_ID_=" + CONTENT_ID_ + "]";
	}
	
	


}
