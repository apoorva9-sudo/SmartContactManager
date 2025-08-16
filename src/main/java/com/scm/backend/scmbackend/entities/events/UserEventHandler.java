package com.scm.backend.scmbackend.entities.events;

import com.scm.backend.scmbackend.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;
import java.util.UUID;


@Component
@RepositoryEventHandler(User.class)
public class UserEventHandler {

    private Logger log= LoggerFactory.getLogger(UserEventHandler.class);

    @HandleAfterCreate
    public void handleBeforeCreate(User user)
    {
        log.info("going to create user");
        user.setId(UUID.randomUUID().toString());

    }
}
