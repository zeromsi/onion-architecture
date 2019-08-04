package com.rms.utility.common;

import java.util.List;

public class RequestBoyForOLMObjectsRecords {
	private List<Long> mStateList;
	private Long mDefaultFunction;
	private Long mDefaultLocation;
	private Long mClassTypeId;
	private List<Long> mRoleList;
	public List<Long> getStateList() {
		return mStateList;
	}
	public Long getDefaultFunction() {
		return mDefaultFunction;
	}
	public Long getDefaultLocation() {
		return mDefaultLocation;
	}
	public void setStateList(List<Long> stateList) {
		this.mStateList = stateList;
	}
	public void setDefaultFunction(Long defaultFunction) {
		this.mDefaultFunction = defaultFunction;
	}
	public void setDefaultLocation(Long defaultLocation) {
		this.mDefaultLocation = defaultLocation;
	}
	public Long getClassTypeId() {
		return mClassTypeId;
	}
	public void setClassTypeId(Long classTypeId) {
		this.mClassTypeId = classTypeId;
	}
	public List<Long> getRoleList() {
		return mRoleList;
	}
	public void setRoleList(List<Long> mRoleList) {
		this.mRoleList = mRoleList;
	}
	public RequestBoyForOLMObjectsRecords(List<Long> mStateList, Long mDefaultFunction, Long mDefaultLocation, Long mClassTypeId,
			List<Long> mRoleList) {
		super();
		this.mStateList = mStateList;
		this.mDefaultFunction = mDefaultFunction;
		this.mDefaultLocation = mDefaultLocation;
		this.mClassTypeId = mClassTypeId;
		this.mRoleList = mRoleList;
	}
	public RequestBoyForOLMObjectsRecords() {
		super();
	}

}