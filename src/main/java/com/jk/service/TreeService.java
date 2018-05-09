package com.jk.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jk.model.Tree;
import com.jk.model.YuanGong;

public interface TreeService {

	Tree querytree(String id) throws Exception;

	void addtree(Tree tree)throws Exception;

	void deltree(String id)throws Exception;

	void addTreeRoleRelation(String ids, Integer roleid)throws Exception;

	List<Tree> queryRoleTree(String roleid);

	List<Tree> selectTreeList(Tree t);

	Set<Map<String, Object>> listtree(YuanGong yuangong)throws Exception;

}
