package com.rms.api.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import com.rms.api.CurrencyController;
import com.rms.api.utility.TableHeader;
import com.rms.applicationService.CurrencyService;
import com.rms.domain.olm.CurrencyVM;
import com.rms.utility.common.CustomResponse;
import com.rms.utility.common.RequestBoyForOLMObjectsRecords;
import com.rms.utility.request.get.GetRequestResponseBody;
import com.rms.utility.request.get.GetRequestResponseEntityForList;
import com.rms.utility.request.get.TableHeaderProperty;
import com.rms.utilityrequest.patch.PatchRequestEntity;
import com.rms.utilityrequest.post.PostRequestEntity;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@CrossOrigin
@RestController
public class CurrencyControllerImplementation implements CurrencyController<CurrencyVM, String>{
	
	@Autowired
	CurrencyService currencyService;
	
	@Override
	public ResponseEntity<?> save(@RequestBody PostRequestEntity<CurrencyVM, String> postRequestEntity) {
		CurrencyVM currencyVM=new CurrencyVM();
		currencyVM = (CurrencyVM) postRequestEntity.data.attributes;
		currencyVM.setId(postRequestEntity.data.id);
		HttpHeaders httpHeaders = new HttpHeaders();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		boolean success = false;
		try {
			success = currencyService.save(currencyVM,request.getHeader("user"));
		} catch (Exception e) {
			return CustomResponse.response(e.getMessage(), HttpStatus.NOT_ACCEPTABLE, "/currencies");
		}
		if (success) {
			return new ResponseEntity<>( HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<?> findAll() {
		GetRequestResponseEntityForList responseObject = new GetRequestResponseEntityForList<CurrencyVM, String>();
		List<CurrencyVM> deliveryAgentVMList=currencyService.findAll();
		if (deliveryAgentVMList!=null) {
			List<GetRequestResponseBody> getRequestResponseBodyList = new ArrayList<>();
			for(CurrencyVM currencyVM:deliveryAgentVMList) {
				GetRequestResponseBody getRequestResponseBody=new GetRequestResponseBody<>();
				getRequestResponseBody.attributes = currencyVM;
				getRequestResponseBody.id = currencyVM.getId();
				getRequestResponseBody.type = "currencies";
				getRequestResponseBodyList.add(getRequestResponseBody);
			}
			responseObject.data=getRequestResponseBodyList;
			return new ResponseEntity<GetRequestResponseEntityForList>(responseObject, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


	public ResponseEntity<?> findAll(@RequestBody RequestBoyForOLMObjectsRecords request) {
		GetRequestResponseEntityForList responseObject = new GetRequestResponseEntityForList<CurrencyVM, String>();
		List<CurrencyVM> currencyVMList = new ArrayList<>();
		List<TableHeaderProperty> tableHeaderPropertyList = TableHeader.getCurrencyTableHeader();
		responseObject.tableHeaderPropertyList = tableHeaderPropertyList;
		try {
			currencyVMList = currencyService.findByStateListAndRoleListAndDefaultLocationAndFunction(
					request.getClassTypeId(), request.getStateList(), request.getDefaultFunction(),
					request.getDefaultLocation(), request.getRoleList());
		} catch (Exception e) {
		}
		if (currencyVMList != null) {
			List<GetRequestResponseBody> getRequestResponseBodyList = new ArrayList<>();
			for (CurrencyVM currencyVM : currencyVMList) {
				GetRequestResponseBody getRequestResponseBody = new GetRequestResponseBody<>();
				getRequestResponseBody.attributes = currencyVM;
				getRequestResponseBody.id = currencyVM.getId();
				getRequestResponseBody.type = "currencies";
				getRequestResponseBodyList.add(getRequestResponseBody);
			}
			responseObject.data = getRequestResponseBodyList;
			return new ResponseEntity<GetRequestResponseEntityForList>(responseObject, HttpStatus.OK);
		} else {
			responseObject.data = null;
			return new ResponseEntity<GetRequestResponseEntityForList>(responseObject, HttpStatus.NO_CONTENT);
		}
	}
	@Override
	public ResponseEntity<?> stateUpdate(@PathVariable("id") String id,@RequestBody PatchRequestEntity<CurrencyVM, String> patchRequestEntity) {
		CurrencyVM currencyVM = (CurrencyVM) patchRequestEntity.data.attributes;
		HttpHeaders httpHeaders = new HttpHeaders();
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
				.getRequest();
		boolean success = false;
		try {
			success = currencyService.stateUpdate(currencyVM, id,request.getHeader("user"));
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.NO_CONTENT);
		}
		if (success) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
