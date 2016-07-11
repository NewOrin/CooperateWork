package com.etc.cooperatework.entity;

public class File {
    private Integer fid;

    private Integer eidFile;

    private String fname;

    private String fpath;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getEidFile() {
        return eidFile;
    }

    public void setEidFile(Integer eidFile) {
        this.eidFile = eidFile;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public String getFpath() {
        return fpath;
    }

    public void setFpath(String fpath) {
        this.fpath = fpath == null ? null : fpath.trim();
    }
}