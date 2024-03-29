package com.gotraining.test.integrationtest;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ContactApplicationIT {
	
	@Autowired
	private TestRestTemplate restTemplate;
	@Test
	public void contextLoads() throws JSONException {	
		
		String response = this.restTemplate.getForObject("/contacts", String.class);
		
		JSONAssert.assertEquals("[{id:1},{id:2}]", 
				response, false);
	}

}
