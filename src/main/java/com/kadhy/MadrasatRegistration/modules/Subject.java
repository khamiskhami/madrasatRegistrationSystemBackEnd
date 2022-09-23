//package com.kadhy.MadrasatRegistration.modules;
//
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Data
//public class Subject {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long subId;
//    private String subName;
//    @ManyToMany
//    private List<MadrasaReg> madId;
//
//    public Subject() {
//    }
//
//    public Subject(String subName) {
//        this.subName = subName;
//    }
//
//    public Long getSubId() {
//        return subId;
//    }
//
//    public void setSubId(Long subId) {
//        this.subId = subId;
//    }
//
//    public String getSubName() {
//        return subName;
//    }
//
//    public void setSubName(String subName) {
//        this.subName = subName;
//    }
//}
