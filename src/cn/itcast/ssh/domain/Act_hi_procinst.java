package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_hi_procinst implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_                           ;
	private String PROC_INST_ID_                 ;
	private String BUSINESS_KEY_                 ;
	private String PROC_DEF_ID_                  ;
	private Date START_TIME_                   ;
	private Date END_TIME_                     ;
	private Integer DURATION_                     ;
	private String START_USER_ID_                ;
	private String START_ACT_ID_                 ;
	private String END_ACT_ID_                   ;
	private String SUPER_PROCESS_INSTANCE_ID_    ;
	private String DELETE_REASON_                ;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public String getPROC_INST_ID_() {
		return PROC_INST_ID_;
	}
	public void setPROC_INST_ID_(String pROC_INST_ID_) {
		PROC_INST_ID_ = pROC_INST_ID_;
	}
	public String getBUSINESS_KEY_() {
		return BUSINESS_KEY_;
	}
	public void setBUSINESS_KEY_(String bUSINESS_KEY_) {
		BUSINESS_KEY_ = bUSINESS_KEY_;
	}
	public String getPROC_DEF_ID_() {
		return PROC_DEF_ID_;
	}
	public void setPROC_DEF_ID_(String pROC_DEF_ID_) {
		PROC_DEF_ID_ = pROC_DEF_ID_;
	}
	public Date getSTART_TIME_() {
		return START_TIME_;
	}
	public void setSTART_TIME_(Date sTART_TIME_) {
		START_TIME_ = sTART_TIME_;
	}
	public Date getEND_TIME_() {
		return END_TIME_;
	}
	public void setEND_TIME_(Date eND_TIME_) {
		END_TIME_ = eND_TIME_;
	}
	public Integer getDURATION_() {
		return DURATION_;
	}
	public void setDURATION_(Integer dURATION_) {
		DURATION_ = dURATION_;
	}
	public String getSTART_USER_ID_() {
		return START_USER_ID_;
	}
	public void setSTART_USER_ID_(String sTART_USER_ID_) {
		START_USER_ID_ = sTART_USER_ID_;
	}
	public String getSTART_ACT_ID_() {
		return START_ACT_ID_;
	}
	public void setSTART_ACT_ID_(String sTART_ACT_ID_) {
		START_ACT_ID_ = sTART_ACT_ID_;
	}
	public String getEND_ACT_ID_() {
		return END_ACT_ID_;
	}
	public void setEND_ACT_ID_(String eND_ACT_ID_) {
		END_ACT_ID_ = eND_ACT_ID_;
	}
	public String getSUPER_PROCESS_INSTANCE_ID_() {
		return SUPER_PROCESS_INSTANCE_ID_;
	}
	public void setSUPER_PROCESS_INSTANCE_ID_(String sUPER_PROCESS_INSTANCE_ID_) {
		SUPER_PROCESS_INSTANCE_ID_ = sUPER_PROCESS_INSTANCE_ID_;
	}
	public String getDELETE_REASON_() {
		return DELETE_REASON_;
	}
	public void setDELETE_REASON_(String dELETE_REASON_) {
		DELETE_REASON_ = dELETE_REASON_;
	}
	@Override
	public String toString() {
		return "Act_hi_procinst [ID_=" + ID_ + ", PROC_INST_ID_=" + PROC_INST_ID_ + ", BUSINESS_KEY_=" + BUSINESS_KEY_
				+ ", PROC_DEF_ID_=" + PROC_DEF_ID_ + ", START_TIME_=" + START_TIME_ + ", END_TIME_=" + END_TIME_
				+ ", DURATION_=" + DURATION_ + ", START_USER_ID_=" + START_USER_ID_ + ", START_ACT_ID_=" + START_ACT_ID_
				+ ", END_ACT_ID_=" + END_ACT_ID_ + ", SUPER_PROCESS_INSTANCE_ID_=" + SUPER_PROCESS_INSTANCE_ID_
				+ ", DELETE_REASON_=" + DELETE_REASON_ + "]";
	}
	
	
	
	


}
