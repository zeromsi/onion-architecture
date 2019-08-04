package com.rms.utility.helper;

import java.io.IOException;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rms.utility.common.RequestBodyForHierarchyVM;
import com.rms.utility.common.ResponseObjectForHierarchyList;

public class ServiceHelper {


	public static ResponseObjectForHierarchyList getHierarchyListFromTreeEngine(RequestBodyForHierarchyVM request,
			String functionalHierarchyURL) {

		HttpHeaders header = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		ResponseObjectForHierarchyList functionalHierarchy = new ResponseObjectForHierarchyList();
		String response = restTemplate.postForObject(functionalHierarchyURL,
				request, String.class);
		try {
			functionalHierarchy = mapper.readValue(response, ResponseObjectForHierarchyList.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return functionalHierarchy;
	}
}
