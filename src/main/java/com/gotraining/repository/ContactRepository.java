package com.gotraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gotraining.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer>{
	
}
