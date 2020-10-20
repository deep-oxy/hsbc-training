package com.demo.spring;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.demo.spring.entity.Emp;

public class GETClient {

	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> respnse = rt.getForEntity("http://localhost:8080/emp/find/" + 107, String.class);
		System.out.println(respnse.getBody());

		// getting the individual attributes of the data
		ResponseEntity<Emp> response1 = rt.getForEntity("http://localhost:8080/emp/find/" + 107, Emp.class);
		System.out.println(response1.getBody().getName());

		// ----------------------------------------------------------------//

		// Http header
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		// headers.set("Accept", MediaType.APPLICATION_XML_VALUE);

		// Http Body
		HttpEntity httpRequest = new HttpEntity<>(headers);

		ResponseEntity<Emp> response2 = rt.exchange("http://localhost:8080/emp/find/" + 107, HttpMethod.GET,
				httpRequest, Emp.class);

		System.out.println(response2.getBody().getName());
	}

}
