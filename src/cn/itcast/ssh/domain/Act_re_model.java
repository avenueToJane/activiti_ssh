package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_re_model implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_                              ;
	private Integer REV_                             ;
	private String NAME_                            ;
	private String KEY_                             ;
	private String CATEGORY_                        ;
	private Date CREATE_TIME_                     ;
	private Date LAST_UPDATE_TIME_                ;
	private Integer VERSION_                         ;
	private String META_INFO_                       ;
	private String DEPLOYMENT_ID_                   ;
	private String EDITOR_SOURCE_VALUE_ID_          ;
	private String EDITOR_SOURCE_EXTRA_VALUE_ID_    ;
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
	public String getNAME_() {
		return NAME_;
	}
	public void setNAME_(String nAME_) {
		NAME_ = nAME_;
	}
	public String getKEY_() {
		return KEY_;
	}
	public void setKEY_(String kEY_) {
		KEY_ = kEY_;
	}
	public String getCATEGORY_() {
		return CATEGORY_;
	}
	public void setCATEGORY_(String cATEGORY_) {
		CATEGORY_ = cATEGORY_;
	}
	public Date getCREATE_TIME_() {
		return CREATE_TIME_;
	}
	public void setCREATE_TIME_(Date cREATE_TIME_) {
		CREATE_TIME_ = cREATE_TIME_;
	}
	public Date getLAST_UPDATE_TIME_() {
		return LAST_UPDATE_TIME_;
	}
	public void setLAST_UPDATE_TIME_(Date lAST_UPDATE_TIME_) {
		LAST_UPDATE_TIME_ = lAST_UPDATE_TIME_;
	}
	public Integer getVERSION_() {
		return VERSION_;
	}
	public void setVERSION_(Integer vERSION_) {
		VERSION_ = vERSION_;
	}
	public String getMETA_INFO_() {
		return META_INFO_;
	}
	public void setMETA_INFO_(String mETA_INFO_) {
		META_INFO_ = mETA_INFO_;
	}
	public String getDEPLOYMENT_ID_() {
		return DEPLOYMENT_ID_;
	}
	public void setDEPLOYMENT_ID_(String dEPLOYMENT_ID_) {
		DEPLOYMENT_ID_ = dEPLOYMENT_ID_;
	}
	public String getEDITOR_SOURCE_VALUE_ID_() {
		return EDITOR_SOURCE_VALUE_ID_;
	}
	public void setEDITOR_SOURCE_VALUE_ID_(String eDITOR_SOURCE_VALUE_ID_) {
		EDITOR_SOURCE_VALUE_ID_ = eDITOR_SOURCE_VALUE_ID_;
	}
	public String getEDITOR_SOURCE_EXTRA_VALUE_ID_() {
		return EDITOR_SOURCE_EXTRA_VALUE_ID_;
	}
	public void setEDITOR_SOURCE_EXTRA_VALUE_ID_(String eDITOR_SOURCE_EXTRA_VALUE_ID_) {
		EDITOR_SOURCE_EXTRA_VALUE_ID_ = eDITOR_SOURCE_EXTRA_VALUE_ID_;
	}
	@Override
	public String toString() {
		return "Act_re_model [ID_=" + ID_ + ", REV_=" + REV_ + ", NAME_=" + NAME_ + ", KEY_=" + KEY_ + ", CATEGORY_="
				+ CATEGORY_ + ", CREATE_TIME_=" + CREATE_TIME_ + ", LAST_UPDATE_TIME_=" + LAST_UPDATE_TIME_
				+ ", VERSION_=" + VERSION_ + ", META_INFO_=" + META_INFO_ + ", DEPLOYMENT_ID_=" + DEPLOYMENT_ID_
				+ ", EDITOR_SOURCE_VALUE_ID_=" + EDITOR_SOURCE_VALUE_ID_ + ", EDITOR_SOURCE_EXTRA_VALUE_ID_="
				+ EDITOR_SOURCE_EXTRA_VALUE_ID_ + "]";
	}
	
	

}
