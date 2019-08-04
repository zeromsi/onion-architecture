package com.rms.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "olcm_States")
public class OLCMStates implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Long id;

	@NotNull
	@Column(name = "name")
	private String name;

	@NotNull
	@Column(name = "code")
	private String code;
	
	private String statusFlag;

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public String getCode() {
		return code;
	}



	public String getStatusFlag() {
		return statusFlag;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}



	public OLCMStates() {
		super();
	}



	public OLCMStates(Long id) {
		super();
		this.id = id;
	}



	public OLCMStates(Long id, @NotNull String name, @NotNull String code, String statusFlag) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.statusFlag = statusFlag;
	}



	@Override
	public String toString() {
		return "States [id=" + id + ", name=" + name + ", code=" + code + ", statusFlag=" + statusFlag + "]";
	}

	

}
