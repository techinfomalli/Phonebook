package com.malli.phonebook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.malli.phonebook.bindings.Contact;
import com.malli.phonebook.modles.Contacts;
import com.malli.phonebook.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepo;

	public String saveContact(Contact contact) {
		Contacts contacts = new Contacts();
		BeanUtils.copyProperties(contact, contacts);
		contacts = contactRepo.save(contacts);
		if (contacts.getContactID() != null) {
			return "Contact Saved successfylly.";
		} else {
			return "Contact Not Saved.";
		}
	}

	public List<Contact> getAllContact() {
		List<Contacts> allContacts = new ArrayList<Contacts>();
		List<Contact> allContact = new ArrayList<Contact>();
		allContacts = contactRepo.findAll();
		for (Contacts contacts : allContacts) {
			Contact contact = new Contact();
			BeanUtils.copyProperties(contacts, contact);
			allContact.add(contact);
		}
		return allContact;
	}
}
