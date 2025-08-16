package com.scm.backend.scmbackend.repository;

import com.scm.backend.scmbackend.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import org.springframework.data.domain.Pageable;
import java.util.List;


@RepositoryRestResource(path="contacts",collectionResourceRel = "contacts")
//"user-contacts": {
//            "href": "http://localhost:8080/user-contacts{?page,size,sort*}",
//            "templated": true
// the above collectionResourceRel has changed the url in the postman  output
//path param is the path which given when data retrieval in postman
public interface ContactRepository extends JpaRepository<Contact,String> {
//  /contacts/search/email ?email=abc@gmail.cm// the /search is default


    @RestResource(path="by-email")
    List<Contact> findByEmail(@Param("email") String email,Pageable pageable);

    @RestResource(path="by-phone",rel="by-phone")
    List<Contact> findByPhoneNumber(@Param("phone") String phoneNumber,Pageable pageable);

    @RestResource(path="by-name")
    List<Contact> findByNameContainingIgnoreCase(@Param("name") String name,Pageable pageable);


}
