package com.jk.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.YuanGongDao;
import com.jk.model.Role;
import com.jk.model.YuanGong;
import com.jk.service.YuanGongService;
import com.jk.util.PageUtil;

@Service("userService")
public class YuanGongServiceImpl implements YuanGongService{
	
	@Autowired
	private YuanGongDao yuangongDao;

	public PageUtil<YuanGong> listyuangong(PageUtil<YuanGong> pageUtil)
			throws Exception {

		pageUtil.setTotal(yuangongDao.getCount());	
		
		pageUtil.setRows(yuangongDao.getList(pageUtil.getStart(),pageUtil.getPageSize()) );
		
		return pageUtil;
	}

	public YuanGong getResourcesRoleList(YuanGong yg) throws Exception {
		
		 Set<String> resources = new HashSet<String>();
		//定义新的集合接收数据库查询到数据
				Set<Role> roles =new HashSet<Role>();
				
				//查询数据库返回数据
				List<Map<String,Object>> listMap =yuangongDao.getResourcesRoleList(yg);
				
				//把查询结果循环
				for (Map<String, Object> map : listMap) {
					if(map.get("url")!=null && !"".equals(map.get("url"))){
						resources.add(map.get("url").toString());
					}
					
					Role r =new Role();
					r.setRolename(map.get("rolename").toString());
					r.setRoleid((Integer) map.get("roleid"));
					roles.add(r);
				}
				yg.setRoles(roles);
				yg.setResources(resources);
				return yg;
	}

	public YuanGong login(YuanGong yuangong) throws Exception {
		// TODO Auto-generated method stub
		return yuangongDao.login(yuangong);
	}




}
