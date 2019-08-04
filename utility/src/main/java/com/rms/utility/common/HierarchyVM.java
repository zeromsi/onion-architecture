package com.rms.utility.common;

public class HierarchyVM {
	private Long mId;
	private String mName;
	public Long getId() {
		return mId;
	}
	public String getName() {
		return mName;
	}
	public void setId(Long mId) {
		this.mId = mId;
	}
	public void setName(String mName) {
		this.mName = mName;
	}
	public HierarchyVM(Long mId, String mName) {
		super();
		this.mId = mId;
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "FunctionalHierarchyVMForUserProfile [mId=" + mId + ", mName=" + mName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mId == null) ? 0 : mId.hashCode());
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HierarchyVM other = (HierarchyVM) obj;
		if (mId == null) {
			if (other.mId != null)
				return false;
		} else if (!mId.equals(other.mId))
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		return true;
	}
	public HierarchyVM() {
		super();
	}
	

}
