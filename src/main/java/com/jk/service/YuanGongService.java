package com.jk.service;

import com.jk.model.YuanGong;
import com.jk.util.PageUtil;

public interface YuanGongService {

	PageUtil<YuanGong> listyuangong(PageUtil<YuanGong> pageUtil) throws Exception;

	YuanGong getResourcesRoleList(YuanGong yg) throws Exception;

	YuanGong login(YuanGong yuangong) throws Exception;

}
