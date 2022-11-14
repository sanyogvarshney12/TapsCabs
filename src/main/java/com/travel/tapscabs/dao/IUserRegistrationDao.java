package com.travel.tapscabs.dao;

import com.travel.tapscabs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @implNote Interface to communicate UserRegistration details in DB.
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationDao extends JpaRepository<User, String> {
}
