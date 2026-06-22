package com.watchtower.service;

import com.watchtower.model.Contact;
import com.watchtower.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    public Contact findByPhone(String phone) {
        return repository.findByPhone(phone);
    }
}
