package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_ru_variable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_            ;
	private Integer REV_           ;
	private String TYPE_          ;
	private String NAME_          ;
	private String EXECUTION_ID_  ;
	private String PROC_INST_ID_  ;
	private String TASK_ID_       ;
	private String BYTEARRAY_ID_  ;
	private Double DOUBLE_        ;
	private Integer LONG_          ;
	private String TEXT_          ;
	private String TEXT2_         ;
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
	public String getNAME_() {
		return NAME_;
	}
	public void setNAME_(String nAME_) {
		NAME_ = nAME_;
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
	public String getTASK_ID_() {
		return TASK_ID_;
	}
	public void setTASK_ID_(String tASK_ID_) {
		TASK_ID_ = tASK_ID_;
	}
	public String getBYTEARRAY_ID_() {
		return BYTEARRAY_ID_;
	}
	public void setBYTEARRAY_ID_(String bYTEARRAY_ID_) {
		BYTEARRAY_ID_ = bYTEARRAY_ID_;
	}
	public Double getDOUBLE_() {
		return DOUBLE_;
	}
	public void setDOUBLE_(Double dOUBLE_) {
		DOUBLE_ = dOUBLE_;
	}
	public Integer getLONG_() {
		return LONG_;
	}
	public void setLONG_(Integer lONG_) {
		LONG_ = lONG_;
	}
	public String getTEXT_() {
		return TEXT_;
	}
	public void setTEXT_(String tEXT_) {
		TEXT_ = tEXT_;
	}
	public String getTEXT2_() {
		return TEXT2_;
	}
	public void setTEXT2_(String tEXT2_) {
		TEXT2_ = tEXT2_;
	}
	@Override
	public String toString() {
		return "Act_ru_variable [ID_=" + ID_ + ", REV_=" + REV_ + ", TYPE_=" + TYPE_ + ", NAME_=" + NAME_
				+ ", EXECUTION_ID_=" + EXECUTION_ID_ + ", PROC_INST_ID_=" + PROC_INST_ID_ + ", TASK_ID_=" + TASK_ID_
				+ ", BYTEARRAY_ID_=" + BYTEARRAY_ID_ + ", DOUBLE_=" + DOUBLE_ + ", LONG_=" + LONG_ + ", TEXT_=" + TEXT_
				+ ", TEXT2_=" + TEXT2_ + "]";
	}
	
	
	

}
