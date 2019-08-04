package com.rms.utility.request.get;
import java.util.List;

public class GetRequestResponseEntityForList<T,I> {
	public List<GetRequestResponseBody<T,I>> data;
	public List<TableHeaderProperty> tableHeaderPropertyList;
}
