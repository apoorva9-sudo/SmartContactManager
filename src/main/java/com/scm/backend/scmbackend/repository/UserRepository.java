package com.scm.backend.scmbackend.repository;

import com.scm.backend.scmbackend.entities.User;
import com.scm.backend.scmbackend.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = UserProjection.class)
//@RepositoryRestResource(exported = false) not to  give the api of this entity
public interface UserRepository extends JpaRepository<User,String> {
}
//{
//        "_links": {
//        "self": {
//        "href": "http://localhost:8080/api/users/u123456"
//        },
//        "user": {
//        "href": "http://localhost:8080/api/users/u123456{?projection}",
//        "templated": true
//        },
//        "contacts": {
//        "href": "http://localhost:8080/api/users/u123456/contacts"
//        }
//        },
//        "name": "Apoorva R",
//        "email": "apoorva@example.com",
//        "about": "Software developer and tech enthusiast."
//        }
// in this way the name email and about are projected in postman, where the intension is to have information with  little data