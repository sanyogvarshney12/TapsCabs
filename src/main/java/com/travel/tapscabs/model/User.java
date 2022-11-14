package com.travel.tapscabs.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @implNote JPA Entity containing all the User Registration details.
 * @author Sanyog Varshney
 * @version 1.0
 */
@Entity
public class User implements Serializable {

    @Id
    private long mobileNo;
    @Column(nullable = false)
    private String emailId;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    private String location;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = { @JoinColumn(name = "mobile_no", referencedColumnName = "mobileNo")},
            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> address;

    private List<Role> roles = new ArrayList<>();

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
