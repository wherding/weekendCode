package com.corporate.user;

import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository {
    List<User> findByFirstName(@Param("firstName") String fullName);
    List<User> findByLastName(@Param("lastName") String fullName);
    List<User> findByPassword(@Param("password") String password);
    List<User> findByEmailAddress(@Param("emailAddress") String emailAddress);
    List<User> findByPhoneNumber(@Param("phoneNumber") String phoneNumber);
}
