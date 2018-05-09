package com.jk.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.TreeMapper;
import com.jk.model.Tree;
import com.jk.model.YuanGong;
import com.jk.service.TreeService;

@Service("treeService")
public class TreeServiceImpl implements TreeService{

	@Autowired
	private TreeMapper treeDao;

	public Tree querytree(String id) throws Exception {
		// TODO Auto-generated method stub
		return treeDao.querytree(id);
	}

	public void addtree(Tree tree) throws Exception {
		// TODO Auto-generated method stub
		treeDao.addtree(tree);
	}

	public void deltree(String id) throws Exception {
		// TODO Auto-generated method stub
		treeDao.deltree(id);
	}

	public void addTreeRoleRelation(String ids, Integer roleid) throws Exception {
		
		treeDao.deleteTreeRoleRealtion(roleid);
		
		String[] idss=ids.split(",");
		List<Map<String,Object>> maps =new ArrayList<Map<String,Object>>();
		
		for (int i = 0; i < idss.length; i++) {
			Map<String,Object> map =new HashMap<String,Object>();
			map.put("roleid", roleid);
			map.put("treeid", Integer.parseInt( idss[i].trim()));
			maps.add(map);
		}
		treeDao.addTreeRoleRelation(maps);
		
	}

	public List<Tree> queryRoleTree(String roleid) {
		// TODO Auto-generated method stub
		return treeDao.queryRoleTree(roleid);
	}

	public List<Tree> selectTreeList(Tree t) {
		
		List<Tree> list =treeDao.selectTreeList(t);

		return list;
	}

	public Set<Map<String, Object>> listtree(YuanGong yuangong) {
			
			//定义list集合接受查询的参数
			List<Map<String,Object>> list =new ArrayList<Map<String,Object>>();
			
			list = treeDao.listtree(yuangong);
			
			 Set<Map<String,Object>> obj =new HashSet<Map<String,Object>>();
			 
			 for (Map<String, Object> map : list) {
				obj.add(map);
			}
			
			return obj;
		}

}
