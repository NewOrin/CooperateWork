package com.etc.cooperatework.entity;

import java.util.Date;

public class Message {
    private Integer mid;

    private Integer eidSend;

    private Integer ifsend;

    private Integer targetId;

    private Date stime;

    private Date replyTime;

    private String replyContent;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getEidSend() {
        return eidSend;
    }

    public void setEidSend(Integer eidSend) {
        this.eidSend = eidSend;
    }

    public Integer getIfsend() {
        return ifsend;
    }

    public void setIfsend(Integer ifsend) {
        this.ifsend = ifsend;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}