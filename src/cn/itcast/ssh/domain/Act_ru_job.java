package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_ru_job implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_                  ;
	private Integer REV_                 ;
	private String TYPE_                ;
	private Date LOCK_EXP_TIME_       ;
	private String LOCK_OWNER_          ;
	private Integer EXCLUSIVE_           ;
	private String EXECUTION_ID_        ;
	private String PROCESS_INSTANCE_ID_ ;
	private String PROC_DEF_ID_         ;
	private Integer RETRIES_             ;
	private String EXCEPTION_STACK_ID_  ;
	private String EXCEPTION_MSG_       ;
	private Date DUEDATE_             ;
	private String REPEAT_              ;
	private String HANDLER_TYPE_        ;
	private String HANDLER_CFG_         ;
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
	public String getTYPE_() {
		return TYPE_;
	}
	public void setTYPE_(String tYPE_) {
		TYPE_ = tYPE_;
	}
	public Date getLOCK_EXP_TIME_() {
		return LOCK_EXP_TIME_;
	}
	public void setLOCK_EXP_TIME_(Date lOCK_EXP_TIME_) {
		LOCK_EXP_TIME_ = lOCK_EXP_TIME_;
	}
	public String getLOCK_OWNER_() {
		return LOCK_OWNER_;
	}
	public void setLOCK_OWNER_(String lOCK_OWNER_) {
		LOCK_OWNER_ = lOCK_OWNER_;
	}
	public Integer getEXCLUSIVE_() {
		return EXCLUSIVE_;
	}
	public void setEXCLUSIVE_(Integer eXCLUSIVE_) {
		EXCLUSIVE_ = eXCLUSIVE_;
	}
	public String getEXECUTION_ID_() {
		return EXECUTION_ID_;
	}
	public void setEXECUTION_ID_(String eXECUTION_ID_) {
		EXECUTION_ID_ = eXECUTION_ID_;
	}
	public String getPROCESS_INSTANCE_ID_() {
		return PROCESS_INSTANCE_ID_;
	}
	public void setPROCESS_INSTANCE_ID_(String pROCESS_INSTANCE_ID_) {
		PROCESS_INSTANCE_ID_ = pROCESS_INSTANCE_ID_;
	}
	public String getPROC_DEF_ID_() {
		return PROC_DEF_ID_;
	}
	public void setPROC_DEF_ID_(String pROC_DEF_ID_) {
		PROC_DEF_ID_ = pROC_DEF_ID_;
	}
	public Integer getRETRIES_() {
		return RETRIES_;
	}
	public void setRETRIES_(Integer rETRIES_) {
		RETRIES_ = rETRIES_;
	}
	public String getEXCEPTION_STACK_ID_() {
		return EXCEPTION_STACK_ID_;
	}
	public void setEXCEPTION_STACK_ID_(String eXCEPTION_STACK_ID_) {
		EXCEPTION_STACK_ID_ = eXCEPTION_STACK_ID_;
	}
	public String getEXCEPTION_MSG_() {
		return EXCEPTION_MSG_;
	}
	public void setEXCEPTION_MSG_(String eXCEPTION_MSG_) {
		EXCEPTION_MSG_ = eXCEPTION_MSG_;
	}
	public Date getDUEDATE_() {
		return DUEDATE_;
	}
	public void setDUEDATE_(Date dUEDATE_) {
		DUEDATE_ = dUEDATE_;
	}
	public String getREPEAT_() {
		return REPEAT_;
	}
	public void setREPEAT_(String rEPEAT_) {
		REPEAT_ = rEPEAT_;
	}
	public String getHANDLER_TYPE_() {
		return HANDLER_TYPE_;
	}
	public void setHANDLER_TYPE_(String hANDLER_TYPE_) {
		HANDLER_TYPE_ = hANDLER_TYPE_;
	}
	public String getHANDLER_CFG_() {
		return HANDLER_CFG_;
	}
	public void setHANDLER_CFG_(String hANDLER_CFG_) {
		HANDLER_CFG_ = hANDLER_CFG_;
	}
	@Override
	public String toString() {
		return "Act_ru_job [ID_=" + ID_ + ", REV_=" + REV_ + ", TYPE_=" + TYPE_ + ", LOCK_EXP_TIME_=" + LOCK_EXP_TIME_
				+ ", LOCK_OWNER_=" + LOCK_OWNER_ + ", EXCLUSIVE_=" + EXCLUSIVE_ + ", EXECUTION_ID_=" + EXECUTION_ID_
				+ ", PROCESS_INSTANCE_ID_=" + PROCESS_INSTANCE_ID_ + ", PROC_DEF_ID_=" + PROC_DEF_ID_ + ", RETRIES_="
				+ RETRIES_ + ", EXCEPTION_STACK_ID_=" + EXCEPTION_STACK_ID_ + ", EXCEPTION_MSG_=" + EXCEPTION_MSG_
				+ ", DUEDATE_=" + DUEDATE_ + ", REPEAT_=" + REPEAT_ + ", HANDLER_TYPE_=" + HANDLER_TYPE_
				+ ", HANDLER_CFG_=" + HANDLER_CFG_ + "]";
	}
	


}
