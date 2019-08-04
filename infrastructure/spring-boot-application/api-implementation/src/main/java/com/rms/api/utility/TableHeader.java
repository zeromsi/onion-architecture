package com.rms.api.utility;

import java.util.Arrays;
import java.util.List;

import com.rms.utility.request.get.TableHeaderProperty;

public class TableHeader {
	
public static List<TableHeaderProperty> getRemitterTableHeader(){
	return Arrays.asList(
				new TableHeaderProperty("id", "ID"),
				new TableHeaderProperty("type", "Type"),
				new TableHeaderProperty("fathersName", "Fathers Name"),
				new TableHeaderProperty("mothersName", "Mothers Name"),
				new TableHeaderProperty("contactNo", "Contact No"),
				new TableHeaderProperty("emailId", "Email"),
				new TableHeaderProperty("name", "Name"),
				new TableHeaderProperty("country.name", "Country"),
				new TableHeaderProperty("nationality.nationality", "Nationality")
				);
} 

public static List<TableHeaderProperty> getBeneficiaryTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("name", "Name"),
			new TableHeaderProperty("contactNo", "Contact No"),
			new TableHeaderProperty("emailId", "Email"),
			new TableHeaderProperty("country.name", "Country"),
			new TableHeaderProperty("relationshipWithRemitter", "Relationship With Remitter"),
			new TableHeaderProperty("nationality.nationality", "Nationality")
			);
}

public static List<TableHeaderProperty> getRemittanceTransactionTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("batchId", "Batch Id"),
			new TableHeaderProperty("tracerId", "TracerId Id"),
			new TableHeaderProperty("remittanceType.name", "Remittance Type"),
			new TableHeaderProperty("remittancePurpose.name", "Remittance Purpose"),
			new TableHeaderProperty("fundSource.name", "Fund Source"),
			new TableHeaderProperty("deliveryAgent.name", "Delivery Agent"),
			new TableHeaderProperty("beneficiary.name", "Beneficiary")
	
			);
}

public static List<TableHeaderProperty> getRemittanceTypeTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getRemittancePurposeTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getPhotoIdTypeTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getPaymentModeTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getFundSourceTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getDeliveryAgentTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getCurrencyTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"));
}

public static List<TableHeaderProperty> getCountryTableHeader() {
	return Arrays.asList(
			new TableHeaderProperty("id", "ID"),
			new TableHeaderProperty("code", "Code"),
			new TableHeaderProperty("name", "Name"),
			new TableHeaderProperty("nationality", "Nationality"));
}


}
