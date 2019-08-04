package com.rms.utility.request.get;

public class TableHeaderProperty {
private String name;
private String visibleName;

public String getName() {
	return name;
}
public String getVisibleName() {
	return visibleName;
}
public void setName(String name) {
	this.name = name;
}
public void setVisibleName(String visibleName) {
	this.visibleName = visibleName;
}
public TableHeaderProperty(String name, String visibleName) {
	super();
	this.name = name;
	this.visibleName = visibleName;
}

}
