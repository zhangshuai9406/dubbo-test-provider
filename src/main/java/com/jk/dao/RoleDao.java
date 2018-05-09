package com.jk.dao;

import java.util.List;
import java.util.Map;


import com.jk.model.Role;

public interface RoleDao {

	List<Role> roles() throws Exception;

	void deleterole(int ygid) throws Exception;

	void updaterole(List<Map<String, Object>> map) throws Exception;



}
