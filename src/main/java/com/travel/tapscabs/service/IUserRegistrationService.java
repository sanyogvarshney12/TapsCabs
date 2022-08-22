package com.travel.tapscabs.service;

import com.travel.tapscabs.model.UserRegistration;

/**
 * @implNote UserRegistration Service interface
 * @author Sanyog Varshney
 * @version 1.0
 */
public interface IUserRegistrationService {

    UserRegistration addUser(UserRegistration userRegistration);

    UserRegistration fetchUser(String emailId);

    UserRegistration updateUser(String emailId, String userName, long mobileNo);

}
