package com.rms.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.rms.data.Currency;
import com.rms.data.OLCMStates;
import com.rms.domain.olm.CurrencyVM;
import com.rms.utility.common.Request;


public class Converter {

	public static Currency getCurrency(CurrencyVM currencyVM, Request request, String userId) {
		if (currencyVM != null && currencyVM.getName() != null) {
			Currency currency = new Currency();
			currency.setCode(currencyVM.getCode());
			currency.setName(currencyVM.getName());
			currency.setOlcmStates(new OLCMStates(currencyVM.getOlcmState().getId()));
			switch (request) {
			case POST:
				currency.setId(currencyVM.getId());
				currency.setFunction(currencyVM.getFunction());
				currency.setLocation(currencyVM.getLocation());
				currency.setCreatedAt(new Date().getTime());
				currency.setCreatedBy(userId);
				currency.setUpdatedAt(new Date().getTime());
				currency.setUpdatedBy(userId);
				break;
			case PUT:

				currency.setId(currencyVM.getId());
				currency.setCreatedAt(currencyVM.getCreatedAt());
				currency.setCreatedBy(currencyVM.getCreatedBy());
				currency.setUpdatedAt(new Date().getTime());
				currency.setUpdatedBy(userId);
				break;
			case PATCH:
				currency.setId(currencyVM.getId());
				currency.setCreatedAt(currencyVM.getCreatedAt());
				currency.setCreatedBy(currencyVM.getCreatedBy());
				currency.setUpdatedAt(new Date().getTime());
				currency.setUpdatedBy(userId);
				break;
			default:
				break;
			}
			return currency;

		}
		return null;
	}

	public static List<CurrencyVM> getCurrencyVMList(List<Currency> currencyList) {
		List<CurrencyVM> currencyVMList=new ArrayList<>();
		currencyList.stream().forEach(currency->{
			currencyVMList.add(getCurrencyVM(currency));
		});
		return currencyVMList;
	}

	public static CurrencyVM getCurrencyVM(Currency currency) {
		if (currency != null && currency.getName() != null) {
			CurrencyVM currencyVM = new CurrencyVM();
			currencyVM.setCode(currency.getCode());
			currencyVM.setName(currency.getName());
			currencyVM.setId(currency.getId());
		//	currencyVM.setOlcmState(new OLCMStatesVM(currencyVM.getOlcmState().getId()));
			return currencyVM;
		}
		// TODO Auto-generated method stub
		return null;
	}

}
