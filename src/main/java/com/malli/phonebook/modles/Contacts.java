package com.malli.phonebook.modles;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "CONTACT_DTLS")
public class Contacts {

	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID")
	Integer contactID;
	@Column(name = "CONTACT_NAME")
	String contactName;
	@Column(name = "CONTACT_EMAIL")
	String contactEmail;
	@Column(name = "CONTACT_NUMBER")
	String ContactNumber;
	@Column(name = "CONTACT_DELETED")
	String isActive;
	@Column(name = "CREATED_DATE")
	LocalDate createdDate;

	@CreationTimestamp
	@Column(name = "UPDATED_DATE")
	LocalDate updatedDate;

}
