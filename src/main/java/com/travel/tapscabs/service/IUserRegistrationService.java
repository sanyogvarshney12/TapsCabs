package com.travel.tapscabs.service;

import com.travel.tapscabs.model.User;

/**
 * @implNote UserRegistration Service interface
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationService {

    User addUser(User userRegistration);

    User fetchUser(String emailId);

    User updateUser(String emailId, String userName, long mobileNo);

}
