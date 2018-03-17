package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_id_membership implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	private String USER_ID_;
	private String GROUP_ID_;
	public String getUSER_ID_() {
		return USER_ID_;
	}
	public void setUSER_ID_(String uSER_ID_) {
		USER_ID_ = uSER_ID_;
	}
	public String getGROUP_ID_() {
		return GROUP_ID_;
	}
	public void setGROUP_ID_(String gROUP_ID_) {
		GROUP_ID_ = gROUP_ID_;
	}
	@Override
	public String toString() {
		return "Act_id_membership [USER_ID_=" + USER_ID_ + ", GROUP_ID_=" + GROUP_ID_ + "]";
	}
	




}
