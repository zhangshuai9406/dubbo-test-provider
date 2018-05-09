package com.jk.dao;

import java.util.List;
import java.util.Map;

import com.jk.model.Tree;
import com.jk.model.YuanGong;

public interface TreeMapper {

	Tree querytree(String id) throws Exception;

	void addtree(Tree tree) throws Exception;

	void deltree(String id) throws Exception;

	void deleteTreeRoleRealtion(Integer roleid) throws Exception;

	void addTreeRoleRelation(List<Map<String, Object>> maps) throws Exception;

	List<Tree> queryRoleTree(String roleid);

	List<Tree> selectTreeList(Tree t);

	List<Map<String, Object>> listtree(YuanGong yuangong);

}