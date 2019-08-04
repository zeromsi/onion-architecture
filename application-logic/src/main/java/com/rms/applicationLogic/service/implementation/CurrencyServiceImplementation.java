package com.rms.applicationLogic.service.implementation;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.rms.applicationService.CurrencyService;
import com.rms.domain.olm.CurrencyVM;
import com.rms.repositoryInterface.CurrencyRepository;
import com.rms.utility.common.HierarchyVM;
import com.rms.utility.common.RequestBodyForHierarchyVM;
import com.rms.utility.common.ResponseObjectForHierarchyList;
import com.rms.utility.helper.ServiceHelper;

@Service
public class CurrencyServiceImplementation implements CurrencyService<CurrencyVM, String>{
	
	@Autowired
	CurrencyRepository currencyRepository;

	
	@Autowired
	private Environment environment;
	
	public Boolean save(CurrencyVM currencyVM, String userId) throws Exception {
		try {
			currencyRepository.save(currencyVM, userId);
			return true;
		} catch (Exception e) {
			throw e;
		}
	}

	public List<CurrencyVM> findAll() {
		return currencyRepository.findAll();
	}

	public CurrencyVM findById(String id) {
		return (CurrencyVM) currencyRepository.findById(id);
	}

	public Boolean stateUpdate(CurrencyVM currencyVM, String id, String userId) throws Exception {
		try {
			currencyRepository.stateUpdate(currencyVM, id, userId);
		return true;
		}catch(Exception e) {
			throw e;
		}
	}

	public List<CurrencyVM> findByStateListAndRoleListAndDefaultLocationAndFunction(Long classTypeId,
			List<Long> stateList, Long defaultFunction, Long defaultLocation, List<Long> roleList) {
		
		RequestBodyForHierarchyVM request = new RequestBodyForHierarchyVM();
		request.setClassTypeId(classTypeId);
		request.setDefaultHierarchyId(defaultFunction);
		request.setRoleList(roleList);

		String functionalHierarchyURL = environment.getProperty("treeEngine.url")
				+ "/functionalHierarchies/getByDefalutFunctionAndRole";
		ResponseObjectForHierarchyList functionalHierarchy = new ResponseObjectForHierarchyList();
		functionalHierarchy = ServiceHelper.getHierarchyListFromTreeEngine(request, functionalHierarchyURL);
		List<Long> functionIdList = new ArrayList<>();
		for (int i = 0; i < functionalHierarchy.data.size(); i++) {
			HierarchyVM hierarchyVM = new HierarchyVM();
			hierarchyVM = (HierarchyVM) functionalHierarchy.data.get(i);
			functionIdList.add(Long.parseLong(hierarchyVM.getId().toString()));
		}

		request.setDefaultHierarchyId(defaultLocation);
		String locationHierarchyURL = environment.getProperty("treeEngine.url")
				+ "/locationHierarchies/getByDefalutLocationAndRole";
		ResponseObjectForHierarchyList locationHierarchy = new ResponseObjectForHierarchyList();
		locationHierarchy = ServiceHelper.getHierarchyListFromTreeEngine(request, locationHierarchyURL);

		List<Long> locationIdList = new ArrayList<>();
		for (int i = 0; i < locationHierarchy.data.size(); i++) {
			HierarchyVM hierarchyVM = new HierarchyVM();
			hierarchyVM = (HierarchyVM) locationHierarchy.data.get(i);
			locationIdList.add(Long.parseLong(hierarchyVM.getId().toString()));

		}
		

		return currencyRepository.findAllByFunctionListAndLocationListAndStateList(functionIdList, locationIdList, stateList);
	}

}
