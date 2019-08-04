package com.rms.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.rms.utility.common.RequestBoyForOLMObjectsRecords;
import com.rms.utilityrequest.patch.PatchRequestEntity;
import com.rms.utilityrequest.post.PostRequestEntity;

public interface CoreController<T, I> {
	@PostMapping
	public ResponseEntity<?> save(PostRequestEntity<T, I> postRequestEntity);

	@GetMapping
	ResponseEntity<?> findAll();

	@PostMapping("/findAll")
	ResponseEntity<?> findAll(RequestBoyForOLMObjectsRecords request);

	@PatchMapping("/{id}")
	ResponseEntity<?> stateUpdate(I id, PatchRequestEntity<T, String> patchRequestEntity);

}