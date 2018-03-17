package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_re_procdef implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_                   ;
	private Integer REV_                  ;
	private String CATEGORY_             ;
	private String NAME_                 ;
	private String KEY_                  ;
	private Integer VERSION_              ;
	private String DEPLOYMENT_ID_        ;
	private String RESOURCE_NAME_        ;
	private String DGRM_RESOURCE_NAME_   ;
	private String DESCRIPTION_          ;
	private Integer HAS_START_FORM_KEY_   ;
	private Integer SUSPENSION_STATE_     ;
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
	public String getCATEGORY_() {
		return CATEGORY_;
	}
	public void setCATEGORY_(String cATEGORY_) {
		CATEGORY_ = cATEGORY_;
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
	public Integer getVERSION_() {
		return VERSION_;
	}
	public void setVERSION_(Integer vERSION_) {
		VERSION_ = vERSION_;
	}
	public String getDEPLOYMENT_ID_() {
		return DEPLOYMENT_ID_;
	}
	public void setDEPLOYMENT_ID_(String dEPLOYMENT_ID_) {
		DEPLOYMENT_ID_ = dEPLOYMENT_ID_;
	}
	public String getRESOURCE_NAME_() {
		return RESOURCE_NAME_;
	}
	public void setRESOURCE_NAME_(String rESOURCE_NAME_) {
		RESOURCE_NAME_ = rESOURCE_NAME_;
	}
	public String getDGRM_RESOURCE_NAME_() {
		return DGRM_RESOURCE_NAME_;
	}
	public void setDGRM_RESOURCE_NAME_(String dGRM_RESOURCE_NAME_) {
		DGRM_RESOURCE_NAME_ = dGRM_RESOURCE_NAME_;
	}
	public String getDESCRIPTION_() {
		return DESCRIPTION_;
	}
	public void setDESCRIPTION_(String dESCRIPTION_) {
		DESCRIPTION_ = dESCRIPTION_;
	}
	public Integer getHAS_START_FORM_KEY_() {
		return HAS_START_FORM_KEY_;
	}
	public void setHAS_START_FORM_KEY_(Integer hAS_START_FORM_KEY_) {
		HAS_START_FORM_KEY_ = hAS_START_FORM_KEY_;
	}
	public Integer getSUSPENSION_STATE_() {
		return SUSPENSION_STATE_;
	}
	public void setSUSPENSION_STATE_(Integer sUSPENSION_STATE_) {
		SUSPENSION_STATE_ = sUSPENSION_STATE_;
	}
	@Override
	public String toString() {
		return "Act_re_procdef [ID_=" + ID_ + ", REV_=" + REV_ + ", CATEGORY_=" + CATEGORY_ + ", NAME_=" + NAME_
				+ ", KEY_=" + KEY_ + ", VERSION_=" + VERSION_ + ", DEPLOYMENT_ID_=" + DEPLOYMENT_ID_
				+ ", RESOURCE_NAME_=" + RESOURCE_NAME_ + ", DGRM_RESOURCE_NAME_=" + DGRM_RESOURCE_NAME_
				+ ", DESCRIPTION_=" + DESCRIPTION_ + ", HAS_START_FORM_KEY_=" + HAS_START_FORM_KEY_
				+ ", SUSPENSION_STATE_=" + SUSPENSION_STATE_ + "]";
	}
	
	
	

}
