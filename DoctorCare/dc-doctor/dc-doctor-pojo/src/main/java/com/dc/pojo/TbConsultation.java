package com.dc.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbConsultation  implements Serializable {
       private int conId;
       private int uId;
       private Date condate;
       private String conTitle;
       private String conInfo;

    public int getConId() {
        return conId;
    }

    public void setConId(int conId) {
        this.conId = conId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public Date getCondate() {
        return condate;
    }

    public void setCondate(Date condate) {
        this.condate = condate;
    }

    public String getConTitle() {
        return conTitle;
    }

    public void setConTitle(String conTitle) {
        this.conTitle = conTitle;
    }

    public String getConInfo() {
        return conInfo;
    }

    public void setConInfo(String conInfo) {
        this.conInfo = conInfo;
    }

    @Override
    public String toString() {
        return "TbConsultation{" +
                "conId=" + conId +
                ", uId=" + uId +
                ", condate=" + condate +
                ", conTitle='" + conTitle + '\'' +
                ", conInfo='" + conInfo + '\'' +
                '}';
    }
}
