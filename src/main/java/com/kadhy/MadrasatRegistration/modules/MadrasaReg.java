package com.kadhy.MadrasatRegistration.modules;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MadrasaReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long madId;
    private String name;
    private String street;
    private String shehia;
    private String district;
    private String region;
    private String regYear;
    private String headTeacher;
    private String assisTeacher;
    private String katibu;
    private String accountant;
    @ManyToOne
    private Status stsId;
    @OneToOne
    private UserCredintial userId;
//    @OneToOne
//    private MadReport repotId;
    public MadrasaReg() {
    }

    public MadrasaReg(String name, String street, String shehia, String district, String region, String regYear, String headTeacher, String assisTeacher, String katibu, String accountant) {
        this.name = name;
        this.street = street;
        this.shehia = shehia;
        this.district = district;
        this.region = region;
        this.regYear = regYear;
        this.headTeacher = headTeacher;
        this.assisTeacher = assisTeacher;
        this.katibu = katibu;
        this.accountant = accountant;
    }

    public Long getMadId() {
        return madId;
    }

    public void setMadId(Long madId) {
        this.madId = madId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getShehia() {
        return shehia;
    }

    public void setShehia(String shehia) {
        this.shehia = shehia;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegYear() {
        return regYear;
    }

    public void setRegYear(String regYear) {
        this.regYear = regYear;
    }

    public String getHeadTeacher() {
        return headTeacher;
    }

    public void setHeadTeacher(String headTeacher) {
        this.headTeacher = headTeacher;
    }

    public String getAssisTeacher() {
        return assisTeacher;
    }

    public void setAssisTeacher(String assisTeacher) {
        this.assisTeacher = assisTeacher;
    }

    public String getKatibu() {
        return katibu;
    }

    public void setKatibu(String katibu) {
        this.katibu = katibu;
    }

    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }
}
