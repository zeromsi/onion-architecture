package com.rms.utility.common;

import java.util.List;

public class RequestBodyForHierarchyVM {
	private Long mClassTypeId;
	private List<Long> mRoleList;
	private Long mDefaultHierarchyId;
	
	public Long getClassTypeId() {
		return mClassTypeId;
	}
	public List<Long> getRoleList() {
		return mRoleList;
	}
	public Long getDefaultHierarchyId() {
		return mDefaultHierarchyId;
	}
	public void setClassTypeId(Long mClassTypeId) {
		this.mClassTypeId = mClassTypeId;
	}
	public void setRoleList(List<Long> roleList) {
		this.mRoleList = roleList;
	}
	public void setDefaultHierarchyId(Long defaultHierarchyId) {
		this.mDefaultHierarchyId = defaultHierarchyId;
	}
	public RequestBodyForHierarchyVM(Long mClassTypeId, List<Long> mRoleList, Long mDefaultHierarchyId) {
		super();
		this.mClassTypeId = mClassTypeId;
		this.mRoleList = mRoleList;
		this.mDefaultHierarchyId = mDefaultHierarchyId;
	}
	public RequestBodyForHierarchyVM() {
		super();
	}
	

	

}