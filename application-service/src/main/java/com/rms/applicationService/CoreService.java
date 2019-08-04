package com.rms.applicationService;

import java.util.List;


/**
 * Interface: CoreService
 * <p>Responsibilities:Core operations.</p>            
 */
public interface CoreService<T,Object>{		
	/**
	 * Method: save                          
	 * <p>
	 * Parameters:[T object] 
	 * </p>
	 * <p>
	 * Responsibility:Saves object to database
	 * </p>
	 * @throws Exception 
	 */
	Boolean save(T object,String userId) throws Exception;

	
	/**
	 * Method: findAll                          
	 * <p>
	 * Parameters:[] 
	 * </p>
	 * <p>
	 * Responsibility:Returns object List from database
	 * </p>
	 */
	List<T> findAll();
	
	/**
	 * Method: findById                          
	 * <p>
	 * Parameters:[Object id] 
	 * </p>
	 * <p>
	 * Responsibility:Returns object from database
	 * </p>
	 */
	T findById(Object id);
	
	
	
	Boolean stateUpdate(T t, Object id,String userId) throws Exception;	
	List<T> findByStateListAndRoleListAndDefaultLocationAndFunction(Long classTypeId, List<Long> stateList,
			Long defaultFunction, Long defaultLocation, List<Long> roleList);
	
}
