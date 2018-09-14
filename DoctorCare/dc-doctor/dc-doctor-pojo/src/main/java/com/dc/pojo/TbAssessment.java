package com.dc.pojo;

import java.util.Date;

public class TbAssessment {
     private int  assId;
     private int  uId;
     private Date addDate;
     private String state;
     private String assment;
     private String proposal;

    public int getAssId() {
        return assId;
    }

    public void setAssId(int assId) {
        this.assId = assId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAssment() {
        return assment;
    }

    public void setAssment(String assment) {
        this.assment = assment;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    @Override
    public String toString() {
        return "TbAssessment{" +
                "assId=" + assId +
                ", uId=" + uId +
                ", addDate=" + addDate +
                ", state='" + state + '\'' +
                ", assment='" + assment + '\'' +
                ", proposal='" + proposal + '\'' +
                '}';
    }
}
