package com.corporate.contacts;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "contacts", path = "contacts")
public interface ContactRepository extends MongoRepository<Contact, String> {

    List<Contact> findByFullName(@Param("fullName") String fullName);
    List<Contact> findByEmailAddress(@Param("emailAddress") String emailAddress);
    List<Contact> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);
    List<Contact> findByMessage(@Param("message") String message);
    List<Contact> findBySubject(@Param("subject") String subject);
}
