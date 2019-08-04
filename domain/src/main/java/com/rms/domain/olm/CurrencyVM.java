package com.rms.domain.olm;

import com.rms.domain.OLCMStatesVM;

public class CurrencyVM {

	private String id;

	private String code;
	
	private String name;

	private OLCMStatesVM olcmState;

	private Long function;

	private Long location;

	private String createdBy;

	private Long createdAt;

	private String updatedBy;

	private Long updatedAt;

	public String getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public Long getFunction() {
		return function;
	}

	public Long getLocation() {
		return location;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public Long getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public Long getUpdatedAt() {
		return updatedAt;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFunction(Long function) {
		this.function = function;
	}

	public void setLocation(Long location) {
		this.location = location;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void setUpdatedAt(Long updatedAt) {
		this.updatedAt = updatedAt;
	}


	public OLCMStatesVM getOlcmState() {
		return olcmState;
	}

	public void setOlcmState(OLCMStatesVM olcmState) {
		this.olcmState = olcmState;
	}

	public CurrencyVM() {
		super();
	}

	public CurrencyVM(String id) {
		super();
		this.id = id;
	}
}
