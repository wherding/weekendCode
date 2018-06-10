package com.corporate.controller;

import com.corporate.contacts.Contact;
import com.corporate.contacts.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class Controller {

    @Autowired
    ContactRepository contactRepository;

    @PostMapping("/addContact")
    public Contact createContact(@Valid @RequestBody Contact contact) {

  /*      contact.setFullName(contact.getFullName());
        contact.setEmailAddress(contact.getEmailAddress());
        contact.setPhoneNumber(contact.getPhoneNumber());
        contact.setMessage(contact.getMessage());
        contact.setSubject(contact.getSubject());
*/
      //  contactRepository.save(contact);

        return contactRepository.save(contact);

    }

}
