package com.travel.tapscabs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @implNote JPA Entity containing all the User Registration details.
 * @author Sanyog Varshney
 * @version 1.0
 */
@Entity
public class UserRegistration {

    @Id
    private String emailId;
    private String userName;
    private long mobileNo;
    private char[] password;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }
}
