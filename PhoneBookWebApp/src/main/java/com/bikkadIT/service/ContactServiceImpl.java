package com.bikkadIT.service;

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

}
