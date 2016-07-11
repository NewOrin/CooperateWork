package com.etc.cooperatework.entity;

import java.util.Date;

public class Meeting {
    private Integer meid;

    private Integer eidMeeting;

    private Integer ridMeeting;

    private Date meTime;

    public Integer getMeid() {
        return meid;
    }

    public void setMeid(Integer meid) {
        this.meid = meid;
    }

    public Integer getEidMeeting() {
        return eidMeeting;
    }

    public void setEidMeeting(Integer eidMeeting) {
        this.eidMeeting = eidMeeting;
    }

    public Integer getRidMeeting() {
        return ridMeeting;
    }

    public void setRidMeeting(Integer ridMeeting) {
        this.ridMeeting = ridMeeting;
    }

    public Date getMeTime() {
        return meTime;
    }

    public void setMeTime(Date meTime) {
        this.meTime = meTime;
    }
}