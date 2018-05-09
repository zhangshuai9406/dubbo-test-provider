package com.jk.model;

import java.io.Serializable;

/**
 *
 */
public class Role implements Serializable{

	private static final long serialVersionUID = 8591695861809493536L;
	private Integer roleid;
	
	private String rolename;
	
	private String rolejianjie;

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRolejianjie() {
		return rolejianjie;
	}

	public void setRolejianjie(String rolejianjie) {
		this.rolejianjie = rolejianjie;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename
				+ ", rolejianjie=" + rolejianjie + "]";
	}
	
	

}
