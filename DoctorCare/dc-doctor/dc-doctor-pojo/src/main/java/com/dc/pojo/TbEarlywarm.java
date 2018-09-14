package com.dc.pojo;

import java.util.Date;

public class TbEarlywarm {
    private  int    ewId;
    private  int    uId;
    private Date    ewTime;
    private  String  ewType;
    private  String   ewName;
    private  String   ewInfo;
    private  float  ewMax;
    private  float  ewMin;

    public int getEwId() {
        return ewId;
    }

    public void setEwId(int ewId) {
        this.ewId = ewId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public Date getEwTime() {
        return ewTime;
    }

    public void setEwTime(Date ewTime) {
        this.ewTime = ewTime;
    }

    public String getEwType() {
        return ewType;
    }

    public void setEwType(String ewType) {
        this.ewType = ewType;
    }

    public String getEwName() {
        return ewName;
    }

    public void setEwName(String ewName) {
        this.ewName = ewName;
    }

    public String getEwInfo() {
        return ewInfo;
    }

    public void setEwInfo(String ewInfo) {
        this.ewInfo = ewInfo;
    }

    public float getEwMax() {
        return ewMax;
    }

    public void setEwMax(float ewMax) {
        this.ewMax = ewMax;
    }

    public float getEwMin() {
        return ewMin;
    }

    public void setEwMin(float ewMin) {
        this.ewMin = ewMin;
    }

    @Override
    public String toString() {
        return "TbEarlywarm{" +
                "ewId=" + ewId +
                ", uId=" + uId +
                ", ewTime=" + ewTime +
                ", ewType='" + ewType + '\'' +
                ", ewName='" + ewName + '\'' +
                ", ewInfo='" + ewInfo + '\'' +
                ", ewMax=" + ewMax +
                ", ewMin=" + ewMin +
                '}';
    }
}
