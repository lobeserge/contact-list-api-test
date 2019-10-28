package com.gotraining.test.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.gotraining.controller.ContactController;
import com.gotraining.model.Contact;
import com.gotraining.service.ContactService;

@RunWith(SpringRunner.class)
@WebMvcTest(ContactController.class)
public class ContactControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ContactService contactService;
	
	@Test
	public void retrieve_All_Contacts_Test() throws Exception {
		when(contactService.getAllContacts()).thenReturn(
				Arrays.asList(new Contact(1,"lobe nyoh",675595054),
						new Contact(2,"albert newton",651830365)
				));
		RequestBuilder request = MockMvcRequestBuilders
				.get("/contacts")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{id:1,name:'lobe nyoh' ,phonenumber:675595054}, {id:2,name:'albert newton',phonenumber:651830365}]"))
				.andReturn();
				
	}
	

	@Test
	public void retrieve_None_Contacts_Test() throws Exception {
		when(contactService.getAllContacts()).thenReturn(
				Arrays.asList()
				);
		RequestBuilder request = MockMvcRequestBuilders
				.get("/contacts")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[]"))
				.andReturn();
				
	}
	
	
	
	
}
