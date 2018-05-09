package com.jk.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jk.model.YuanGong;

public interface YuanGongDao {

	Integer getCount();

	List<YuanGong> getList(@Param("start") Integer start, @Param("pageSize") Integer pageSize);

	List<Map<String, Object>> getResourcesRoleList(YuanGong yg);

	YuanGong login(YuanGong yuangong);

}
