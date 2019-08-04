package com.rms.data.repository.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.data.Currency;
import com.rms.data.OLCMStates;
import com.rms.data.repository.CurrencyRDMSRepository;
import com.rms.domain.olm.CurrencyVM;
import com.rms.mapper.Converter;
import com.rms.repositoryInterface.CurrencyRepository;
import com.rms.utility.common.Request;
import com.rms.utility.common.StatusFlag;

@Service
public class CurrencyRepositoryImplementation implements CurrencyRepository<CurrencyVM, String>{

	@Autowired
	CurrencyRDMSRepository currencyRDMSRepository;

	
	@Override
	public CurrencyVM save(CurrencyVM currencyVM, String userId) {
		try {
			Currency currency = Converter.getCurrency(currencyVM, Request.POST, userId);
			currency.setId(currencyVM.getId());
			return Converter.getCurrencyVM(currencyRDMSRepository.save(currency));
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public CurrencyVM findById(String id) {
		try {
			return Converter.getCurrencyVM(currencyRDMSRepository.findById(id).orElse(null));
		}catch(Exception e) {
			
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CurrencyVM> findAll() {
		return Converter.getCurrencyVMList(currencyRDMSRepository.findAllByFlag(StatusFlag.A.toString()));
	}
	
	@Override
	public CurrencyVM stateUpdate(CurrencyVM currencyVM, String id, String userId) throws Exception {
		Currency currency = new Currency();
		try {
			currency = currencyRDMSRepository.getOne(id);
			currency.setOlcmStates(new OLCMStates(currencyVM.getOlcmState().getId()));
			return Converter.getCurrencyVM(currencyRDMSRepository.save(currency));
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<CurrencyVM> findAllByFunctionListAndLocationListAndStateList(List<Long> functionIdList,
			List<Long> locationIdList, List<Long> stateList) {
		List<CurrencyVM> currencyVMList = null;
		try {
			currencyVMList = Converter.getCurrencyVMList(currencyRDMSRepository
					.findAllByFunctionListAndLocationListAndStateList(functionIdList, locationIdList, stateList));
		} catch (Exception e) {

		}

		return currencyVMList;
	}

	

}
