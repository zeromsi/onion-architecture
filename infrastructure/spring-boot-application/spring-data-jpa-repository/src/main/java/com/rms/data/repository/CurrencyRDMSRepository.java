package com.rms.data.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rms.data.Currency;

@Repository
public interface CurrencyRDMSRepository  extends JpaRepository<Currency, String> {
	@Query("SELECT g FROM Currency g where g.olcmStates.id in (:stateList) and g.function in (:functionIdList) and g.location in (:locationIdList)")
	List<Currency> findAllByFunctionListAndLocationListAndStateList(@Param("functionIdList") List<Long> functionIdList,
			 @Param("locationIdList") List<Long> locationIdList, @Param("stateList") List<Long> stateList);
	
	@Query("SELECT g FROM Currency g where g.olcmStates.statusFlag =:statusFlag")
	List<Currency> findAllByFlag(@Param("statusFlag") String statusFlag);

}
