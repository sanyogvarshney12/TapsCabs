package com.travel.tapscabs.service;

import com.travel.tapscabs.dao.IUserRegistrationDao;
import com.travel.tapscabs.exception.UserDoesNotExistException;
import com.travel.tapscabs.logger.TapsCabsApplicationLogger;
import com.travel.tapscabs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @implNote UserRegistration Service class
 * @author Sanyog Varshney
 * @version 1.0
 */
@Service
public class UserRegistrationServiceImpl implements IUserRegistrationService {

    private TapsCabsApplicationLogger LOG = new TapsCabsApplicationLogger();
    private static final String CLASSNAME = UserRegistrationServiceImpl.class.getSimpleName();

    @Autowired
    private IUserRegistrationDao dao;

    /**
     *
     * @param userRegistration
     * @return saved UserRegistration object
     */
    @Override
    public User addUser(User userRegistration) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, " addUser() ", "Started");
        }
        return dao.save(userRegistration);
    }

    /**
     *
     * @param emailId
     * @return saved UserRegistration object if exists, else throws UserDoesNotExistException
     */
    @Override
    public User fetchUser(String emailId) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, " fetchUser() ", "Started");
        }
        User userRegistration = Optional.of(dao.getById(emailId))
                .orElseThrow(() -> new UserDoesNotExistException(emailId, "This user does not exiust in the System."));
        return userRegistration;
    }

    /**
     *
     * @param emailId
     * @param userName
     * @param mobileNo
     * @return updated UserRegistration Object
     */
    @Override
    public User updateUser(String emailId, String userName, long mobileNo) {
        if (LOG.isInfoEnabled()) {
            LOG.info(CLASSNAME, " updateUser() ", "Started");
        }
        User userRegistration = dao.getById(emailId);
        if (userName != null && mobileNo != 0) {
            userRegistration.setUserName(userName);
            userRegistration.setMobileNo(mobileNo);
        } else if (userName != null && mobileNo == 0) {
            userRegistration.setUserName(userName);
        } else if (userName == null && mobileNo != 0) {
            userRegistration.setMobileNo(mobileNo);
        } else {
            LOG.trace(CLASSNAME, " updateUser ", "Nothing to update.");
        }
        return dao.save(userRegistration);
    }
}
