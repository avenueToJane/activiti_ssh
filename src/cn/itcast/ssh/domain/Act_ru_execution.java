package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_ru_execution implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_                      ;
	private Integer REV_                     ;
	private String PROC_INST_ID_            ;
	private String BUSINESS_KEY_            ;
	private String PARENT_ID_               ;
	private String PROC_DEF_ID_             ;
	private String SUPER_EXEC_              ;
	private String ACT_ID_                  ;
	private Integer IS_ACTIVE_               ;
	private Integer IS_CONCURRENT_           ;
	private Integer IS_SCOPE_                ;
	private Integer IS_EVENT_SCOPE_          ;
	private Integer SUSPENSION_STATE_        ;
	private Integer CACHED_ENT_STATE_        ;
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
	public String getPARENT_ID_() {
		return PARENT_ID_;
	}
	public void setPARENT_ID_(String pARENT_ID_) {
		PARENT_ID_ = pARENT_ID_;
	}
	public String getPROC_DEF_ID_() {
		return PROC_DEF_ID_;
	}
	public void setPROC_DEF_ID_(String pROC_DEF_ID_) {
		PROC_DEF_ID_ = pROC_DEF_ID_;
	}
	public String getSUPER_EXEC_() {
		return SUPER_EXEC_;
	}
	public void setSUPER_EXEC_(String sUPER_EXEC_) {
		SUPER_EXEC_ = sUPER_EXEC_;
	}
	public String getACT_ID_() {
		return ACT_ID_;
	}
	public void setACT_ID_(String aCT_ID_) {
		ACT_ID_ = aCT_ID_;
	}
	public Integer getIS_ACTIVE_() {
		return IS_ACTIVE_;
	}
	public void setIS_ACTIVE_(Integer iS_ACTIVE_) {
		IS_ACTIVE_ = iS_ACTIVE_;
	}
	public Integer getIS_CONCURRENT_() {
		return IS_CONCURRENT_;
	}
	public void setIS_CONCURRENT_(Integer iS_CONCURRENT_) {
		IS_CONCURRENT_ = iS_CONCURRENT_;
	}
	public Integer getIS_SCOPE_() {
		return IS_SCOPE_;
	}
	public void setIS_SCOPE_(Integer iS_SCOPE_) {
		IS_SCOPE_ = iS_SCOPE_;
	}
	public Integer getIS_EVENT_SCOPE_() {
		return IS_EVENT_SCOPE_;
	}
	public void setIS_EVENT_SCOPE_(Integer iS_EVENT_SCOPE_) {
		IS_EVENT_SCOPE_ = iS_EVENT_SCOPE_;
	}
	public Integer getSUSPENSION_STATE_() {
		return SUSPENSION_STATE_;
	}
	public void setSUSPENSION_STATE_(Integer sUSPENSION_STATE_) {
		SUSPENSION_STATE_ = sUSPENSION_STATE_;
	}
	public Integer getCACHED_ENT_STATE_() {
		return CACHED_ENT_STATE_;
	}
	public void setCACHED_ENT_STATE_(Integer cACHED_ENT_STATE_) {
		CACHED_ENT_STATE_ = cACHED_ENT_STATE_;
	}
	@Override
	public String toString() {
		return "Act_ru_execution [ID_=" + ID_ + ", REV_=" + REV_ + ", PROC_INST_ID_=" + PROC_INST_ID_
				+ ", BUSINESS_KEY_=" + BUSINESS_KEY_ + ", PARENT_ID_=" + PARENT_ID_ + ", PROC_DEF_ID_=" + PROC_DEF_ID_
				+ ", SUPER_EXEC_=" + SUPER_EXEC_ + ", ACT_ID_=" + ACT_ID_ + ", IS_ACTIVE_=" + IS_ACTIVE_
				+ ", IS_CONCURRENT_=" + IS_CONCURRENT_ + ", IS_SCOPE_=" + IS_SCOPE_ + ", IS_EVENT_SCOPE_="
				+ IS_EVENT_SCOPE_ + ", SUSPENSION_STATE_=" + SUSPENSION_STATE_ + ", CACHED_ENT_STATE_="
				+ CACHED_ENT_STATE_ + "]";
	}
	

}
