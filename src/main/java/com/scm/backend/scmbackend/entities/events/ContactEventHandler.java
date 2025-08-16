package com.scm.backend.scmbackend.entities.events;

import com.scm.backend.scmbackend.entities.Contact;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RepositoryEventHandler(Contact.class)
public class ContactEventHandler {
    public void beforeSave(Contact contact)
    {
        contact.setId(UUID.randomUUID().toString());
    }
}


