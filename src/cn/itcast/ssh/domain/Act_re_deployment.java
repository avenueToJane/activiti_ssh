package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Date;
import java.util.Arrays;

public class Act_re_deployment implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_        ;
	private String NAME_      ;
	private String CATEGORY_  ;
	private Date DEPLOY_TIME_ ;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public String getNAME_() {
		return NAME_;
	}
	public void setNAME_(String nAME_) {
		NAME_ = nAME_;
	}
	public String getCATEGORY_() {
		return CATEGORY_;
	}
	public void setCATEGORY_(String cATEGORY_) {
		CATEGORY_ = cATEGORY_;
	}
	public Date getDEPLOY_TIME_() {
		return DEPLOY_TIME_;
	}
	public void setDEPLOY_TIME_(Date dEPLOY_TIME_) {
		DEPLOY_TIME_ = dEPLOY_TIME_;
	}
	@Override
	public String toString() {
		return "Act_re_deployment [ID_=" + ID_ + ", NAME_=" + NAME_ + ", CATEGORY_=" + CATEGORY_ + ", DEPLOY_TIME_="
				+ DEPLOY_TIME_ + "]";
	}
	

}
