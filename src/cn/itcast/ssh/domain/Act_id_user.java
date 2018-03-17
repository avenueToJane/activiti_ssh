package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_id_user implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_             ;
	private String REV_            ;
	private String FIRST_          ;
	private String LAST_           ;
	private String EMAIL_          ;
	private String PWD_            ;
	private String PICTURE_ID_     ;
	public String getID_() {
		return ID_;
	}
	public void setID_(String iD_) {
		ID_ = iD_;
	}
	public String getREV_() {
		return REV_;
	}
	public void setREV_(String rEV_) {
		REV_ = rEV_;
	}
	public String getFIRST_() {
		return FIRST_;
	}
	public void setFIRST_(String fIRST_) {
		FIRST_ = fIRST_;
	}
	public String getLAST_() {
		return LAST_;
	}
	public void setLAST_(String lAST_) {
		LAST_ = lAST_;
	}
	public String getEMAIL_() {
		return EMAIL_;
	}
	public void setEMAIL_(String eMAIL_) {
		EMAIL_ = eMAIL_;
	}
	public String getPWD_() {
		return PWD_;
	}
	public void setPWD_(String pWD_) {
		PWD_ = pWD_;
	}
	public String getPICTURE_ID_() {
		return PICTURE_ID_;
	}
	public void setPICTURE_ID_(String pICTURE_ID_) {
		PICTURE_ID_ = pICTURE_ID_;
	}
	@Override
	public String toString() {
		return "Act_id_user [ID_=" + ID_ + ", REV_=" + REV_ + ", FIRST_=" + FIRST_ + ", LAST_=" + LAST_ + ", EMAIL_="
				+ EMAIL_ + ", PWD_=" + PWD_ + ", PICTURE_ID_=" + PICTURE_ID_ + "]";
	}
	

}
