package com.etc.cooperatework.entity;

public class Department {
	
    public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	private Integer did;

    private String dname;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}
}