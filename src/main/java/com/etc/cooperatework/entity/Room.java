package com.etc.cooperatework.entity;

public class Room {
    private Integer rid;

    private String rstatus;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRstatus() {
        return rstatus;
    }

    public void setRstatus(String rstatus) {
        this.rstatus = rstatus == null ? null : rstatus.trim();
    }
}