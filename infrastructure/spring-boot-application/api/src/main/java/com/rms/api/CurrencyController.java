package com.rms.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rms.domain.olm.CurrencyVM;
import com.rms.utilityrequest.post.PostRequestEntity;

@RequestMapping("currencies")
public interface CurrencyController<T, Object> extends CoreController<T, Object> {

}
