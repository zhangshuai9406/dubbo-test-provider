package com.jk.service;

import java.util.List;

import com.jk.model.Role;

public interface RoleService {

	List<Role> roles() throws Exception;

	void updaterole(String roleid, Integer ygid) throws Exception;


}
