package com.gotraining.test.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.gotraining.model.Contact;
import com.gotraining.repository.ContactRepository;
import com.gotraining.service.ContactService;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ContactServiceTest {

	  @InjectMocks
	  private ContactService contactService;
	
	  @Mock
	  private ContactRepository contactRespository;
	  
	  @Before
	  public void init() {
		  MockitoAnnotations.initMocks(this);
	  }

	  @Test
	  public void retrieve_All_Contacts_Servcice_Test() throws Exception {
		  
		  List<Contact> expectedContacts=Arrays.asList(new Contact(1,"lobe nyoh",675595054),
					new Contact(2,"albert newton",651830365));
		  when(contactRespository.findAll()).thenReturn(expectedContacts);
		  
		  List<Contact> actualContacts=contactService.getAllContacts();
		  
		  assertThat(actualContacts).isEqualTo(expectedContacts);
		  
	  }
	  

}
