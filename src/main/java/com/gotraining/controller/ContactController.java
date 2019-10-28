package com.gotraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gotraining.model.Contact;
import com.gotraining.service.ContactService;

@RestController
public class ContactController {
  @Autowired
  private ContactService contactService;
  
  
  @GetMapping("/contacts")
  public List<Contact> retrieveAllContacts(){
	  return contactService.getAllContacts();
  }
	
	
}
