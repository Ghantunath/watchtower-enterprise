package com.watchtower.controller;

import com.watchtower.model.Contact;
import com.watchtower.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contact")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.save(contact);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/search")
    public Contact searchByPhone(
            @RequestParam String phone
    ) {
        return contactService.findByPhone(phone);
    }
}
