package com.travel.tapscabs.controller;

import com.travel.tapscabs.logger.TapsCabsApplicationLogger;
import com.travel.tapscabs.model.User;
import com.travel.tapscabs.service.IUserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @implNote UserRegistration RestController class
 * @author Sanyog Varshney
 * @version 1.0
 */
@RestController
public class UserRegistrationController implements IUserRegistrationController {

    private static final String CLASSNAME = UserRegistrationController.class.getSimpleName();
    private TapsCabsApplicationLogger LOG = new TapsCabsApplicationLogger();
    @Autowired
    private IUserRegistrationService service;

    /**
     *
     * @param userRegistration
     * @return saved UserRegistration object
     */
    @Override
    public ResponseEntity<User> addUser(User userRegistration) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, " addUser()", " Started");
        }
        return new ResponseEntity<>(service.addUser(userRegistration), HttpStatus.OK);
    }

    /**
     *
     * @param emailId
     * @return User registration object if exists, else UserDoesNotExistException
     */
    @Override
    public ResponseEntity<User> fetchUser(String emailId) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, " fetchUser()", " Started");
        }
        return new ResponseEntity<>(service.fetchUser(emailId), HttpStatus.OK);
    }

    /**
     *
     * @param emailId
     * @param userName
     * @param mobileNo
     * @return updated saved UserRegistration object
     */
    @Override
    public ResponseEntity<User> updateUser(String emailId, String userName, long mobileNo) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, " updateUser()", " Started");
        }
        return new ResponseEntity<>(service.updateUser(emailId, userName, mobileNo), HttpStatus.OK);
    }
}
