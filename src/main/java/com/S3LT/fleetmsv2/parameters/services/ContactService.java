package com.S3LT.fleetmsv2.parameters.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.S3LT.fleetmsv2.parameters.models.Contact;
import com.S3LT.fleetmsv2.parameters.repositories.ContactRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	//Get All Contacts
	public List<Contact> findAll(){
		return contactRepository.findAll();
	}	
	
	//Get Contact By Id
	public Contact findById(int id) {
		return contactRepository.findById(id).orElse(null);
	}	
	
	//Delete Contact
	public void delete(int id) {
		contactRepository.deleteById(id);
	}
	
	//Update Contact
	public void save( Contact contact) {
		contactRepository.save(contact);
	}

}
