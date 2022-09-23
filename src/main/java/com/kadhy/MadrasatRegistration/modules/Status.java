package com.kadhy.MadrasatRegistration.modules;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stsId;
    private String notApprove;
    private String approved;
    private String pending;

    public Status() {
    }

    public Status(String notApprove, String approved, String pending) {
        this.notApprove = notApprove;
        this.approved = approved;
        this.pending = pending;
    }

    public Long getStsId() {
        return stsId;
    }

    public void setStsId(Long stsId) {
        this.stsId = stsId;
    }

    public String getNotApprove() {
        return notApprove;
    }

    public void setNotApprove(String notApprove) {
        this.notApprove = notApprove;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }
}
