package com.etc.cooperatework.entity;

public class Employee {
    private Integer eid;

    private String ename;

    private String epwd;

    private String introduction;

    private String hobby;

    private String phone;

    private String share;

    private String depart;

    private String role;

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(Integer eid, String ename, String epwd,
                    String introduction, String hobby, String phone, String share,
                    String depart, String role) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.epwd = epwd;
        this.introduction = introduction;
        this.hobby = hobby;
        this.phone = phone;
        this.share = share;
        this.depart = depart;
        this.role = role;
    }

    public Employee(String ename, String epwd, String introduction,
                    String hobby, String phone, String share, String depart,
                    String role) {
        super();
        this.ename = ename;
        this.epwd = epwd;
        this.introduction = introduction;
        this.hobby = hobby;
        this.phone = phone;
        this.share = share;
        this.depart = depart;
        this.role = role;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getEpwd() {
        return epwd;
    }

    public void setEpwd(String epwd) {
        this.epwd = epwd == null ? null : epwd.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share == null ? null : share.trim();
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", ename=" + ename + ", epwd=" + epwd
                + ", introduction=" + introduction + ", hobby=" + hobby
                + ", phone=" + phone + ", share=" + share + ", depart="
                + depart + ", role=" + role + "]";
    }

}