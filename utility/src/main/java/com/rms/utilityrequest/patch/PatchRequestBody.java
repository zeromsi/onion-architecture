package com.rms.utilityrequest.patch;

public class PatchRequestBody<T,I> {
	public String type;
	public I id;
	public T attributes;
}