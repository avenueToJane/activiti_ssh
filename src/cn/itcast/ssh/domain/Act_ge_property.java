package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;

public class Act_ge_property implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	String name_ ;                     
	Integer rev_;
	String value_;
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public Integer getRev_() {
		return rev_;
	}
	public void setRev_(Integer rev_) {
		this.rev_ = rev_;
	}
	public String getValue_() {
		return value_;
	}
	public void setValue_(String value_) {
		this.value_ = value_;
	}
	@Override
	public String toString() {
		return "Act_ge_bytearray [name_=" + name_ + ", rev_=" + rev_ + ", value_=" + value_ + "]";
	}

}
