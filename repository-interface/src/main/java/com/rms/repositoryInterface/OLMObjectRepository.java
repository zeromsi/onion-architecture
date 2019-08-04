package com.rms.repositoryInterface;

import java.util.List;

import com.rms.domain.olm.CurrencyVM;

public interface OLMObjectRepository <T,I> extends CoreRepository<T, I>{
	T stateUpdate(T t, I id,String userId) throws Exception;	
	List<CurrencyVM> findAllByFunctionListAndLocationListAndStateList(List<Long> functionIdList,
			List<Long> locationIdList, List<Long> stateList);
}