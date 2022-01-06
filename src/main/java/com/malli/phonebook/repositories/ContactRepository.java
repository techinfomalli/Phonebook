package com.malli.phonebook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.malli.phonebook.modles.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Integer> {

}
