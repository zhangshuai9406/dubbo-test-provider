package com.jk.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

public class YuanGong implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5043208385606371236L;

	private Integer ygid;
	
	private String ygname;
	
	private String ygsex;
	
	private Date ygdate;
	
	private String ygaddress;
	
	private String ygphone;
	
	private Set<String> resources = new HashSet<String>();
	    
	private Set<Role> roles=new HashSet<Role>();
	
	private String loginname;
	
	private String pwd;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getYgname() {
		return ygname;
	}

	public void setYgname(String ygname) {
		this.ygname = ygname;
	}

	public Integer getYgid() {
		return ygid;
	}

	public void setYgid(Integer ygid) {
		this.ygid = ygid;
	}

	public String getYgsex() {
		return ygsex;
	}

	public void setYgsex(String ygsex) {
		this.ygsex = ygsex;
	}

	public Date getYgdate() {
		return ygdate;
	}

	public void setYgdate(Date ygdate) {
		this.ygdate = ygdate;
	}

	public String getYgaddress() {
		return ygaddress;
	}

	public void setYgaddress(String ygaddress) {
		this.ygaddress = ygaddress;
	}

	public String getYgphone() {
		return ygphone;
	}

	public void setYgphone(String ygphone) {
		this.ygphone = ygphone;
	}

	public Set<String> getResources() {
		return resources;
	}

	public void setResources(Set<String> resources) {
		this.resources = resources;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "YuanGong [ygid=" + ygid + ", ygname=" + ygname + ", ygsex="
				+ ygsex + ", ygdate=" + ygdate + ", ygaddress=" + ygaddress
				+ ", ygphone=" + ygphone + ", resources=" + resources
				+ ", roles=" + roles + ", loginname=" + loginname + ", pwd="
				+ pwd + "]";
	}


	
	
	
}
