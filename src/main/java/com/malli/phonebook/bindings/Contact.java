package com.malli.phonebook.bindings;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Contact {


@Id
@GeneratedValue	
Integer	contactID;
String contactName;
String contactEmail;
String contactNumber;
String isActive;
LocalDate createdDate ;
LocalDate updatedDate ;
}
