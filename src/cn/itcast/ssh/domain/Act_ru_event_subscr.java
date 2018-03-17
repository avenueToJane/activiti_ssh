package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_ru_event_subscr implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	
	private String ID_           ;
	private int REV_          ;
	private String EVENT_TYPE_   ;
	private String EVENT_NAME_   ;
	private String EXECUTION_ID_ ;
	private String PROC_INST_ID_ ;
	private String ACTIVITY_ID_  ;
	private String CONFIGURATION_;
	private Date CREATED_      ;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public int getREV_() {
		return REV_;
	}
	public void setREV_(int rEV_) {
		REV_ = rEV_;
	}
	public String getEVENT_TYPE_() {
		return EVENT_TYPE_;
	}
	public void setEVENT_TYPE_(String eVENT_TYPE_) {
		EVENT_TYPE_ = eVENT_TYPE_;
	}
	public String getEVENT_NAME_() {
		return EVENT_NAME_;
	}
	public void setEVENT_NAME_(String eVENT_NAME_) {
		EVENT_NAME_ = eVENT_NAME_;
	}
	public String getEXECUTION_ID_() {
		return EXECUTION_ID_;
	}
	public void setEXECUTION_ID_(String eXECUTION_ID_) {
		EXECUTION_ID_ = eXECUTION_ID_;
	}
	public String getPROC_INST_ID_() {
		return PROC_INST_ID_;
	}
	public void setPROC_INST_ID_(String pROC_INST_ID_) {
		PROC_INST_ID_ = pROC_INST_ID_;
	}
	public String getACTIVITY_ID_() {
		return ACTIVITY_ID_;
	}
	public void setACTIVITY_ID_(String aCTIVITY_ID_) {
		ACTIVITY_ID_ = aCTIVITY_ID_;
	}
	public String getCONFIGURATION_() {
		return CONFIGURATION_;
	}
	public void setCONFIGURATION_(String cONFIGURATION_) {
		CONFIGURATION_ = cONFIGURATION_;
	}
	public Date getCREATED_() {
		return CREATED_;
	}
	public void setCREATED_(Date cREATED_) {
		CREATED_ = cREATED_;
	}
	@Override
	public String toString() {
		return "Act_ru_event_subscr [ID_=" + ID_ + ", REV_=" + REV_ + ", EVENT_TYPE_=" + EVENT_TYPE_ + ", EVENT_NAME_="
				+ EVENT_NAME_ + ", EXECUTION_ID_=" + EXECUTION_ID_ + ", PROC_INST_ID_=" + PROC_INST_ID_
				+ ", ACTIVITY_ID_=" + ACTIVITY_ID_ + ", CONFIGURATION_=" + CONFIGURATION_ + ", CREATED_=" + CREATED_
				+ "]";
	}
	

	
}
