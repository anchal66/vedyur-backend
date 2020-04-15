package com.anchal.vedyur.dao;

import com.anchal.vedyur.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
