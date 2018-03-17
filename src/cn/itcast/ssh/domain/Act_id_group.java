package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_id_group implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_     ;
	private Integer REV_    ;
	private String NAME_   ;
	private String TYPE_   ;
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
	public String getTYPE_() {
		return TYPE_;
	}
	public void setTYPE_(String tYPE_) {
		TYPE_ = tYPE_;
	}
	@Override
	public String toString() {
		return "Act_id_group [ID_=" + ID_ + ", REV_=" + REV_ + ", NAME_=" + NAME_ + ", TYPE_=" + TYPE_ + "]";
	}


}
