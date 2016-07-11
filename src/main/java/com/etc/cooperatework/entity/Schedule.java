package com.etc.cooperatework.entity;

import java.util.Date;

public class Schedule {
    private Integer sid;

    private Integer eidSchedule;

    private Date sdate;

    private Integer agentid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getEidSchedule() {
        return eidSchedule;
    }

    public void setEidSchedule(Integer eidSchedule) {
        this.eidSchedule = eidSchedule;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }
}