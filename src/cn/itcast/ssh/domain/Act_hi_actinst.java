package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_hi_actinst implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_                     ;
	private String PROC_DEF_ID_            ;
	private String PROC_INST_ID_           ;
	private String EXECUTION_ID_           ;
	private String ACT_ID_                 ;
	private String TASK_ID_                ;
	private String CALL_PROC_INST_ID_      ;
	private String ACT_NAME_               ;
	private String ACT_TYPE_               ;
	private String ASSIGNEE_               ;
	private Date START_TIME_             ;
	private Date END_TIME_               ;
	private Integer DURATION_               ;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public String getPROC_DEF_ID_() {
		return PROC_DEF_ID_;
	}
	public void setPROC_DEF_ID_(String pROC_DEF_ID_) {
		PROC_DEF_ID_ = pROC_DEF_ID_;
	}
	public String getPROC_INST_ID_() {
		return PROC_INST_ID_;
	}
	public void setPROC_INST_ID_(String pROC_INST_ID_) {
		PROC_INST_ID_ = pROC_INST_ID_;
	}
	public String getEXECUTION_ID_() {
		return EXECUTION_ID_;
	}
	public void setEXECUTION_ID_(String eXECUTION_ID_) {
		EXECUTION_ID_ = eXECUTION_ID_;
	}
	public String getACT_ID_() {
		return ACT_ID_;
	}
	public void setACT_ID_(String aCT_ID_) {
		ACT_ID_ = aCT_ID_;
	}
	public String getTASK_ID_() {
		return TASK_ID_;
	}
	public void setTASK_ID_(String tASK_ID_) {
		TASK_ID_ = tASK_ID_;
	}
	public String getCALL_PROC_INST_ID_() {
		return CALL_PROC_INST_ID_;
	}
	public void setCALL_PROC_INST_ID_(String cALL_PROC_INST_ID_) {
		CALL_PROC_INST_ID_ = cALL_PROC_INST_ID_;
	}
	public String getACT_NAME_() {
		return ACT_NAME_;
	}
	public void setACT_NAME_(String aCT_NAME_) {
		ACT_NAME_ = aCT_NAME_;
	}
	public String getACT_TYPE_() {
		return ACT_TYPE_;
	}
	public void setACT_TYPE_(String aCT_TYPE_) {
		ACT_TYPE_ = aCT_TYPE_;
	}
	public String getASSIGNEE_() {
		return ASSIGNEE_;
	}
	public void setASSIGNEE_(String aSSIGNEE_) {
		ASSIGNEE_ = aSSIGNEE_;
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
	@Override
	public String toString() {
		return "Act_hi_actinst [ID_=" + ID_ + ", PROC_DEF_ID_=" + PROC_DEF_ID_ + ", PROC_INST_ID_=" + PROC_INST_ID_
				+ ", EXECUTION_ID_=" + EXECUTION_ID_ + ", ACT_ID_=" + ACT_ID_ + ", TASK_ID_=" + TASK_ID_
				+ ", CALL_PROC_INST_ID_=" + CALL_PROC_INST_ID_ + ", ACT_NAME_=" + ACT_NAME_ + ", ACT_TYPE_=" + ACT_TYPE_
				+ ", ASSIGNEE_=" + ASSIGNEE_ + ", START_TIME_=" + START_TIME_ + ", END_TIME_=" + END_TIME_
				+ ", DURATION_=" + DURATION_ + "]";
	}
	

}
