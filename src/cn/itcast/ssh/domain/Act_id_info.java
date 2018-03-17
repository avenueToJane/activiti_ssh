package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_id_info implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String ID_               ;
	private Integer REV_              ;
	private String USER_ID_          ;
	private String TYPE_             ;
	private String KEY_              ;
	private String VALUE_            ;
	private Blob PASSWORD_         ;
	private String PARENT_ID_        ;
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
	public String getUSER_ID_() {
		return USER_ID_;
	}
	public void setUSER_ID_(String uSER_ID_) {
		USER_ID_ = uSER_ID_;
	}
	public String getTYPE_() {
		return TYPE_;
	}
	public void setTYPE_(String tYPE_) {
		TYPE_ = tYPE_;
	}
	public String getKEY_() {
		return KEY_;
	}
	public void setKEY_(String kEY_) {
		KEY_ = kEY_;
	}
	public String getVALUE_() {
		return VALUE_;
	}
	public void setVALUE_(String vALUE_) {
		VALUE_ = vALUE_;
	}
	public Blob getPASSWORD_() {
		return PASSWORD_;
	}
	public void setPASSWORD_(Blob pASSWORD_) {
		PASSWORD_ = pASSWORD_;
	}
	public String getPARENT_ID_() {
		return PARENT_ID_;
	}
	public void setPARENT_ID_(String pARENT_ID_) {
		PARENT_ID_ = pARENT_ID_;
	}
	@Override
	public String toString() {
		return "Act_id_info [ID_=" + ID_ + ", REV_=" + REV_ + ", USER_ID_=" + USER_ID_ + ", TYPE_=" + TYPE_ + ", KEY_="
				+ KEY_ + ", VALUE_=" + VALUE_ + ", PASSWORD_=" + PASSWORD_ + ", PARENT_ID_=" + PARENT_ID_ + "]";
	}
	           
}
