package com.malli.phonebook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.malli.phonebook.bindings.Contact;
import com.malli.phonebook.services.ContactService;

@RestController
public class PhonebookController {

	@Autowired
	ContactService contactService;

	@GetMapping("/srirama")
	public String test() {
		return "srirama";
	}

	@PostMapping("/createContact")
	public String createContact(@RequestBody Contact contact) {
		return contactService.saveContact(contact);

	}

	@GetMapping("/getAllContact")
	public List<Contact> getAllContact() {
		return contactService.getAllContact();

	}
	

}
