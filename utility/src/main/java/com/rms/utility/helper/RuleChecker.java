package com.rms.utility.helper;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public class RuleChecker {

	public static long getStateId(Object object, String url) {

		HttpHeaders header = new HttpHeaders();
		RestTemplate restTemplate = new RestTemplate();
		try {
			Long response = restTemplate.postForObject(url, object, Long.class);
			return response;
		}catch(Exception e) {
			return 0;
		}
	}


}
