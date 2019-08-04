package com.rms.utility.common;
import java.util.Date;
import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomResponse {

	public static ResponseEntity<?> response(String message, HttpStatus status, String url) {
		HashMap<String, String> response = new HashMap<String, String>();
		response.put("timestamp", new Date() + "");
		response.put("status", status.getReasonPhrase());
		response.put("error", "Bad request");
		response.put("message", message);
		response.put("path", url);
		return new ResponseEntity<HashMap>(response, status);
	}
}