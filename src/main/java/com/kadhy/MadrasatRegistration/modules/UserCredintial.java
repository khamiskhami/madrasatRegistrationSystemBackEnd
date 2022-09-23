package com.kadhy.MadrasatRegistration.modules;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Data
public class UserCredintial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
//    private String fullName;
//    private String madrasaName;
    private String phoneNumber;
    private String password;
//    private String startYear;

    public UserCredintial() {
    }

    public UserCredintial(String phoneNumber, String password) {
//        this.fullName = fullName;
//        this.madrasaName = madrasaName;
        this.phoneNumber = phoneNumber;
        this.password = password;
//        this.startYear = startYear;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getMadrasaName() {
//        return madrasaName;
//    }

//    public void setMadrasaName(String madrasaName) {
//        this.madrasaName = madrasaName;
//    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getStartYear() {
//        return startYear;
//    }
//
//    public void setStartYear(String startYear) {
//        this.startYear = startYear;
//    }

}
