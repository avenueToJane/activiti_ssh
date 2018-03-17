package cn.itcast.ssh.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Arrays;
/**
 * 主键生成策略表
 * @author 28953
 *
 */
public class Act_ge_bytearray implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7282565755538717799L;
	String id_     ;                     
	Integer rev_;
	String name_;
	String deployment_id_;
	Blob  bytes_;
	Integer generated_;
	public String getId_() {
		return id_;
	}
	public void setId_(String id_) {
		this.id_ = id_;
	}
	public Integer getRev_() {
		return rev_;
	}
	public void setRev_(Integer rev_) {
		this.rev_ = rev_;
	}
	public String getName_() {
		return name_;
	}
	public void setName_(String name_) {
		this.name_ = name_;
	}
	public String getDeployment_id_() {
		return deployment_id_;
	}
	public void setDeployment_id_(String deployment_id_) {
		this.deployment_id_ = deployment_id_;
	}
	
	public Blob getBytes_() {
		return bytes_;
	}
	public void setBytes_(Blob bytes_) {
		this.bytes_ = bytes_;
	}
	public Integer getGenerated_() {
		return generated_;
	}
	public void setGenerated_(Integer generated_) {
		this.generated_ = generated_;
	}
	@Override
	public String toString() {
		return "Act_ge_bytearray [id_=" + id_ + ", rev_=" + rev_ + ", name_=" + name_ + ", deployment_id_="
				+ deployment_id_ + ", bytes_=" + bytes_ + ", generated_=" + generated_ + "]";
	}
	
}
