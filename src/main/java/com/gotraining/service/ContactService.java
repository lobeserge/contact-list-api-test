package com.gotraining.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gotraining.model.Contact;
import com.gotraining.repository.ContactRepository;

@Service
public class ContactService {
    
	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact> getAllContacts(){
       List<Contact> contacts = contactRepository.findAll();
	    return contacts;
	}
	
	
}
