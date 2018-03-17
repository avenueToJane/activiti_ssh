package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_hi_taskinst implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_           ;
	private String PROC_DEF_ID_  ;
	private String TASK_DEF_KEY_ ;
	private String PROC_INST_ID_ ;
	private String EXECUTION_ID_ ;
	private String NAME_         ;
	private String PARENT_TASK_ID;
	private String DESCRIPTION_  ;
	private String OWNER_        ;
	private String ASSIGNEE_     ;
	private Date START_TIME_   ;
	private Date CLAIM_TIME_   ;
	private Date END_TIME_     ;
	private Integer DURATION_     ;
	private String DELETE_REASON_;
	private Integer PRIORITY_     ;
	private Date DUE_DATE_     ;
	private String FORM_KEY_     ;
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
	public String getTASK_DEF_KEY_() {
		return TASK_DEF_KEY_;
	}
	public void setTASK_DEF_KEY_(String tASK_DEF_KEY_) {
		TASK_DEF_KEY_ = tASK_DEF_KEY_;
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
	public String getNAME_() {
		return NAME_;
	}
	public void setNAME_(String nAME_) {
		NAME_ = nAME_;
	}
	public String getPARENT_TASK_ID() {
		return PARENT_TASK_ID;
	}
	public void setPARENT_TASK_ID(String pARENT_TASK_ID) {
		PARENT_TASK_ID = pARENT_TASK_ID;
	}
	public String getDESCRIPTION_() {
		return DESCRIPTION_;
	}
	public void setDESCRIPTION_(String dESCRIPTION_) {
		DESCRIPTION_ = dESCRIPTION_;
	}
	public String getOWNER_() {
		return OWNER_;
	}
	public void setOWNER_(String oWNER_) {
		OWNER_ = oWNER_;
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
	public Date getCLAIM_TIME_() {
		return CLAIM_TIME_;
	}
	public void setCLAIM_TIME_(Date cLAIM_TIME_) {
		CLAIM_TIME_ = cLAIM_TIME_;
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
	public String getDELETE_REASON_() {
		return DELETE_REASON_;
	}
	public void setDELETE_REASON_(String dELETE_REASON_) {
		DELETE_REASON_ = dELETE_REASON_;
	}
	public Integer getPRIORITY_() {
		return PRIORITY_;
	}
	public void setPRIORITY_(Integer pRIORITY_) {
		PRIORITY_ = pRIORITY_;
	}
	public Date getDUE_DATE_() {
		return DUE_DATE_;
	}
	public void setDUE_DATE_(Date dUE_DATE_) {
		DUE_DATE_ = dUE_DATE_;
	}
	public String getFORM_KEY_() {
		return FORM_KEY_;
	}
	public void setFORM_KEY_(String fORM_KEY_) {
		FORM_KEY_ = fORM_KEY_;
	}
	@Override
	public String toString() {
		return "Act_hi_taskinst [ID_=" + ID_ + ", PROC_DEF_ID_=" + PROC_DEF_ID_ + ", TASK_DEF_KEY_=" + TASK_DEF_KEY_
				+ ", PROC_INST_ID_=" + PROC_INST_ID_ + ", EXECUTION_ID_=" + EXECUTION_ID_ + ", NAME_=" + NAME_
				+ ", PARENT_TASK_ID=" + PARENT_TASK_ID + ", DESCRIPTION_=" + DESCRIPTION_ + ", OWNER_=" + OWNER_
				+ ", ASSIGNEE_=" + ASSIGNEE_ + ", START_TIME_=" + START_TIME_ + ", CLAIM_TIME_=" + CLAIM_TIME_
				+ ", END_TIME_=" + END_TIME_ + ", DURATION_=" + DURATION_ + ", DELETE_REASON_=" + DELETE_REASON_
				+ ", PRIORITY_=" + PRIORITY_ + ", DUE_DATE_=" + DUE_DATE_ + ", FORM_KEY_=" + FORM_KEY_ + "]";
	}


}
