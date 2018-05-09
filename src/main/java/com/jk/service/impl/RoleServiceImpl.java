package com.jk.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.RoleDao;
import com.jk.model.Role;
import com.jk.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao;

	public List<Role> roles() throws Exception {
		
		return roleDao.roles();
	}

	public void updaterole(String roleids,Integer ygid) throws Exception {
		
		roleDao.deleterole(ygid);
		String[] ids = roleids.split(",");
		//定义集合接受前台传递的参数
		List<Map<String,Object>> map =new ArrayList<Map<String, Object>>();
		 
		//循环字符串数组
		for (int i = 0; i < ids.length; i++) {
			Map<String,Object> maps=new HashMap<String, Object>();
			
			maps.put("ygid", ygid);
			maps.put("roleid", Integer.parseInt(ids[i].trim() ));
			map.add(maps);
		}
		roleDao.updaterole(map);
	
	}


}
