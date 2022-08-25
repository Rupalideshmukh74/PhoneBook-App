package com.bikkadIT.repository;

import org.springframework.stereotype.Repository;

import com.bikkadIT.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository

public interface ContactRepository extends JpaRepository<Contact,Integer>{
	
	
}