package com.etc.cooperatework.entity;

import java.util.Date;

public class Work {
    private Integer wid;

    private Integer eidWork;

    private Integer isdone;

    private Date wtime;

    private String wcontent;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getEidWork() {
        return eidWork;
    }

    public void setEidWork(Integer eidWork) {
        this.eidWork = eidWork;
    }

    public Integer getIsdone() {
        return isdone;
    }

    public void setIsdone(Integer isdone) {
        this.isdone = isdone;
    }

    public Date getWtime() {
        return wtime;
    }

    public void setWtime(Date wtime) {
        this.wtime = wtime;
    }

    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent == null ? null : wcontent.trim();
    }
}