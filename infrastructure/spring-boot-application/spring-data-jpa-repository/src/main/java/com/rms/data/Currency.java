package com.rms.data;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Currency implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private String id;

	private String code;

	@NotNull
	private String name;
	
	@OneToOne
	@JoinColumn(name = "olcmStatesId")
	private OLCMStates olcmStates;

	private Long function;

	private Long location;

	private String createdBy;

	private Long createdAt;

	private String updatedBy;

	private Long updatedAt;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

	public OLCMStates getOlcmStates() {
		return olcmStates;
	}

	public void setOlcmStates(OLCMStates olcmStates) {
		this.olcmStates = olcmStates;
	}

	
	
	public Currency(String id, String code, @NotNull String name, OLCMStates olcmStates, Long function, Long location,
			String createdBy, Long createdAt, String updatedBy, Long updatedAt) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.olcmStates = olcmStates;
		this.function = function;
		this.location = location;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

	public Currency() {
		super();
	}

	public Currency(String id) {
		super();
		this.id = id;
	}
	
	

}
