package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_ru_identitylink implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_              ;
	private Integer REV_             ;
	private String GROUP_ID_        ;
	private String TYPE_            ;
	private String USER_ID_         ;
	private String TASK_ID_         ;
	private String PROC_INST_ID_    ;
	private String PROC_DEF_ID_     ;
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
	public String getGROUP_ID_() {
		return GROUP_ID_;
	}
	public void setGROUP_ID_(String gROUP_ID_) {
		GROUP_ID_ = gROUP_ID_;
	}
	public String getTYPE_() {
		return TYPE_;
	}
	public void setTYPE_(String tYPE_) {
		TYPE_ = tYPE_;
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
	public String getPROC_DEF_ID_() {
		return PROC_DEF_ID_;
	}
	public void setPROC_DEF_ID_(String pROC_DEF_ID_) {
		PROC_DEF_ID_ = pROC_DEF_ID_;
	}
	@Override
	public String toString() {
		return "Act_ru_identitylink [ID_=" + ID_ + ", REV_=" + REV_ + ", GROUP_ID_=" + GROUP_ID_ + ", TYPE_=" + TYPE_
				+ ", USER_ID_=" + USER_ID_ + ", TASK_ID_=" + TASK_ID_ + ", PROC_INST_ID_=" + PROC_INST_ID_
				+ ", PROC_DEF_ID_=" + PROC_DEF_ID_ + "]";
	}
	

}
