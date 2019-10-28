package com.gotraining.test.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gotraining.model.Contact;
import com.gotraining.repository.ContactRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContactRepositoryTest {

	@Autowired
	private ContactRepository contactRepository;
	
	@Test
	public void Find_All_ContactTest() {
		List<Contact> contacts = contactRepository.findAll();
		assertEquals(2,contacts.size());
	}
	
	@Test
	public void Find_One_ContactTest() {
		Contact contact = contactRepository.findById(1).get();
		assertEquals("lobe serge",contact.getName());
		assertEquals(651930365,contact.getPhonenumber());
		
	}
	
}
