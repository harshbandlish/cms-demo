package com.cms.demo.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CmsHTTPClientImpl implements CmsHTTPClient {

	@Override
	public String getCMSContent() {
		String responseAsString;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("https://sp10050f63.guided.ss-omtrdc.net/?sp_cs=UTF-8&type=search&q=cirque", String.class);
		if(response.getStatusCode() == HttpStatus.OK) {
			responseAsString = response.getBody();
		}else {
			responseAsString = "Error with status code : " + response.getStatusCode();
		}
		return responseAsString;
	}

}
