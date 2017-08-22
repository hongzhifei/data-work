/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.bineng.dataWork.test.dao;

import com.bineng.dataWork.common.persistence.TreeDao;
import com.bineng.dataWork.common.persistence.annotation.MyBatisDao;
import com.bineng.dataWork.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}