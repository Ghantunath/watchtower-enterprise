package com.watchtower.repository;

import com.watchtower.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository
        extends JpaRepository<Contact, Long> {

    Contact findByPhone(String phone);
}
