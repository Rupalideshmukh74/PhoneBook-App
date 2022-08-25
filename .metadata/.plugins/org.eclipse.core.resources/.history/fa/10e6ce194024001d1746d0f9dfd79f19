package com.bikkadIT.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.bikkadIT.model.Contact;
import com.bikkadIT.repository.ContactRepository;

public class ContactServiceImpl implements ContactServiceI {
	
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {
		
		Contact save = contactRepository.save(contact);
		if(save!=null) {
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> findAll = contactRepository.findAll();
		Stream<Contact> filter = findAll.stream().filter(contact->contact.getActiveSwitch()=='Y');		
		return filter.collect(Collectors.toList());
		
	
		
	}

	@Override
	public Contact getContactById(Integer cid) {
		Contact findById = contactRepository.findById(cid).get();
		return findById;
	
	}
	
	

}
