package com.dc.pojo;

import java.util.Date;

public class TbCholesterol {
    private int choId;
    private int uId;
    private float cho;
    private Date choDate;
    private String choName;

    public int getChoId() {
        return choId;
    }

    public void setChoId(int choId) {
        this.choId = choId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public float getCho() {
        return cho;
    }

    public void setCho(float cho) {
        this.cho = cho;
    }

    public Date getChoDate() {
        return choDate;
    }

    public void setChoDate(Date choDate) {
        this.choDate = choDate;
    }

    public String getChoName() {
        return choName;
    }

    public void setChoName(String choName) {
        this.choName = choName;
    }

    @Override
    public String toString() {
        return "TbCholesterol{" +
                "choId=" + choId +
                ", uId=" + uId +
                ", cho=" + cho +
                ", choDate=" + choDate +
                ", choName='" + choName + '\'' +
                '}';
    }
}
