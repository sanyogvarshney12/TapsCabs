package com.travel.tapscabs.dao;

import com.travel.tapscabs.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @implNote Interface to communicate UserRegistration details in DB.
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationDao extends JpaRepository<UserDetails, String> {
}
