package com.rms.domain;

public class OLCMStatesVM {
	private Long id;
	private String name;
	private String code;
	private String statusFlag;
	
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
	public OLCMStatesVM(Long id) {
		super();
		this.id = id;
	}
	public OLCMStatesVM() {
		super();
	}
	
	
}
