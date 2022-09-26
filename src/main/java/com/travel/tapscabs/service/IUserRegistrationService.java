package com.travel.tapscabs.service;

import com.travel.tapscabs.model.UserDetails;

/**
 * @implNote UserRegistration Service interface
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationService {

    UserDetails addUser(UserDetails userRegistration);

    UserDetails fetchUser(String emailId);

    UserDetails updateUser(String emailId, String userName, long mobileNo);

}
