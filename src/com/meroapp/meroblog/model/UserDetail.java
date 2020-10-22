/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meroapp.meroblog.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author stim
 */
@Entity
@Table(name="user_detail")
public class UserDetail implements Serializable {
    
    private static final long serialVersionUID = 555555L;
    
    @Id                             
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ud_id")
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private long mobile;
    private LocalDate dob;
    private String image;
    private String username;
    private String password;
    private String active;
    @Transient
    private String authority;
    
    @OneToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL, mappedBy="userDetail")
    private UserRole userRole;

    public UserDetail() {
    }

    public UserDetail(int id, String firstName, String lastName, String email, long mobile, LocalDate dob, String image, String username, String password, String active, String authority, UserRole userRole) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.dob = dob;
        this.image = image;
        this.username = username;
        this.password = password;
        this.active = active;
        this.authority = authority;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobile=" + mobile + ", dob=" + dob + ", image=" + image + ", username=" + username + ", password="
				+ password + ", active=" + active + ", authority=" + authority + ", userRole=" + userRole + "]";
	}
    
    
   
}
